@file:Suppress("DEPRECATION")

package org.beobma.system
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class System : JavaPlugin(), Listener {

    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
        server.pluginManager.registerEvents(Town(), this)
        server.pluginManager.registerEvents(Fort(), this)
        server.pluginManager.registerEvents(Enhance(), this)
        server.pluginManager.registerEvents(Menu(), this)
        server.pluginManager.registerEvents(Bulesky0504(), this)

        Bukkit.getConsoleSender().sendMessage("시스템이 활성화되었습니다.")

    }

    override fun onDisable() {
        Bukkit.getConsoleSender().sendMessage("시스템이 비활성화되었습니다.")
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val player = event.player
        player.sendMessage("${ChatColor.BOLD}\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n[!] 현재 통화 교환 기간입니다.\n[!] 이 기간동안 구 통화를 환전소에서 신 통화로 교환하지 않으면 이전 통화의 가치는 사라집니다.")
    }
}