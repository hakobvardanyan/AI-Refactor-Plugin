package com.example.refactorer

import javax.swing.*
import java.awt.*

class ScrollableContent : JComponent() {

    private val textArea: JTextArea = JTextArea()

    init {
        textArea.lineWrap = true // Enable word wrap
        textArea.wrapStyleWord = true // Wrap at word boundaries

        // Add some sample text
        val sampleText = "Select piece of code then open the \"Context Menu\" and click on the \"AI Refactor\" then chose the \"Provide Refactoring\" to get suggestions"
        textArea.text = sampleText

        // Create a JScrollPane and add the JTextArea to it
        val scrollPane = JScrollPane(textArea)

        // Add the JScrollPane to this custom component
        layout = BorderLayout()
        add(scrollPane, BorderLayout.CENTER)
    }

    fun setText(text: String) {
        textArea.text = text
    }
}
