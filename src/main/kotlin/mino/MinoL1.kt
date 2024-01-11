package mino

import java.awt.Color

class MinoL1() : Mino() {

    init {

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

        getB()[1].blockY = getB()[0].y - Block.SIZE

        getB()[2].blockX = getB()[0].x

        getB()[2].blockY = getB()[0].y + Block.SIZE

        getB()[3].blockX = getB()[0].x + Block.SIZE

        getB()[3].blockY = getB()[0].y + Block.SIZE
    }
}

