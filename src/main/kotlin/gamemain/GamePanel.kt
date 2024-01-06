package gamemain

import java.awt.Color
import java.awt.Dimension
import javax.swing.JPanel

class GamePanel : JPanel() {

    private val width: Int = 1280

    private val height: Int = 720

    init {

        this.preferredSize = Dimension(width, height)

        this.background = Color.BLACK

        this.layout = null
    }
}