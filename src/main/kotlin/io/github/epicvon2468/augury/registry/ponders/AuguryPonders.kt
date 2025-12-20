package io.github.epicvon2468.augury.registry.ponders

import io.github.epicvon2468.augury.registry.ponders.entries.InstructionManualPonder
import io.github.epicvon2468.augury.registry.ponders.entries.debug.TestPonder
import io.github.epicvon2468.augury.util.MOD_ID

import net.createmod.ponder.api.registration.PonderPlugin
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper
import net.createmod.ponder.foundation.PonderIndex

import net.fabricmc.loader.api.FabricLoader

import net.minecraft.util.Identifier

data object AuguryPonders : PonderPlugin {

	private val ponders: MutableList<RegisterablePonder> = mutableListOf()

	@JvmStatic
	fun registerPonder(ponder: RegisterablePonder): Boolean = this.ponders.add(ponder)

	override fun getModId(): String = MOD_ID

	init {
		println("Ponder detected!  AuguryPonders adding self to PonderIndex!")
		PonderIndex.addPlugin(this)
		this.registerPonder(InstructionManualPonder())
		if (FabricLoader.getInstance().isDevelopmentEnvironment) {
			this.registerPonder(TestPonder())
		}
	}

	override fun registerScenes(helper: PonderSceneRegistrationHelper<Identifier>) {
		super.registerScenes(helper)
		for (ponder: RegisterablePonder in this.ponders) ponder.registerTo(helper)
	}
}