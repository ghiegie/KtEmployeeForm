package org.ktemployeeform

import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.Font
import java.awt.Insets
import java.awt.event.KeyEvent
import javax.swing.ImageIcon
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingConstants

public class JFrame6(
    private val panel: JPanel = JPanel(),
    private val button: JButton = JButton("Print"),
) : JFrame() {
    init {
        this.title = "JFrame6"
        this.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        this.size = Dimension(800, 500)
        this.setLocationRelativeTo(null)

        this.button.isFocusable = false
        this.button.icon = ImageIcon("src\\main\\resources\\sample.jpg")
        this.button.iconTextGap = 100
        this.button.mnemonic = KeyEvent.VK_P
        this.button.toolTipText = "Test Tooltip"
        this.button.font = Font("Arial", Font.PLAIN, 16)
        this.button.margin = Insets(10, 10, 10, 10)
        this.button.addActionListener {
            println("Print Clicked")
        }
        //this.button.isEnabled = false
        this.button.doClick() // programmatically click the button
//        this.button.verticalTextPosition = SwingConstants.BOTTOM
//        this.button.horizontalTextPosition = SwingConstants.CENTER

        this.button.verticalTextPosition = SwingConstants.CENTER
        this.button.horizontalTextPosition = SwingConstants.LEFT
        this.button.preferredSize = Dimension(200, 200)

        this.panel.add(this.button, BorderLayout.NORTH)

        this.add(this.panel, BorderLayout.CENTER)

        this.isVisible = true
    }
}