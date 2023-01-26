package cn.rayxu6.togglesprint.mixin;

import cn.rayxu6.togglesprint.Togglesprint;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(KeyBinding.class)
public class KeyBindingMixin {
    @Inject(method = "onKeyPressed", at = @At("HEAD"))
    private static void onIPressed(InputUtil.KeyCode keyCode, CallbackInfo ci) {
        if (keyCode.getKeyCode()==75) {
            Togglesprint.toggleSprintEnabled = !Togglesprint.toggleSprintEnabled;
        }
    }
}
