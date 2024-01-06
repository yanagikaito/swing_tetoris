package gamemain

import javax.swing.JFrame

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val window = JFrame()

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

        window.setLocationRelativeTo(null)

        // ウィンドウを画面上に表示します。
        window.isVisible = true
    }
}