package io.github.epicvon2468.augury.util

import net.createmod.ponder.api.element.TextElementBuilder
import net.createmod.ponder.api.scene.SceneBuilder

fun SceneBuilder.title(sceneID: String, datagenTitle: String? = null) = this.title(sceneID, datagenTitle)

fun TextElementBuilder.text(datagenText: String? = null): TextElementBuilder = this.text(datagenText)