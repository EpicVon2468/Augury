package io.github.epicvon2468.augury

import io.github.epicvon2468.augury.registry.blockentities.AuguryBlockEntities
import io.github.epicvon2468.augury.registry.blocks.AuguryBlocks
import io.github.epicvon2468.augury.registry.items.AuguryItems
import io.github.epicvon2468.augury.registry.ponders.AuguryPonders

import net.deadlydiamond98.koalalib.ToggleableContent

import net.fabricmc.loader.api.FabricLoader
import net.fabricmc.api.ModInitializer as ModInitialiser

data object Augury : ModInitialiser {

	@Suppress("UnusedExpression") // Implicitly call initialiser
	override fun onInitialize() {
		ToggleableContent.enableMagicBar()
		AuguryItems
		AuguryBlocks
		AuguryBlockEntities
		if (FabricLoader.getInstance().isModLoaded("ponder")) AuguryPonders
	}
}