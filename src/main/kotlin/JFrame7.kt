package org.ktemployeeform

import java.awt.BorderLayout
import java.awt.Color
import java.awt.Dimension
import java.awt.Font
import java.awt.event.ActionListener
import javax.swing.BorderFactory
import javax.swing.ImageIcon
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.SwingConstants

public class JFrame7(
    private val panel: JPanel = JPanel(),
    private val label: JLabel = JLabel("Test Label"),
    private val button: JButton = JButton("Update Label Text")
) : JFrame() {
    init {
        this.title = "JFrame7"
        this.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        this.size = Dimension(800, 500)
        this.setLocationRelativeTo(null)

        this.panel.border = BorderFactory.createEmptyBorder(10, 10, 10, 10)
        this.panel.background = Color.GRAY

        this.label.foreground = Color.WHITE
        this.label.font = Font("Sans-serif", Font.BOLD, 36)
        this.label.icon = ImageIcon("src/main/resources/sample.jpg")
        this.label.iconTextGap = 10
        this.label.horizontalTextPosition = SwingConstants.CENTER
        this.label.verticalTextPosition = SwingConstants.BOTTOM

        this.button.addActionListener {
            label.text = "<html>TEST<br>ANOTHER</html>"
        }

        this.panel.add(this.label)
        this.add(this.button, BorderLayout.SOUTH)
        this.add(this.panel, BorderLayout.NORTH)


        this.isVisible = true
    }
}