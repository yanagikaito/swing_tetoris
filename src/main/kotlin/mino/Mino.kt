package mino

import java.awt.Color
import java.awt.Graphics2D

open class Mino {

    private var b: Array<Block> = Array(5) { Block(color = Color.RED) }

    private val tempB: Array<Block> = Array(5) { Block(color = Color.WHITE) }

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

    fun updateXY(direction: Int) {


    }

    fun draw(graphics2D: Graphics2D) {


    }

    fun getB(): Array<Block> {

        return b
    }

    fun setB(b: Array<Block>) {

        this.b = b
    }
}