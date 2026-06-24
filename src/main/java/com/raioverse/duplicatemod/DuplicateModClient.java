package com.raioverse.duplicatemod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class DuplicateModClient implements ClientModInitializer {

	private static KeyBinding duplicateKey;

	@Override
	public void onInitializeClient() {
		// Registrar a tecla Z para duplicar
		dplicateKey = KeyBindingHelper.registerKeyBinding(
			new KeyBinding(
				"key.duplicate.duplicate",
				InputUtil.Type.KEYSYM,
				GLFW.GLFW_KEY_Z,
				"key.categories.misc"
			)
		);

		// Registrar o evento de tick do cliente
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (duplicateKey.wasPressed()) {
				DuplicateHandler.handleDuplicate(client);
			}
		});
	}
}
