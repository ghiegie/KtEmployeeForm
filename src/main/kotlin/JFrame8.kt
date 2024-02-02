package org.ktemployeeform

import java.awt.*
import java.awt.event.ActionListener
import javax.swing.BorderFactory
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

public class JFrame8(
    private val label: JLabel = JLabel()
) : JFrame() {
    init {
        this.title = "JFrame8"
        this.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        this.size = Dimension(800, 500)
        this.layout = BorderLayout(10, 10)
        this.setLocationRelativeTo(null)
        this.iconImage = ImageIcon("src/main/resources/sample/jpg").image

        this.label.font = Font("Arial", Font.BOLD, 24)

        this.add(thisPanel(), BorderLayout.CENTER)

        this.isVisible = true
    }

    private fun thisPanel(): JPanel {
        val newPanel = JPanel()
        newPanel.layout = FlowLayout()
        newPanel.border = BorderFactory.createEmptyBorder(10, 10, 10,10)

        newPanel.add(thisTextField())
        newPanel.add(this.label)
        return newPanel
    }

    private fun thisTextField(): JTextField {
        val newTextField = JTextField(10)

        newTextField.font = Font("Arial", Font.BOLD, 24)
        newTextField.foreground = Color.BLUE
        newTextField.background = Color.YELLOW
        newTextField.toolTipText = "Enter Text"
        newTextField.margin = Insets(5, 10, 5, 10)
        newTextField.addActionListener {
            this.label.text = newTextField.text
            newTextField.text = "Enter More..."
        }

        return newTextField
    }
}