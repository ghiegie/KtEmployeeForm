package org.ktemployeeform

import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

public class JFrame5(
    private val panel: JPanel = JPanel(
        GridLayout(5, 0, 10, 10)
    )
) : JFrame() {
    init {
        this.title = "JFrame5"
        this.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        this.size = Dimension(500, 500)
        this.setLocationRelativeTo(null)

        for (i in 1..30) {
            this.panel.add(JButton("Button $i"))
        }

        this.add(panel)

        this.pack()
        this.isVisible = true
    }
}