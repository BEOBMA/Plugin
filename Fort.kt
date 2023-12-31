@file:Suppress("DEPRECATION")

package org.beobma.system
import org.bukkit.ChatColor
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.entity.EntityExplodeEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerItemConsumeEvent
import org.bukkit.event.weather.LightningStrikeEvent

class Fort : Listener {

    @EventHandler
    fun onEntityDamage(event: EntityDamageByEntityEvent) {
        if (event.damager is Player && event.entity is Player) {
            val attacker = event.damager as Player
            val location = attacker.location

            if (location.isInNoFortPVPZone() && !attacker.isOp) {
                @Suppress("DEPRECATION")
                attacker.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역과 그 주변에서는 다른 플레이어를 공격할 수 없습니다.")
                event.isCancelled = true
            }
        }
    }


    @EventHandler
    fun onBlockBreak(event: BlockBreakEvent) {
        val player = event.player
        val location = player.location
        val isInZone = location.isInNoFortPVPZone()
        val isPlayerOp = player.isOp

        if (isInZone && !isPlayerOp) {
            @Suppress("DEPRECATION")
            player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역과 그 주변에서는 블럭을 파괴할 수 없습니다.")
            event.isCancelled = true
        }
    }

    @EventHandler
    fun onBlockPlace(event: BlockPlaceEvent) {
        val player = event.player
        val location = player.location
        val isInZone = location.isInNoFortPVPZone()
        val isPlayerOp = player.isOp

        if (isInZone && !isPlayerOp) {
            @Suppress("DEPRECATION")
            player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역과 그 주변에서는 블럭을 설치할 수 없습니다.")
            event.isCancelled = true
        }
    }

    @EventHandler
    fun onPlayerInteract(event: PlayerInteractEvent) {
        val player = event.player
        val location = player.location
        val isInZone = location.isInNoFortPVPZone()

        if (event.action == Action.RIGHT_CLICK_AIR || event.action == Action.RIGHT_CLICK_BLOCK) {
            val itemInHand = player.inventory.itemInMainHand
            val item = itemInHand.type
            val clickedBlock = event.clickedBlock
            if (clickedBlock != null) {
                val blockType = clickedBlock.type

                if (isInZone && !player.isOp &&
                    (blockType == Material.CRAFTING_TABLE ||
                            blockType == Material.ANVIL ||
                            blockType == Material.BLAST_FURNACE ||
                            blockType == Material.COMPOSTER ||
                            blockType == Material.BREWING_STAND ||
                            blockType == Material.OAK_TRAPDOOR ||
                            blockType == Material.SPRUCE_TRAPDOOR ||
                            blockType == Material.LEVER


                            )
                ) {
                    event.isCancelled = true
                    @Suppress("DEPRECATION")
                    player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역에서 해당 블럭에 상호작용할 수 없습니다.")
                }
            }

            if (isInZone && !player.isOp &&
                restrictedFortItems.any { it.material == item }
            ) {
                event.isCancelled = true
                @Suppress("DEPRECATION")
                player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역에서 해당 아이템을 사용할 수 없습니다.")
            }
        }
    }

    @EventHandler
    fun onPlayerItemConsume(event: PlayerItemConsumeEvent) {
        val player = event.player
        val location = player.location
        val isInZone = location.isInNoFortPVPZone()

        if (isInZone && event.item.type == Material.CHORUS_FRUIT && !player.isOp) {
            event.isCancelled = true
            @Suppress("DEPRECATION")
            player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역에서 해당 아이템을 먹을 수 없습니다.")
        }
    }

    @EventHandler
    fun onEntityExplode(event: EntityExplodeEvent) {
        if (event.entity.location.isInNoFortPVPZone()) {
            event.isCancelled = true
        }
    }

    @EventHandler
    fun onLightningStrike(event: LightningStrikeEvent) {
        val strikeLocation = event.lightning.location
        if (strikeLocation.isInNoFortPVPZone()) {
            event.isCancelled = true
        }
    }

}

fun Location.isInNoFortPVPZone(): Boolean {
    val world = this.world

    // Check if the world is the overworld
    if (world != null && world.environment == World.Environment.NORMAL) {
        return (x >= 1440) && (x <= 1560) &&
                (y >= -200) && (y <= 500) &&
                (z >= -1560) && (z <= -1440)
    }
    return false
}

enum class RestrictedFortItem(val material: Material) {
    BUCKET(Material.BUCKET),
    BONE_MEAL(Material.BONE_MEAL),
    WATER_BUCKET(Material.WATER_BUCKET),
    LAVA_BUCKET(Material.LAVA_BUCKET),
    COD_BUCKET(Material.COD_BUCKET),
    SALMON_BUCKET(Material.SALMON_BUCKET),
    TADPOLE_BUCKET(Material.TADPOLE_BUCKET),
    TROPICAL_FISH_BUCKET(Material.TROPICAL_FISH_BUCKET),
    PUFFERFISH_BUCKET(Material.PUFFERFISH_BUCKET),
    AXOLOTL_BUCKET(Material.AXOLOTL_BUCKET),
    WOODEN_HOE(Material.WOODEN_HOE),
    STONE_HOE(Material.STONE_HOE),
    IRON_HOE(Material.IRON_HOE),
    GOLDEN_HOE(Material.GOLDEN_HOE),
    DIAMOND_HOE(Material.DIAMOND_HOE),
    NETHERITE_HOE(Material.NETHERITE_HOE),

    WOODEN_SHOVEL(Material.WOODEN_SHOVEL),
    STONE_SHOVEL(Material.STONE_SHOVEL),
    IRON_SHOVEL(Material.IRON_SHOVEL),
    GOLDEN_SHOVEL(Material.GOLDEN_SHOVEL),
    DIAMOND_SHOVEL(Material.DIAMOND_SHOVEL),
    NETHERITE_SHOVEL(Material.NETHERITE_SHOVEL),

    WOODEN_AXE(Material.WOODEN_AXE),
    STONE_AXE(Material.STONE_AXE),
    IRON_AXE(Material.IRON_AXE),
    GOLDEN_AXE(Material.GOLDEN_AXE),
    DIAMOND_AXE(Material.DIAMOND_AXE),
    NETHERITE_AXE(Material.NETHERITE_AXE),

    ITEM_FLAME(Material.ITEM_FRAME)
    // Add other restricted items here
}

val restrictedFortItems = setOf(
    RestrictedFortItem.BUCKET,
    RestrictedFortItem.BONE_MEAL,
    RestrictedFortItem.WATER_BUCKET,
    RestrictedFortItem.LAVA_BUCKET,
    RestrictedFortItem.COD_BUCKET,
    RestrictedFortItem.SALMON_BUCKET,
    RestrictedFortItem.TADPOLE_BUCKET,
    RestrictedFortItem.TROPICAL_FISH_BUCKET,
    RestrictedFortItem.PUFFERFISH_BUCKET,
    RestrictedFortItem.AXOLOTL_BUCKET,
    RestrictedFortItem.WOODEN_HOE,
    RestrictedFortItem.STONE_HOE,
    RestrictedFortItem.IRON_HOE,
    RestrictedFortItem.GOLDEN_HOE,
    RestrictedFortItem.DIAMOND_HOE,
    RestrictedFortItem.NETHERITE_HOE,

    RestrictedFortItem.WOODEN_SHOVEL,
    RestrictedFortItem.STONE_SHOVEL,
    RestrictedFortItem.IRON_SHOVEL,
    RestrictedFortItem.GOLDEN_SHOVEL,
    RestrictedFortItem.DIAMOND_SHOVEL,
    RestrictedFortItem.NETHERITE_SHOVEL,

    RestrictedFortItem.WOODEN_AXE,
    RestrictedFortItem.STONE_AXE,
    RestrictedFortItem.IRON_AXE,
    RestrictedFortItem.GOLDEN_AXE,
    RestrictedFortItem.DIAMOND_AXE,
    RestrictedFortItem.NETHERITE_AXE,

    RestrictedFortItem.ITEM_FLAME
    // Add other restricted items here
)
