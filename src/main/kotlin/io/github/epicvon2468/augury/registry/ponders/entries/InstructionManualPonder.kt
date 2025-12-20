package io.github.epicvon2468.augury.registry.ponders.entries

import io.github.epicvon2468.augury.registry.ponders.RegisterablePonder
import io.github.epicvon2468.augury.util.title
import io.github.epicvon2468.augury.util.toIdentifier

import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper
import net.createmod.ponder.api.scene.SceneBuilder
import net.createmod.ponder.api.scene.SceneBuildingUtil

import net.minecraft.util.Identifier
import net.minecraft.util.math.Direction

class InstructionManualPonder : RegisterablePonder {

	override fun registerTo(helper: PonderSceneRegistrationHelper<Identifier>) {
		val identifier: Identifier = "manual".toIdentifier()
		helper.addStoryBoard(identifier, "manual", this).highlightAllTags()
	}

	override fun program(scene: SceneBuilder, util: SceneBuildingUtil) {
		scene.title("manual")
		scene.showBasePlate()
		scene.idle(10)
		scene.world().showSection(util.select().layersFrom(1), Direction.DOWN)
		scene.idle(30)

		scene.addKeyframe()
		scene.overlay().showText(50).sharedText("manual.welcome".toIdentifier())
		scene.idle(50)

		//

		scene.markAsFinished()
	}
}