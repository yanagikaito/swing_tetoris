package gamemain

import play.PlayManager
import java.awt.Color
import java.awt.Dimension
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.JPanel

class GamePanel : JPanel(), Runnable {
    companion object {

        const val WIDTH: Int = 1280

        const val HEIGHT: Int = 720
    }

    private val fps: Int = 60

    private lateinit var gameThread: Thread

    private lateinit var playManager: PlayManager

    init {

        this.preferredSize = Dimension(WIDTH, HEIGHT)

        this.background = Color.BLACK

        this.layout = null

        playManager = PlayManager()
    }

    fun gameStart() {

        gameThread = Thread(this)

        gameThread.start()
    }

    override fun run() {

        /**
         * デルタまたは累積型方式
         *
         * 0.016秒ごとに画面の描画を行います。
         */

        val drawInterval = (1000000000 / fps).toDouble()
        var delta = 0.0
        var lastTime = System.nanoTime()
        var currentTime: Long

        /**
         * アップデートと描画が実行されるたびに,このdrawCountに1を追加します。
         */

        var timer: Long = 0
        var drawCount = 0

        while (gameThread != null) {

            /**
             * 1ループごとに
             *
             * updateとrepaintを実行し,
             *
             * 経過時間をtimerに追加していきます。
             */

            currentTime = System.nanoTime()
            delta += (currentTime - lastTime) / drawInterval
            timer += (currentTime - lastTime)
            lastTime = currentTime
            if (delta >= 1) {
                update()
                repaint()
                delta--
                drawCount++
            }

            if (timer >= 1000000000) {
                println("FPS:$drawCount")
                println("処理に要した時間 = $timer")
                println(timer / 1000000000)
                println("秒")
                // drawCountとtimerをリセットします。
                drawCount = 0
                timer = 0
            }
        }
    }

    private fun update() {

        playManager.update()

    }

    override fun paintComponent(graphics: Graphics) {

        super.paintComponent(graphics)

        val graphics2D = graphics as Graphics2D

        playManager.draw(graphics2D)
    }
}