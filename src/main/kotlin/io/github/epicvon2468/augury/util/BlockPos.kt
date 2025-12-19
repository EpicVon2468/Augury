package io.github.epicvon2468.augury.util

import net.createmod.ponder.api.scene.Selection
import net.createmod.ponder.api.scene.SelectionUtil

import net.minecraft.util.math.BlockPos

@JvmField val ONE: BlockPos = BlockPos(1, 1, 1)

operator fun BlockPos.times(other: BlockPos): BlockPos = BlockPos(this.x * other.x, this.y * other.y, this.z * other.z)
operator fun BlockPos.div(other: BlockPos): BlockPos = BlockPos(this.x / other.x, this.y / other.y, this.z / other.z)
operator fun BlockPos.plus(other: BlockPos): BlockPos = BlockPos(this.x + other.x, this.y + other.y, this.z + other.z)
operator fun BlockPos.minus(other: BlockPos): BlockPos = BlockPos(this.x - other.x, this.y - other.y, this.z - other.z)

operator fun BlockPos.rangeTo(that: BlockPos): BlockPosRange = BlockPosRange(this, that)
operator fun BlockPos.rangeUntil(that: BlockPos): BlockPosRange = BlockPosRange(this, that - ONE, false)

fun SelectionUtil.fromTo(range: BlockPosRange): Selection = this.fromTo(
	range.start,
	if (range.inclusive) range.endInclusive else range.endInclusive
)
fun SelectionUtil.fromTo(range: ClosedRange<BlockPos>): Selection = this.fromTo(range.start, range.endInclusive)
fun SelectionUtil.fromTo(range: OpenEndRange<BlockPos>): Selection = this.fromTo(range.start, range.endExclusive)

data class BlockPosRange(
	override val start: BlockPos,
	override val endInclusive: BlockPos,
	val inclusive: Boolean = true
) : ClosedRange<BlockPos>, OpenEndRange<BlockPos> {

	override val endExclusive: BlockPos = endInclusive + ONE

	override fun contains(value: BlockPos): Boolean = super<ClosedRange>.contains(value)

	override fun isEmpty(): Boolean = super<OpenEndRange>.isEmpty()
}