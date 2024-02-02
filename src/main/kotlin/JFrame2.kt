package org.ktemployeeform

import java.awt.Dimension
import javax.swing.JFrame

public class JFrame2(private val frame: JFrame = JFrame()) {
    init {
        this.frame.title = "JFrameTwo"
        this.frame.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        this.frame.size = Dimension(500, 400)
        this.frame.setLocationRelativeTo(null)
        this.frame.isResizable = false
        this.frame.isVisible = true
    }
}