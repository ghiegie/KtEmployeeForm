package org.ktemployeeform

import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.util.*
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingConstants

public class JFrame1 : JFrame() {
    init {
        this.defaultCloseOperation = DISPOSE_ON_CLOSE
        this.minimumSize = Dimension(400, 400)
        this.title = "JFrame1"
        this.layout = BorderLayout()
        this.setLocationRelativeTo(null)

        val panel = JPanel()
        panel.layout = FlowLayout()
        panel.background = Color.RED

        val button = JButton("Test")
        button.actionCommand = "test"
        button.addActionListener {
            if (Objects.equals("test", it?.actionCommand)) {
                println("Print on Console")
            }
        }

        panel.add(button)

        this.contentPane.add(panel, BorderLayout.CENTER)

        initialize()
    }

    private fun initialize() {
        this.isVisible = true
    }
}