package play

import gamemain.GamePanel
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

        rightX = leftX + mainWidth

        topY = 50

        bottomY = topY + mainHeight
    }

    fun update() {


    }

    fun draw(graphics2D: Graphics2D) {


    }
}