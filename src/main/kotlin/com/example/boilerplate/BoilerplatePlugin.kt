package com.example.boilerplate

import org.bukkit.plugin.java.JavaPlugin

class BoilerplatePlugin : JavaPlugin() {
    override fun onEnable() = logger.info("Boilerplate plugin started")
    override fun onDisable() = logger.info("Boilerplate plugin stopped")
}