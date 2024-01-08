package mino

import java.awt.Color

private val Block.blockSize: Any
    get() {
        TODO("Not yet implemented")
    }

class MinoL1(private var block: Block) : Mino() {

    init {

        this.block = block

        create(Color.orange)
    }

    override fun setXY(x: Int, y: Int) {

        getB()[0].x = x

        getB()[1].y = y

        getB()[1].x = getB()[0].x

        getB()[1].y = getB()[0].y - block.blockSize

        getB()[2].x = getB()[0].x

        getB()[2].y = getB()[0].y + block.blockSize

        getB()[3].x = getB()[0].x + block.blockSize

        getB()[3].y = getB()[0].y + block.blockSize
    }
}

private operator fun Int.minus(blockSize: Any): Int {

    return blockSize as Int
}

private operator fun Int.plus(blockSize: Any): Int {

    return blockSize as Int
}

