package play

import gamemain.GamePanel
import java.awt.BasicStroke
import java.awt.Color
import java.awt.Graphics2D

class PlayManager(private var gamePanel: GamePanel) {

    private val mainWidth = 360

    private val mainHeight = 600

    private var leftX: Int = 0

    private var rightX: Int = 0

    private var topY: Int = 0

    private var bottomY: Int = 0

    init {

        this.gamePanel = gamePanel

        leftX = (gamePanel.width / 2) - (mainWidth / 2)

        rightX = leftX + gamePanel.width

        topY = 50

        bottomY = topY + gamePanel.height
    }

    fun update() {


    }

    fun draw(graphics2D: Graphics2D) {

        graphics2D.color = Color.WHITE

        graphics2D.stroke = BasicStroke(4f)

        graphics2D.drawRect(leftX - 4, topY - 4, mainWidth + 8, mainHeight + 8)
    }
}