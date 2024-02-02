package org.ktemployeeform

import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.Font
import java.awt.TextField
import javax.swing.BorderFactory
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

public class JFrame8 : JFrame() {
    init {
        this.title = "JFrame8"
        this.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        this.size = Dimension(800, 500)
        this.layout = BorderLayout(10, 10)
        this.setLocationRelativeTo(null)
        this.iconImage = ImageIcon("src/main/resources/sample/jpg").image

        this.add(thisPanel(), BorderLayout.CENTER)

        this.isVisible = true
    }

    private fun thisPanel(): JPanel {
        val newPanel = JPanel()
        newPanel.layout = FlowLayout()
        newPanel.border = BorderFactory.createEmptyBorder(10, 10, 10,10)

        newPanel.add(thisTextField())
        newPanel.add(thisLabel())
        return newPanel
    }

    private fun thisTextField(): JTextField {
        val newTextField = JTextField(10)

        newTextField.font = Font

        return newTextField
    }

    private fun thisLabel(): JLabel {
        val newLabel = JLabel("")
        newLabel.font = Font("Arial", Font.BOLD, 24)
        return newLabel
    }
}