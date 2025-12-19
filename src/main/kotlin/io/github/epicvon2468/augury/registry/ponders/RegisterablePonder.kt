package io.github.epicvon2468.augury.registry.ponders

import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper
import net.createmod.ponder.api.scene.PonderStoryBoard

import net.minecraft.util.Identifier

interface RegisterablePonder : PonderStoryBoard {

	fun registerTo(helper: PonderSceneRegistrationHelper<Identifier>)
}