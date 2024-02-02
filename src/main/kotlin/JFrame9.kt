package org.ktemployeeform

import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

public class JFrame9(
    private var panel: JPanel = JPanel(),
    private var label: JLabel = JLabel("Enter your name"),
    private var textField: JTextField = JTextField(20),
    private var button: JButton = JButton("Save"),
) : JFrame(), ActionListener {
    init {
        this.title = "JFrame9"
        this.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        this.size = Dimension(800, 500)
        this.layout = BorderLayout(10, 10)
        this.setLocationRelativeTo(null)

//        this.button.addActionListener {
//            println("Button CLicked")
//        }

        this.button.addActionListener(this)

        this.panel.add(this.label)
        this.panel.add(this.textField)
        this.panel.add(this.button)

        this.add(this.panel, BorderLayout.CENTER)

        this.isVisible = true
    }

    override fun actionPerformed(e: ActionEvent?) {
        println(if (e != null) e.actionCommand else "NO EVENT")
        println(this.textField.text)
    }
}