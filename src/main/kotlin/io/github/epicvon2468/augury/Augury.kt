package io.github.epicvon2468.augury

import net.deadlydiamond98.koalalib.ToggleableContent

import net.fabricmc.api.ModInitializer as ModInitialiser

data object Augury : ModInitialiser {

	override fun onInitialize() {
		ToggleableContent.enableMagicBar()
	}
}