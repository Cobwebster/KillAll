package com.swiftpenguin.killall.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.entity.Entity;
import cn.nukkit.utils.TextFormat;
import com.swiftpenguin.killall.MainClass;

public class KillAllCmd extends Command {

    public KillAllCmd(MainClass plugin) {
        super("killall", "Purges all entities)", "/killall");
        this.setPermission("killall.use");
    }

    int amount;

    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        if (sender.hasPermission(this.getPermission()) || sender.isOp()) {

            int amount = 0;

            Player player = (Player) sender;

            for (Entity entity : player.getLevel().getEntities()) {
                if (!(entity instanceof Player)) {
                    entity.kill();
                    amount += 1;
                }
            }
            player.sendMessage(TextFormat.DARK_GREEN + "Entities removed... "+ TextFormat.RED+ " " + amount);
        }
        return true;
    }
}
