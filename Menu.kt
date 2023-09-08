@file:Suppress("DEPRECATION")

package org.beobma.system

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.inventory.InventoryCloseEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import java.util.ArrayList


class Menu : Listener{

    @EventHandler
    fun onPlayerInteract(event: PlayerInteractEvent) {
        val player = event.player
        val action = event.action
        val item = event.item

        if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
            if (player.isSneaking && player.inventory.itemInMainHand.type == Material.AIR) {
                openMenuInventory(player)
                player.addScoreboardTag("Open_Menu")
            }
        }

        if (item != null && item.type == Material.IRON_INGOT && item.itemMeta?.displayName == "${ChatColor.BOLD}수호자의 반지") {
            if (!player.scoreboardTags.contains("The_Guardian_Ring")){
                val itemAmount = item.amount
                if (itemAmount > 1) {
                    item.amount = itemAmount - 1
                } else {
                    player.inventory.removeItem(item)
                }
                player.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 수호자의 반지를 장착했습니다.")
                player.addScoreboardTag("The_Guardian_Ring")
            }
            else{
                player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 이미 반지를 장착했습니다.")
            }
        }
        if (item != null && item.type == Material.IRON_INGOT && item.itemMeta?.displayName == "${ChatColor.BOLD}수호자를 파괴한 자") {
            if (!player.scoreboardTags.contains("The_Guardian_Decoration")){
                val itemAmount = item.amount
                if (itemAmount > 1) {
                    item.amount = itemAmount - 1
                } else {
                    player.inventory.removeItem(item)
                }
                player.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 수호자를 파괴한 자 훈장을 장착했습니다.")
                player.addScoreboardTag("The_Guardian_Decoration")
            }
            else{
                player.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 이미 훈장를 장착했습니다.")
            }
        }
    }

    private fun openMenuInventory(player: Player) {
        val menu: Inventory = Bukkit.createInventory(player, 27, "${ChatColor.BOLD}장신구창")

        val inventory0Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory0 = inventory0Stack.itemMeta
        inventory0.setDisplayName("${ChatColor.BOLD}현재 장착한 장신구 목록입니다. 클릭하면 장착 해제합니다.")
        inventory0Stack.itemMeta = inventory0
        menu.setItem(18, inventory0Stack)
        menu.setItem(19, inventory0Stack)
        menu.setItem(20, inventory0Stack)
        menu.setItem(21, inventory0Stack)
        menu.setItem(22, inventory0Stack)
        menu.setItem(23, inventory0Stack)
        menu.setItem(24, inventory0Stack)
        menu.setItem(25, inventory0Stack)
        menu.setItem(26, inventory0Stack)



        val inventory1Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory1 = inventory1Stack.itemMeta
        inventory1.setDisplayName("${ChatColor.BOLD}얼굴장식")
        inventory1Stack.itemMeta = inventory1
        menu.setItem(0, inventory1Stack)


        val inventory2Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory2 = inventory2Stack.itemMeta
        inventory2.setDisplayName("${ChatColor.BOLD}눈장식")
        inventory2Stack.itemMeta = inventory2
        menu.setItem(1, inventory2Stack)
        

        val inventory3Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory3 = inventory3Stack.itemMeta
        inventory3.setDisplayName("${ChatColor.BOLD}귀고리")
        inventory3Stack.itemMeta = inventory3
        menu.setItem(2, inventory3Stack)
        

        val inventory4Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory4 = inventory4Stack.itemMeta
        inventory4.setDisplayName("${ChatColor.BOLD}어깨장식")
        inventory4Stack.itemMeta = inventory4
        menu.setItem(3, inventory4Stack)
        

        val inventory5Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory5 = inventory5Stack.itemMeta
        inventory5.setDisplayName("${ChatColor.BOLD}반지")
        inventory5Stack.itemMeta = inventory5
        menu.setItem(4, inventory5Stack)


        val inventory6Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory6 = inventory6Stack.itemMeta
        inventory6.setDisplayName("${ChatColor.BOLD}펜던트")
        inventory6Stack.itemMeta = inventory6
        menu.setItem(5, inventory6Stack)
        

        val inventory7Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory7 = inventory7Stack.itemMeta
        inventory7.setDisplayName("${ChatColor.BOLD}벨트")
        inventory7Stack.itemMeta = inventory7
        menu.setItem(6, inventory7Stack)
                

        val inventory8Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory8 = inventory8Stack.itemMeta
        inventory8.setDisplayName("${ChatColor.BOLD}훈장")
        inventory8Stack.itemMeta = inventory8
        menu.setItem(7, inventory8Stack)
               

        val inventory9Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory9 = inventory9Stack.itemMeta
        inventory9.setDisplayName("${ChatColor.BOLD}벳지")
        inventory9Stack.itemMeta = inventory9
        menu.setItem(8, inventory9Stack)


        if (player.scoreboardTags.contains("The_Guardian_Ring")) {
            val theGuardiansStack = ItemStack(Material.IRON_INGOT)
            val theGuardians = theGuardiansStack.itemMeta
            theGuardians.setCustomModelData(2000001)
            theGuardians.setDisplayName("${ChatColor.BOLD}수호자의 반지")
            theGuardiansStack.itemMeta = theGuardians
            menu.setItem(13, theGuardiansStack)

            val level1: MutableList<String> = ArrayList()
            level1.add("${ChatColor.BOLD}${ChatColor.ITALIC}수호자의 코어 일부분으로 만들어진 반지")
            level1.add("")
            level1.add("${ChatColor.BOLD}최대체력 : +2칸")

            menu.getItem(13)!!.lore = level1
        }
        if (player.scoreboardTags.contains("The_Guardian_Decoration")) {
            val theGuardiansStack = ItemStack(Material.IRON_INGOT)
            val theGuardians = theGuardiansStack.itemMeta
            theGuardians.setCustomModelData(2000002)
            theGuardians.setDisplayName("${ChatColor.BOLD}수호자를 파괴한 자")
            theGuardiansStack.itemMeta = theGuardians
            menu.setItem(16, theGuardiansStack)

            val level1: MutableList<String> = ArrayList()
            level1.add("${ChatColor.BOLD}${ChatColor.ITALIC}수호자를 파괴한 자에게 주어지는 훈장")
            level1.add("")
            level1.add("${ChatColor.BOLD}최대체력 : +1칸")

            menu.getItem(16)!!.lore = level1
        }


        player.openInventory(menu)
    }

    @EventHandler
    fun onEnhanceButtonClick(event: InventoryClickEvent) {
        val inventory = event.inventory
        val clickedItem = event.currentItem
        val player = event.whoClicked as? Player

        if (inventory.size == 27 && player?.scoreboardTags?.contains("Open_Menu") == true) {
            if (clickedItem != null) {
                if (clickedItem.type == Material.GRAY_STAINED_GLASS_PANE && clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}현재 장착한 장신구 목록입니다. 클릭하면 장착 해제합니다." || clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}얼굴장식" || clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}눈장식" || clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}귀고리" || clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}어깨장식"  || clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}반지" || clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}펜던트" || clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}벨트" || clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}훈장" || clickedItem.itemMeta?.displayName ==
                    "${ChatColor.BOLD}벳지") {
                    event.isCancelled = true
                }
                else if (clickedItem.type == Material.IRON_INGOT && clickedItem.itemMeta?.displayName =="${ChatColor.BOLD}수호자의 반지" && player.scoreboardTags.contains("The_Guardian_Ring") && inventory.getItem(13)?.itemMeta?.displayName =="${ChatColor.BOLD}수호자의 반지") {
                    val item = inventory.getItem(13)
                    player.inventory.addItem(item!!)
                    inventory.clear(13)
                    player.removeScoreboardTag("The_Guardian_Ring")
                }
                else if (clickedItem.type == Material.IRON_INGOT && clickedItem.itemMeta?.displayName =="${ChatColor.BOLD}수호자를 파괴한 자" && player.scoreboardTags.contains("The_Guardian_Decoration") && inventory.getItem(16)?.itemMeta?.displayName =="${ChatColor.BOLD}수호자를 파괴한 자") {
                    val item = inventory.getItem(16)
                    player.inventory.addItem(item!!)
                    inventory.clear(16)
                    player.removeScoreboardTag("The_Guardian_Decoration")
                }
                else{
                    event.isCancelled = true
                }
            }
        }
    }

    @EventHandler
    fun onInventoryClose(event: InventoryCloseEvent) {
        val player = event.player as? Player
        player?.removeScoreboardTag("Open_Menu")
    }
}