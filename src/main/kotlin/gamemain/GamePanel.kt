package gamemain

import java.awt.Color
import java.awt.Dimension
import javax.swing.JPanel

class GamePanel : JPanel(), Runnable {

    private val width: Int = 1280

    private val height: Int = 720

    private val fps: Int = 60

    private lateinit var gameThread: Thread

    init {

        this.preferredSize = Dimension(width, height)

        this.background = Color.BLACK

        this.layout = null
    }

    override fun run() {
        TODO("Not yet implemented")
    }
}