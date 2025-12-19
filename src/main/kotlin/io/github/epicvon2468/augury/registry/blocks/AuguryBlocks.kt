package io.github.epicvon2468.augury.registry.blocks

import io.github.epicvon2468.augury.util.toIdentifier

import net.minecraft.block.Block
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

// TODO: See ConduitBlockEntity.java
data object AuguryBlocks {

	@JvmStatic
	fun <T : Block> registerBlock(identifier: String, block: T): T = Registry.register(Registries.BLOCK, identifier.toIdentifier(), block)
}