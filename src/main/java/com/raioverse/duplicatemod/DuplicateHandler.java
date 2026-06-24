package com.raioverse.duplicatemod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

public class DuplicateHandler {

	public static void handleDuplicate(MinecraftClient client) {
		// Verificar se o cliente está em um mundo
		if (client.world == null || client.player == null) {
			return;
		}

		PlayerEntity player = client.player;
		ItemStack mainHandStack = player.getMainHandStack();

		// Verificar se há um item na mão
		if (mainHandStack.isEmpty()) {
			printMessage(player, "§c[Duplicate] Nenhum item na mão!");
			return;
		}

		// Verificar se pode duplicar (máximo de 64 stacks)
		if (mainHandStack.getCount() >= mainHandStack.getMaxCount()) {
			printMessage(player, "§c[Duplicate] Limite de stack atingido!");
			return;
		}

		// Duplicar o item
		int currentCount = mainHandStack.getCount();
		int maxCount = mainHandStack.getMaxCount();
		
		if (currentCount < maxCount) {
			mainHandStack.increment(1);
			printMessage(player, "§a[Duplicate] Item duplicado! Quantidade: " + mainHandStack.getCount());
		}
	}

	private static void printMessage(PlayerEntity player, String message) {
		if (player != null) {
			player.sendMessage(
				net.minecraft.text.Text.of(message),
				true // Chat acima da barra de ação (action bar)
			);
		}
	}
}
