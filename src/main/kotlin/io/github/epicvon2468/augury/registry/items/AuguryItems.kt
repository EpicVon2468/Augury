package io.github.epicvon2468.augury.registry.items

import io.github.epicvon2468.augury.util.MOD_ID

import net.fabricmc.fabric.api.item.v1.FabricItemSettings

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

data object AuguryItems {

	@JvmField
	val TEST: Item = registerItem("test", Item(FabricItemSettings()))

	@JvmStatic
	fun <T : Item> registerItem(identifier: String, item: T): T = Registry.register(Registries.ITEM, Identifier(MOD_ID, identifier), item)
}