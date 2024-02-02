package org.ktemployeeform

import java.awt.BorderLayout
import java.awt.Color
import java.awt.Dimension
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

class JFrame4(
    private val panel: JPanel = JPanel(FlowLayout(
        FlowLayout.CENTER,
        10,
        5
    ))
) : JFrame() {
    init {
        panel.background = Color.PINK

        for (i in 1..5) {
            panel.add(JButton("Button $i"))
        }

        title = "JFrame4"
        layout = BorderLayout()
        defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        size = Dimension(800, 500)
        setLocationRelativeTo(null)

        add(panel, BorderLayout.NORTH)

        isVisible = true
    }
}