package mino

import java.awt.Color

private val Block.blockSize: Any
    get() {

        return 30
    }

class MinoL1(private var block: Block) : Mino() {

    init {

        this.block = block

        create(Color.orange)
    }

    override fun setXY(x: Int, y: Int) {

        /*    y
        *     o
        * x   o
        *     o o
         */

        getB()[0].blockX = x

        getB()[1].blockY = y

        getB()[1].blockX = getB()[0].x

        getB()[1].blockY = getB()[0].y - block.blockSize

        getB()[2].blockX = getB()[0].x

        getB()[2].blockY = getB()[0].y + block.blockSize

        getB()[3].blockX = getB()[0].x + block.blockSize

        getB()[3].blockY = getB()[0].y + block.blockSize
    }
}

private operator fun Int.minus(blockSize: Any): Int {

    return blockSize as Int
}

private operator fun Int.plus(blockSize: Any): Int {

    return blockSize as Int
}

