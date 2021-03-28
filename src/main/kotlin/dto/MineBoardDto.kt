package dto

import domain.Block
import domain.MineBoard

data class MineBoardDto(val board: List<List<Char>>) {
    constructor(mineBoard: MineBoard) : this(mineBoard.toView())
}

private fun MineBoard.toView(): List<List<Char>> {
    val board = this.value
    val width = board.keys.maxBy { it.x }!!.x

    return board.toSortedMap()
        .map { it.value }
        .map { it.toView() }
        .windowed(size = width, step = width)
}

private fun Block.toView(): Char {
    return when (this) {
        Block.MINE -> '■'
        Block.NOTHING -> '□'
    }
}
