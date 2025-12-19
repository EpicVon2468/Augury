package io.github.epicvon2468.augury.registry.items

import io.github.epicvon2468.augury.util.toIdentifier

import net.fabricmc.fabric.api.item.v1.FabricItemSettings

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

data object AuguryItems {

	@JvmField
	val TEST: Item = registerItem("test", Item(FabricItemSettings()))

	@JvmStatic
	fun <T : Item> registerItem(identifier: String, item: T): T = Registry.register(Registries.ITEM, identifier.toIdentifier(), item)
}