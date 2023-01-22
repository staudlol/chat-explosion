package io.github.staudlol.explosion

import io.github.staudlol.explosion.command.ExplosionCommand
import org.bukkit.plugin.java.JavaPlugin

class ExplosionSpigotPlugin : JavaPlugin()
{

    override fun onEnable()
    {
        logger.info("ExplosionSpigotPlugin has been enabled!")

        this.getCommand("explosion")
            .executor = ExplosionCommand
    }
}