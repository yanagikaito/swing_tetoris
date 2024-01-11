package play

import gamemain.GamePanel
import mino.Block
import mino.Mino
import mino.MinoL1
import java.awt.BasicStroke
import java.awt.Color
import java.awt.Font
import java.awt.Graphics2D
import java.awt.RenderingHints

class PlayManager {
    companion object {

        private var leftX: Int = 0

        private var rightX: Int = 0

        private var topY: Int = 0

        private var bottomY: Int = 0

        private var MINO_START_X = 0

        private var MINO_START_Y = 0

    }

    private val mainWidth = 360

    private val mainHeight = 600

    private lateinit var currentMino: Mino

    init {

        leftX = (GamePanel.WIDTH / 2) - (mainWidth / 2)

        rightX = leftX + GamePanel.WIDTH

        topY = 50

        bottomY = topY + GamePanel.HEIGHT

        MINO_START_X = leftX + (mainWidth / 2) - Block.SIZE

        MINO_START_Y = topY + Block.SIZE

        currentMino = MinoL1()

        currentMino.setXY(MINO_START_X, MINO_START_Y)
    }

    fun update(): Unit {

        currentMino.updateXY()

    }

    fun draw(graphics2D: Graphics2D) {

        graphics2D.color = Color.WHITE

        graphics2D.stroke = BasicStroke(4f)

        graphics2D.drawRect(leftX - 4, topY - 4, mainWidth + 8, mainHeight + 8)

        val x: Int = rightX + 100

        val y: Int = bottomY - 200

        graphics2D.drawRect(x, y, 200, 200)

        graphics2D.font = Font("アリアル", Font.PLAIN, 30)

        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON)

        graphics2D.drawString("NEXT", rightX + 60, bottomY + 60)

        if (currentMino != null) {

            currentMino.draw(graphics2D)
        }
    }
}
