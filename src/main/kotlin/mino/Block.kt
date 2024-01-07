package mino

import java.awt.Color
import java.awt.Graphics2D
import java.awt.Rectangle

class Block(private var c: Color) : Rectangle() {

    private val x: Int = 0

    private val y: Int = 0

    private val size: Int = 30

    init {

        this.c = c
    }

    fun draw(graphics2D: Graphics2D) {

        graphics2D.color = c

        graphics2D.fillRect(x, y, size, size)
    }
}