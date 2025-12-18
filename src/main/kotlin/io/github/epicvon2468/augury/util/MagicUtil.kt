@file:Suppress("NOTHING_TO_INLINE")
package io.github.epicvon2468.augury.util

import net.deadlydiamond98.koalalib.util.magic.MagicBarHelper

import net.minecraft.entity.LivingEntity

inline fun LivingEntity.getMana(): Int = MagicBarHelper.getMana(this)

inline fun LivingEntity.getMaxMana(): Int = MagicBarHelper.getMaxMana(this)

inline fun LivingEntity.setMana(amount: Int) = MagicBarHelper.setMana(this, amount)

inline fun LivingEntity.setMaxMana(amount: Int) = MagicBarHelper.setMaxMana(this, amount)

inline fun LivingEntity.addMana(amount: Int) = MagicBarHelper.addMana(this, amount)

inline fun LivingEntity.increaseMaxMana(
	amount: Int,
	replenish: Boolean = false
) = MagicBarHelper.increaseMaxMana(this, amount, replenish)

inline fun LivingEntity.decreaseMaxMana(amount: Int) = MagicBarHelper.decreaseMaxMana(this, amount)