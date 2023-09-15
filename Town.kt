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

class Town : Listener {

//지정된 지역에서 피해를 입히는 것을 차단합니다.
    @EventHandler
    fun onEntityDamage(event: EntityDamageByEntityEvent) {
        if (event.damager is Player && event.entity is Player) {
            val attacker = event.damager as Player
            val location = attacker.location

            if (location.isInNoPVPZone() && !attacker.isOp) {
                @Suppress("DEPRECATION")
                attacker.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역과 그 주변에서는 다른 플레이어를 공격할 수 없습니다.")
                event.isCancelled = true
            }
        }
    }


//지정된 구역 내에서 블럭이 파괴될 때, 그 행동을 취소합니다.
    @EventHandler
    fun onBlockBreak(event: BlockBreakEvent) {
        val player = event.player
        val location = player.location
        val isInZone = location.isInNoPVPZone()
        val isPlayerOp = player.isOp

        if (isInZone && !isPlayerOp) {
            @Suppress("DEPRECATION")
            player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역과 그 주변에서는 블럭을 파괴할 수 없습니다.")
            event.isCancelled = true
        }
    }

//지정된 지역 내에서 블럭이 설치될 때, 그 행동을 취소시킵니다.
    @EventHandler
    fun onBlockPlace(event: BlockPlaceEvent) {
        val player = event.player
        val location = player.location
        val isInZone = location.isInNoPVPZone()
        val isPlayerOp = player.isOp

        if (isInZone && !isPlayerOp) {
            @Suppress("DEPRECATION")
            player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역과 그 주변에서는 블럭을 설치할 수 없습니다.")
            event.isCancelled = true
        }
    }

//지정된 구역 내에서 다른 지정된 블럭에 상로작용 하는 것을 막습니다.
    @EventHandler
    fun onPlayerInteract(event: PlayerInteractEvent) {
        val player = event.player
        val location = player.location
        val isInZone = location.isInNoPVPZone()

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
                     blockType == Material.SPRUCE_TRAPDOOR


                     )
                ) {
                    event.isCancelled = true
                    @Suppress("DEPRECATION")
                    player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역에서 해당 블럭에 상호작용할 수 없습니다.")
                }
            }

//또한, item 리스트에 포함된 아이템의 사용도 막습니다.
            if (isInZone && !player.isOp &&
                restrictedItems.any { it.material == item }
            ) {
                event.isCancelled = true
                @Suppress("DEPRECATION")
                player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역에서 해당 아이템을 사용할 수 없습니다.")
            }
        }
    }

//플레이어가 섭취하는 음식중, 후렴과가 포함되었다면 그 행동을 취소시킵니다.
    @EventHandler
    fun onPlayerItemConsume(event: PlayerItemConsumeEvent) {
        val player = event.player
        val location = player.location
        val isInZone = location.isInNoPVPZone()

        if (isInZone && event.item.type == Material.CHORUS_FRUIT && !player.isOp) {
            event.isCancelled = true
            @Suppress("DEPRECATION")
            player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 안전 구역에서 해당 아이템을 먹을 수 없습니다.")
        }
    }

//구역 내에서 모든 종류의 폭발을 취소시킵니다.
    @EventHandler
    fun onEntityExplode(event: EntityExplodeEvent) {
        if (event.entity.location.isInNoPVPZone()) {
            event.isCancelled = true
        }
    }

//구역 내에 번개가 칠 때, 취소시킵니다.
    @EventHandler
    fun onLightningStrike(event: LightningStrikeEvent) {
        val strikeLocation = event.lightning.location
        if (strikeLocation.isInNoPVPZone()) {
            event.isCancelled = true
        }
    }

}

// "지정된 지역"을 정의합니다.
fun Location.isInNoPVPZone(): Boolean {
    val world = this.world

    // 월드를 노말 월드로 설정합니다.
    if (world != null && world.environment == World.Environment.NORMAL) {
        return x >= -61 && x <= 61 &&
                y >= -200 && y <= 500 &&
                z >= -51 && z <= 61
    }
    return false
}

// "지정된 아이템"을 정의합니다.
enum class RestrictedItem(val material: Material) {
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

val restrictedItems = setOf(
    RestrictedItem.BUCKET,
    RestrictedItem.BONE_MEAL,
    RestrictedItem.WATER_BUCKET,
    RestrictedItem.LAVA_BUCKET,
    RestrictedItem.COD_BUCKET,
    RestrictedItem.SALMON_BUCKET,
    RestrictedItem.TADPOLE_BUCKET,
    RestrictedItem.TROPICAL_FISH_BUCKET,
    RestrictedItem.PUFFERFISH_BUCKET,
    RestrictedItem.AXOLOTL_BUCKET,
    RestrictedItem.WOODEN_HOE,
    RestrictedItem.STONE_HOE,
    RestrictedItem.IRON_HOE,
    RestrictedItem.GOLDEN_HOE,
    RestrictedItem.DIAMOND_HOE,
    RestrictedItem.NETHERITE_HOE,

    RestrictedItem.WOODEN_SHOVEL,
    RestrictedItem.STONE_SHOVEL,
    RestrictedItem.IRON_SHOVEL,
    RestrictedItem.GOLDEN_SHOVEL,
    RestrictedItem.DIAMOND_SHOVEL,
    RestrictedItem.NETHERITE_SHOVEL,

    RestrictedItem.WOODEN_AXE,
    RestrictedItem.STONE_AXE,
    RestrictedItem.IRON_AXE,
    RestrictedItem.GOLDEN_AXE,
    RestrictedItem.DIAMOND_AXE,
    RestrictedItem.NETHERITE_AXE,

    RestrictedItem.ITEM_FLAME
    // Add other restricted items here
)
