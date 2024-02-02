package org.ktemployeeform

import java.awt.BorderLayout
import java.awt.Button
import java.awt.Color
import java.awt.Dimension
import java.awt.FlowLayout
import javax.swing.JFrame
import javax.swing.JPanel

public class JFrame1 : JFrame() {
    init {
        title = "JFrameOne"
        defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        size = Dimension(500, 400)
        isVisible = true
        setLocationRelativeTo(null)
        layout = BorderLayout(10, 5)

        val panel = JPanel()
        panel.layout = FlowLayout(FlowLayout.LEFT, 10, 5)
        panel.background = Color.RED
        panel.preferredSize = Dimension(250, 250)

        val button = Button("Button1")
        val button2 = Button("Button2")
        panel.add(button)
        panel.add(button2)

        this.add(panel, BorderLayout.WEST)
    }
}