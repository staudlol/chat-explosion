package io.github.staudlol.explosion.command

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object ExplosionCommand : CommandExecutor
{
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean
    {
        if (sender !is Player)
        {
            sender.sendMessage("${ChatColor.RED}You must be a player to execute this command!")
            return true
        }

        sender.world.createExplosion(sender.location, 4.0f)
        return true
    }
}