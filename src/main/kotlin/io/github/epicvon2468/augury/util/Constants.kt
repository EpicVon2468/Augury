package io.github.epicvon2468.augury.util

import net.minecraft.util.Identifier

const val MOD_ID: String = "augury"

fun String.toIdentifier(namespace: String = MOD_ID): Identifier = Identifier(MOD_ID, this)