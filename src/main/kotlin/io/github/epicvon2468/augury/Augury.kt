package io.github.epicvon2468.augury

import io.github.epicvon2468.augury.registry.items.AuguryItems

import net.deadlydiamond98.koalalib.ToggleableContent

import net.fabricmc.api.ModInitializer as ModInitialiser

data object Augury : ModInitialiser {

	@Suppress("UnusedExpression") // Implicitly call initialiser
	override fun onInitialize() {
		ToggleableContent.enableMagicBar()
		AuguryItems
	}
}