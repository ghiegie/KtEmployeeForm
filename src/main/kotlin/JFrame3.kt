package org.ktemployeeform

import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JButton
import javax.swing.JFrame

public class JFrame3 : JFrame() {
    init {
        title = "JFrame3"
        defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        size = Dimension(800, 500)
        setLocationRelativeTo(null)
        isVisible = true

        layout = BorderLayout(5, 5)
        add(JButton("North"), BorderLayout.NORTH)
        add(JButton("West"), BorderLayout.WEST)
        add(JButton("East"), BorderLayout.EAST)
        add(JButton("South"), BorderLayout.SOUTH)
        add(JButton("Center"), BorderLayout.CENTER)
    }
}