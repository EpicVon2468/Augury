package io.github.epicvon2468.augury.registry.blocks

import io.github.epicvon2468.augury.util.MOD_ID

import net.minecraft.block.Block
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

// TODO: See ConduitBlockEntity.java
data object AuguryBlocks {

	@JvmStatic
	fun <T : Block> registerBlock(identifier: String, block: T) = Registry.register(Registries.BLOCK, Identifier(MOD_ID, identifier), block)
}