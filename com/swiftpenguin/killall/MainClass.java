package com.swiftpenguin.killall;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import com.swiftpenguin.killall.commands.KillAllCmd;

public class MainClass extends PluginBase {

    @Override
    public void onEnable(){
        this.getLogger().info(TextFormat.DARK_GREEN + "KillAll by Cobwebster: Version" + getDescription().getVersion());
        this.getServer().getCommandMap().register("killall", new KillAllCmd(this));
    }
}
