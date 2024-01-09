package mino

import java.awt.Color
import java.awt.Graphics2D
import java.awt.Rectangle

class Block(var color: Color) : Rectangle() {

    var blockX: Int = 0

    var blockY: Int = 0

    private var blockSize: Int = 30

    init {

        this.color = color
    }

    fun draw(graphics2D: Graphics2D) {

        graphics2D.color = color

        graphics2D.fillRect(x, y, blockSize, blockSize)
    }

    fun getBlockSize(): Int {

        return blockSize
    }

    fun setBlockSize(blockSize: Int) {

        this.blockSize = blockSize
    }
}