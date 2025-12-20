package io.github.epicvon2468.augury.registry.ponders.entries.debug

import io.github.epicvon2468.augury.registry.ponders.RegisterablePonder
import io.github.epicvon2468.augury.util.*

import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper
import net.createmod.ponder.api.scene.SceneBuilder
import net.createmod.ponder.api.scene.SceneBuildingUtil

import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction

class TestPonder : RegisterablePonder {

	override fun registerTo(helper: PonderSceneRegistrationHelper<Identifier>) {
		helper.addStoryBoard("test".toIdentifier(), "debug/test", this).highlightAllTags()
	}

	override fun program(scene: SceneBuilder, util: SceneBuildingUtil) {
		// The "default" translation is en-US (ew) and doesn't even work.  Literally, null can be passed safely, manual translations don't work.
		// The "default" translation stuff is related entirely to datagen.
		scene.title("test")
		scene.showBasePlate()
		scene.idle(10)
		scene.world().showSection(util.select().layersFrom(1), Direction.DOWN)
		scene.idle(30)

		scene.addKeyframe()
		scene.overlay().showText(1000).independent(40).sharedText("test.message_1".toIdentifier())
		scene.overlay().showText(1000).independent(20).sharedText("test.message_2".toIdentifier())
		scene.overlay().showText(1000).independent().sharedText("test.message_3".toIdentifier())
		scene.idle(30)

		scene.addKeyframe()
		scene.overlay().showOutlineWithText(util.select().fromTo(BlockPos(2, 1, 1)..BlockPos(4, 1, 1)), 20).text()
		scene.idle(30)

		scene.addKeyframe()
		scene.overlay().showOutlineWithText(util.select().fromTo(BlockPos(2, 1, 1)..<BlockPos(5, 2, 2)), 20).text()
		scene.idle(30)

		scene.markAsFinished()
	}
}