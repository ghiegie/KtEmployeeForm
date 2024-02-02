package org.ktemployeeform

import java.awt.Dimension
import javax.swing.JFrame

public class MainWindow(private val window: JFrame = JFrame()) {
    init {
        window.title = "Test Title"
        window.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        window.size = Dimension(800, 500)
        window.setLocationRelativeTo(null)
    }
    public fun show() {
        window.isVisible = true
    }
}