@file:Suppress("DEPRECATION")

package org.beobma.system

import org.bukkit.*
import org.bukkit.attribute.AttributeModifier
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.inventory.InventoryCloseEvent
import org.bukkit.event.inventory.InventoryType
import org.bukkit.event.player.PlayerInteractEntityEvent
import org.bukkit.inventory.EquipmentSlot
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import java.util.*
import kotlin.random.Random

class Enhance : Listener {


    //대장장이 우클릭
    @EventHandler
    fun onPlayerInteractEntity(event: PlayerInteractEntityEvent) {
        val player: Player = event.player
        val clickedEntity = event.rightClicked

        if (clickedEntity.scoreboardTags.contains("Enhance_start")) {
            openCustomInventory(player)
        }
    }

    private fun openCustomInventory(player: Player) {
        val inventory: Inventory = Bukkit.createInventory(null, 18, "${ChatColor.BOLD}장비 강화")


        //아이템 추가
        val anvilStack = ItemStack(Material.ANVIL)
        val anvil = anvilStack.itemMeta

        val inventory1Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory1 = inventory1Stack.itemMeta

        val inventory2Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory2 = inventory2Stack.itemMeta

        val inventory3Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory3 = inventory3Stack.itemMeta

        val inventory5Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory5 = inventory5Stack.itemMeta

        val inventory6Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory6 = inventory6Stack.itemMeta

        val inventory7Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory7 = inventory7Stack.itemMeta

        val inventory8Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory8 = inventory8Stack.itemMeta

        val inventory9Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory9 = inventory9Stack.itemMeta

        val inventory10Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory10 = inventory10Stack.itemMeta

        val inventory11Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory11 = inventory11Stack.itemMeta

        val inventory12Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory12 = inventory12Stack.itemMeta

        val inventory13Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory13 = inventory13Stack.itemMeta

        val inventory14Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory14 = inventory14Stack.itemMeta

        val inventory15Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory15 = inventory15Stack.itemMeta

        val inventory17Stack = ItemStack(Material.GRAY_STAINED_GLASS_PANE)
        val inventory17 = inventory17Stack.itemMeta


        val irongoldStack = ItemStack(Material.IRON_NUGGET)
        val irongold = irongoldStack.itemMeta

        val goldStack = ItemStack(Material.GOLD_NUGGET)
        val gold = goldStack.itemMeta

        anvil.setDisplayName("${ChatColor.BOLD}강화하기")
        anvilStack.itemMeta = anvil

        inventory1.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory1Stack.itemMeta = inventory1

        inventory2.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory2Stack.itemMeta = inventory2

        inventory3.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory3Stack.itemMeta = inventory3

        inventory5.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory5Stack.itemMeta = inventory5

        inventory6.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory6Stack.itemMeta = inventory6

        inventory7.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory7Stack.itemMeta = inventory7

        inventory8.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory8Stack.itemMeta = inventory8

        inventory9.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory9Stack.itemMeta = inventory9

        inventory10.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory10Stack.itemMeta = inventory10

        inventory11.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory11Stack.itemMeta = inventory11

        inventory12.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory12Stack.itemMeta = inventory12

        inventory13.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory13Stack.itemMeta = inventory13

        inventory14.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory14Stack.itemMeta = inventory14

        inventory15.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory15Stack.itemMeta = inventory15

        inventory17.setDisplayName("${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.")
        inventory17Stack.itemMeta = inventory17


        irongold.setDisplayName("${ChatColor.BOLD}은 코인")
        irongoldStack.itemMeta = irongold

        gold.setDisplayName("${ChatColor.BOLD}금 코인")
        goldStack.itemMeta = gold



        inventory.setItem(13, anvilStack)

        inventory.setItem(0, inventory17Stack)
        inventory.setItem(1, inventory1Stack)
        inventory.setItem(2, inventory2Stack)
        inventory.setItem(3, inventory3Stack)
        inventory.setItem(6, inventory5Stack)
        inventory.setItem(7, inventory6Stack)
        inventory.setItem(8, inventory7Stack)
        inventory.setItem(9, inventory8Stack)
        inventory.setItem(10, inventory9Stack)
        inventory.setItem(11, inventory10Stack)
        inventory.setItem(12, inventory11Stack)
        inventory.setItem(14, inventory13Stack)
        inventory.setItem(15, inventory14Stack)
        inventory.setItem(16, inventory15Stack)
        inventory.setItem(17, inventory12Stack)

        //인벤토리 열기
        player.openInventory(inventory)
    }

    @Suppress("DEPRECATION")
    @EventHandler
    fun onEnhanceButtonClick(event: InventoryClickEvent) {
        val inventory = event.inventory
        val clickedItem = event.currentItem
        val player = event.whoClicked as? Player


        if (clickedItem?.type == Material.ANVIL && clickedItem.itemMeta?.displayName == "${ChatColor.BOLD}강화하기") {
            if (inventory.getItem(4) == null) {
                event.isCancelled = true
                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화할 아이템을 올려주세요.")
            } else if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD || inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                event.isCancelled = true


                val level1: MutableList<String> = ArrayList()
                level1.add("${ChatColor.BOLD}${ChatColor.WHITE}★")

                val level2: MutableList<String> = ArrayList()
                level2.add("${ChatColor.BOLD}${ChatColor.WHITE}★★")

                val level3: MutableList<String> = ArrayList()
                level3.add("${ChatColor.BOLD}${ChatColor.WHITE}★★★")

                val level4: MutableList<String> = ArrayList()
                level4.add("${ChatColor.BOLD}${ChatColor.WHITE}★★★★")

                val level5: MutableList<String> = ArrayList()
                level5.add("${ChatColor.BOLD}${ChatColor.WHITE}★★★★★")

                val level6: MutableList<String> = ArrayList()
                level6.add("${ChatColor.BOLD}${ChatColor.GOLD}★★★★★★")

                val level7: MutableList<String> = ArrayList()
                level7.add("${ChatColor.BOLD}${ChatColor.GOLD}★★★★★★ ${ChatColor.WHITE}★")

                val level8: MutableList<String> = ArrayList()
                level8.add("${ChatColor.BOLD}${ChatColor.GOLD}★★★★★★ ${ChatColor.WHITE}★★")

                val level9: MutableList<String> = ArrayList()
                level9.add("${ChatColor.BOLD}${ChatColor.GOLD}★★★★★★ ${ChatColor.WHITE}★★★")

                val level10: MutableList<String> = ArrayList()
                level10.add("${ChatColor.BOLD}${ChatColor.GOLD}★★★★★★ ${ChatColor.WHITE}★★★★")

                val level11: MutableList<String> = ArrayList()
                level11.add("${ChatColor.BOLD}${ChatColor.GOLD}★★★★★★ ${ChatColor.WHITE}★★★★★")

                val level12: MutableList<String> = ArrayList()
                level12.add("${ChatColor.BOLD}${ChatColor.GOLD}★★★★★★ ★★★★★★")

                val lore1: MutableList<String> = ArrayList()
                lore1.add("${ChatColor.BOLD}${ChatColor.WHITE}0성 -> 1성")
                lore1.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 95%")
                lore1.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 5%")
                lore1.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 0%")
                lore1.add("")
                lore1.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore1.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.2")
                lore1.add("")
                lore1.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 20은 코인")
                lore1.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore2: MutableList<String> = ArrayList()
                lore2.add("${ChatColor.BOLD}${ChatColor.WHITE}1성 -> 2성")
                lore2.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 90%")
                lore2.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 10%")
                lore2.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 0%")
                lore2.add("")
                lore2.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore2.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.2")
                lore2.add("")
                lore2.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 40은 코인")
                lore2.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore3: MutableList<String> = ArrayList()
                lore3.add("${ChatColor.BOLD}${ChatColor.WHITE}2성 -> 3성")
                lore3.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 85%")
                lore3.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 15%")
                lore3.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 0%")
                lore3.add("")
                lore3.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore3.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.2")
                lore3.add("")
                lore3.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 1금 코인")
                lore3.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore4: MutableList<String> = ArrayList()
                lore4.add("${ChatColor.BOLD}${ChatColor.WHITE}3성 -> 4성")
                lore4.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 80%")
                lore4.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 20%")
                lore4.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 0%")
                lore4.add("")
                lore4.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore4.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.2")
                lore4.add("")
                lore4.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 2금 코인")
                lore4.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore5: MutableList<String> = ArrayList()
                lore5.add("${ChatColor.BOLD}${ChatColor.WHITE}4성 -> 5성")
                lore5.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 75%")
                lore5.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 25%")
                lore5.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 0%")
                lore5.add("")
                lore5.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore5.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.2")
                lore5.add("")
                lore5.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 4금 코인")
                lore5.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore6: MutableList<String> = ArrayList()
                lore6.add("${ChatColor.BOLD}${ChatColor.WHITE}5성 -> 6성")
                lore6.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 70%")
                lore6.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 30%")
                lore6.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 0%")
                lore6.add("")
                lore6.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore6.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.2")
                lore6.add("")
                lore6.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 8금 코인")
                lore6.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore7: MutableList<String> = ArrayList()
                lore7.add("${ChatColor.BOLD}${ChatColor.WHITE}6성 -> 7성")
                lore7.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 65%")
                lore7.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 30%")
                lore7.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 5%")
                lore7.add("")
                lore7.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore7.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.4")
                lore7.add("")
                lore7.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 8금 코인")
                lore7.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore8: MutableList<String> = ArrayList()
                lore8.add("${ChatColor.BOLD}${ChatColor.WHITE}7성 -> 8성")
                lore8.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 60%")
                lore8.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 35%")
                lore8.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 5%")
                lore8.add("")
                lore8.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore8.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.4")
                lore8.add("")
                lore8.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 8금 코인")
                lore8.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore9: MutableList<String> = ArrayList()
                lore9.add("${ChatColor.BOLD}${ChatColor.WHITE}8성 -> 9성")
                lore9.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 55%")
                lore9.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 40%")
                lore9.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 5%")
                lore9.add("")
                lore9.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore9.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.4")
                lore9.add("")
                lore9.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 8금 코인")
                lore9.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore10: MutableList<String> = ArrayList()
                lore10.add("${ChatColor.BOLD}${ChatColor.WHITE}9성 -> 10성")
                lore10.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 50%")
                lore10.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 45%")
                lore10.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 5%")
                lore10.add("")
                lore10.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore10.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.4")
                lore10.add("")
                lore10.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 8금 코인")
                lore10.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore11: MutableList<String> = ArrayList()
                lore11.add("${ChatColor.BOLD}${ChatColor.WHITE}10성 -> 11성")
                lore11.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 45%")
                lore11.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 50%")
                lore11.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 5%")
                lore11.add("")
                lore11.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore11.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.4")
                lore11.add("")
                lore11.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 8금 코인")
                lore11.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore12: MutableList<String> = ArrayList()
                lore12.add("${ChatColor.BOLD}${ChatColor.WHITE}11성 -> 12성")
                lore12.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 40%")
                lore12.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 60%")
                lore12.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 5%")
                lore12.add("")
                lore12.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                lore12.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.4")
                lore12.add("")
                lore12.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 8금 코인")
                lore12.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")

                val lore13: MutableList<String> = ArrayList()
                lore13.add("${ChatColor.BOLD}${ChatColor.WHITE}12성")

                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {

                    if (inventory.getItem(4)?.lore == null && inventory.getItem(13)?.lore == null) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore1

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.lore == null && inventory.getItem(13)?.lore != null) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}은 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 20
                        ) {

                            val irongoldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = irongoldamoun?.minus(20)!!

                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성
                            if (random < 0.95) {

                                val confirmationStack = ItemStack(Material.ANVIL)
                                val confirmation = confirmationStack.itemMeta
                                var modifier1: AttributeModifier? = null
                                var modifier2: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                                confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                                confirmationStack.itemMeta = confirmation
                                confirmationStack.lore = lore2
                                inventory.setItem(13, confirmationStack)

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        7.5,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                    modifier2 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_speed", // 수정자의 이름
                                        -2.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }

                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+1"
                                )
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_SPEED,
                                    modifier2!!
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level1


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 은 코인이 부족합니다.")
                        }
                    }
                    //1->2강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+1" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        val lore: MutableList<String> = ArrayList()
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}1성 -> 2성")
                        lore.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 90%")
                        lore.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 10%")
                        lore.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 0%")
                        lore.add("")
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.5")
                        lore.add("")
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 40은 코인")
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+1" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}은 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 40
                        ) {

                            val irongoldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = irongoldamoun?.minus(40)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.90) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+2"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level2
                                inventory.getItem(13)!!.lore = lore3


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 은 코인이 부족합니다.")
                        }
                    }
                    //2->3강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+2" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore3

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+2" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 1
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(1)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.85) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+3"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level3
                                inventory.getItem(13)!!.lore = lore4


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }
                    //3->4강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+3" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore4

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+3" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 2
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(2)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.80) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+4"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level4
                                inventory.getItem(13)!!.lore = lore5


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }
                    //4->5강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+4" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore5

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+4" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 4
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(4)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.75) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+5"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level5
                                inventory.getItem(13)!!.lore = lore6


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }
                    //5->6강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+5" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore6

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+5" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.70) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                val message = ("${ChatColor.GREEN}${ChatColor.BOLD}[!] 누군가가 6성 강화를 성공했습니다.")
                                sendGlobalMessage(message)
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+6"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level6
                                inventory.getItem(13)!!.lore = lore7


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //6->7강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+6" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore7

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+6" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.65) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+7"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level7
                                inventory.getItem(13)!!.lore = lore8
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //7->8강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+7" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore8

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+7" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.60) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+8"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level8
                                inventory.getItem(13)!!.lore = lore9
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //8->9강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+8" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore9

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+8" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.55) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+9"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level9
                                inventory.getItem(13)!!.lore = lore10
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //9->10강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+9" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore10

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+9" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.50) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+10"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level10
                                inventory.getItem(13)!!.lore = lore11
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //10->11강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+10" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore11

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+10" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.45) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+11"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level11
                                inventory.getItem(13)!!.lore = lore12
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //11->12강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+11" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore12

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+11" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.40) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                val message = ("${ChatColor.GREEN}${ChatColor.BOLD}[!] 누군가가 12성 강화를 성공했습니다.")
                                sendGlobalMessage(message)
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_SWORD) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 검${ChatColor.BOLD}+12"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level12
                                inventory.getItem(13)!!.lore = lore13
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //12->12강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+12" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore13

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 검${ChatColor.BOLD}+12" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 이미 최대로 강화했습니다.")
                    }
                }
                else if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {

                    if (inventory.getItem(4)?.lore == null && inventory.getItem(13)?.lore == null) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore1

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.lore == null && inventory.getItem(13)?.lore != null) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}은 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 20
                        ) {

                            val irongoldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = irongoldamoun?.minus(20)!!

                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성
                            if (random < 0.95) {

                                val confirmationStack = ItemStack(Material.ANVIL)
                                val confirmation = confirmationStack.itemMeta
                                var modifier1: AttributeModifier? = null
                                var modifier2: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                                confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                                confirmationStack.itemMeta = confirmation
                                confirmationStack.lore = lore2
                                inventory.setItem(13, confirmationStack)

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        10.5,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                    modifier2 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_speed", // 수정자의 이름
                                        -3.0,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }

                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+1"
                                )
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_SPEED,
                                    modifier2!!
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level1


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 은 코인이 부족합니다.")
                        }
                    }
                    //1->2강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+1" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        val lore: MutableList<String> = ArrayList()
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}1성 -> 2성")
                        lore.add("${ChatColor.BOLD}${ChatColor.GREEN}성공확률: 90%")
                        lore.add("${ChatColor.BOLD}${ChatColor.RED}실패확률: 10%")
                        lore.add("${ChatColor.BOLD}${ChatColor.DARK_RED}파괴확률: 0%")
                        lore.add("")
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}성공시:")
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}공격 피해: +0.5")
                        lore.add("")
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}강화 비용: 40은 코인")
                        lore.add("${ChatColor.BOLD}${ChatColor.WHITE}강화하시겠습니까?")
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+1" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}은 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 40
                        ) {

                            val irongoldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = irongoldamoun?.minus(40)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.90) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+2"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level2
                                inventory.getItem(13)!!.lore = lore3


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 은 코인이 부족합니다.")
                        }
                    }
                    //2->3강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+2" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore3

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+2" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 1
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(1)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.85) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+3"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level3
                                inventory.getItem(13)!!.lore = lore4


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }
                    //3->4강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+3" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore4

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+3" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 2
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(2)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.80) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+4"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level4
                                inventory.getItem(13)!!.lore = lore5


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }
                    //4->5강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+4" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore5

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+4" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 4
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(4)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.75) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+5"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level5
                                inventory.getItem(13)!!.lore = lore6


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }
                    //5->6강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+5" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore6

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+5" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.70) {

                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                val message = ("${ChatColor.GREEN}${ChatColor.BOLD}[!] 누군가가 6성 강화를 성공했습니다.")
                                sendGlobalMessage(message)
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.2,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+6"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level6
                                inventory.getItem(13)!!.lore = lore7


                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //6->7강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+6" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore7

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+6" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.65) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+7"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level7
                                inventory.getItem(13)!!.lore = lore8
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //7->8강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+7" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore8

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+7" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.60) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+8"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level8
                                inventory.getItem(13)!!.lore = lore9
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //8->9강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+8" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore9

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+8" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.55) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+9"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level9
                                inventory.getItem(13)!!.lore = lore10
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //9->10강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+9" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore10

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+9" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.50) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+10"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level10
                                inventory.getItem(13)!!.lore = lore11
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //10->11강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+10" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore11

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+10" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.45) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+11"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level11
                                inventory.getItem(13)!!.lore = lore12
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //11->12강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+11" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore12

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+11" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        if (inventory.getItem(5)?.itemMeta?.displayName == "${ChatColor.BOLD}금 코인" && inventory.getItem(
                                5
                            )?.amount!! >= 8
                        ) {

                            val goldamoun = inventory.getItem(5)?.amount
                            inventory.getItem(5)?.amount = goldamoun?.minus(8)!!
                            val random = Random.nextDouble() // 0.0 이상 1.0 미만의 난수 생성

                            if (random < 0.05) {
                                player?.sendMessage("${ChatColor.DARK_RED}${ChatColor.BOLD}[!] 장비가 파괴되었습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_DESTROY,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                inventory.setItem(4, null)
                                inventory.getItem(13)!!.lore = null


                            } else if (random < 0.40) {
                                var modifier1: AttributeModifier? = null

                                player?.sendMessage("${ChatColor.GREEN}${ChatColor.BOLD}[!] 강화에 성공했습니다.")
                                val message = ("${ChatColor.GREEN}${ChatColor.BOLD}[!] 누군가가 12성 강화를 성공했습니다.")
                                sendGlobalMessage(message)
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_USE,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )

                                if (inventory.getItem(4)?.type == Material.NETHERITE_AXE) {
                                    modifier1 = AttributeModifier(
                                        UUID.randomUUID(),
                                        "attack_damage", // 수정자의 이름
                                        0.4,
                                        AttributeModifier.Operation.ADD_NUMBER,
                                        EquipmentSlot.HAND
                                    )
                                }


                                val meta = inventory.getItem(4)?.itemMeta
                                meta?.addAttributeModifier(
                                    org.bukkit.attribute.Attribute.GENERIC_ATTACK_DAMAGE,
                                    modifier1!!
                                )
                                meta?.setDisplayName(
                                    "네더라이트 도끼${ChatColor.BOLD}+12"
                                )

                                inventory.getItem(4)?.itemMeta = meta
                                inventory.getItem(4)!!.lore = level12
                                inventory.getItem(13)!!.lore = lore13
                            } else {
                                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 강화에 실패했습니다.")
                                player?.playSound(
                                    player.location,
                                    Sound.BLOCK_ANVIL_LAND,
                                    SoundCategory.VOICE,
                                    1.0F,
                                    1.0F
                                )
                            }
                        } else {
                            player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 금 코인이 부족합니다.")
                        }
                    }

                    //12->12강
                    else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+12" && inventory.getItem(
                            13
                        )?.lore == null
                    ) {
                        val confirmationStack = ItemStack(Material.ANVIL)
                        val confirmation = confirmationStack.itemMeta
                        confirmation.setDisplayName("${ChatColor.BOLD}강화하기")
                        confirmationStack.itemMeta = confirmation
                        confirmationStack.lore = lore13

                        inventory.setItem(13, confirmationStack)

                    } else if (inventory.getItem(4)?.itemMeta!!.displayName == "네더라이트 도끼${ChatColor.BOLD}+12" && inventory.getItem(
                            13
                        )?.lore != null
                    ) {
                        player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 이미 최대로 강화했습니다.")
                    }
                }


            } else {
                event.isCancelled = true
                player?.sendMessage("${ChatColor.RED}${ChatColor.BOLD}[!] 네더라이트급 장비만 강화할 수 있습니다.")

            }

        } else if (clickedItem?.type == Material.GRAY_STAINED_GLASS_PANE && clickedItem.itemMeta?.displayName == "${ChatColor.BOLD}모루 위에 강화할 아이템을 넣어주세요. 남은 칸에는 강화 비용을 넣어주세요.") {
            event.isCancelled = true
        }
    }

    @EventHandler
    fun onInventoryClose(event: InventoryCloseEvent) {
        val player = event.player as? Player
        val inventory = event.inventory



        if (inventory.size == 18 && inventory.type != InventoryType.FURNACE){
            for (slot in arrayOf(4, 5)) {
                val item = inventory.getItem(slot)
                if (item != null) {
                    player?.inventory?.addItem(item)
                    inventory.clear(slot) // 아이템을 추가한 슬롯을 비움
                }
            }
        }
    }


    private fun sendGlobalMessage(message: String) {
        val coloredMessage = ChatColor.translateAlternateColorCodes('&', message)
        Bukkit.getServer().onlinePlayers.forEach { player ->
            player.sendMessage(coloredMessage)
        }
    }
}
