package mino

import java.awt.Color
import java.awt.Graphics2D

open class Mino {

    private var b: Array<Block> = Array(5) { Block(Color.ORANGE) }

    private val tempB: Array<Block> = Array(5) { Block(Color.ORANGE) }


    fun create(color: Color) {

        b[0] = Block(color)

        b[1] = Block(color)

        b[2] = Block(color)

        b[3] = Block(color)

        b[4] = Block(color)

        tempB[0] = Block(color)

        tempB[1] = Block(color)

        tempB[2] = Block(color)

        tempB[3] = Block(color)
    }

    open fun setXY(x: Int, y: Int) {


    }

    fun updateXY() {


    }

    fun draw(graphics2D: Graphics2D) {

        graphics2D.color = b[0].color

        graphics2D.fillRect(b[0].blockX, b[0].blockY, Block.SIZE, Block.SIZE)

        graphics2D.fillRect(b[1].blockX, b[1].blockY, Block.SIZE, Block.SIZE)

        graphics2D.fillRect(b[2].blockX, b[2].blockY, Block.SIZE, Block.SIZE)

        graphics2D.fillRect(b[3].blockX, b[3].blockY, Block.SIZE, Block.SIZE)
    }

    fun getB(): Array<Block> {

        return b
    }

    fun setB(b: Array<Block>) {

        this.b = b
    }
}