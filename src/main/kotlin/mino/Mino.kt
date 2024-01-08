package mino

import java.awt.Color
import java.awt.Graphics2D

class Mino {

    private val b: Array<Block> = Array(4) { Block(c = Color.BLACK) }

    private val tempB: Array<Block> = Array(4) { Block(c = Color.WHITE) }

    fun create(c: Color) {

        b[0] = Block(c)

        b[1] = Block(c)

        b[2] = Block(c)

        b[3] = Block(c)

        b[4] = Block(c)

        tempB[0] = Block(c)

        tempB[1] = Block(c)

        tempB[2] = Block(c)

        tempB[3] = Block(c)
    }

    fun setXY(x: Int, y: Int) {


    }

    fun updateXY(direction: Int) {


    }

    fun draw(graphics2D: Graphics2D) {


    }
}