package com.teddyhack.module.movement;

import com.teddyhack.Client;
import com.teddyhack.module.Category;
import com.teddyhack.module.Module;
import org.lwjgl.input.Keyboard;

public class Fly extends Module {

    public Fly() {
        super("Fly", "Fly lolololo", Keyboard.KEY_R, Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        mc.player.jump();
        mc.player.capabilities.isFlying = true;
    }

    @Override
    public void onDisable() {
        mc.player.capabilities.isFlying = false;
    }

}