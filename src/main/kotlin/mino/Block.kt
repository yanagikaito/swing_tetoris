package mino

import java.awt.Color
import java.awt.Graphics2D
import java.awt.Rectangle

class Block(var color: Color) : Rectangle() {
    companion object {

        const val SIZE: Int = 30
    }

    var blockX: Int = 0

    var blockY: Int = 0

    init {

        this.color = color
    }

    fun draw(graphics2D: Graphics2D) {

        graphics2D.color = color

        graphics2D.fillRect(x, y, SIZE, SIZE)
    }
}