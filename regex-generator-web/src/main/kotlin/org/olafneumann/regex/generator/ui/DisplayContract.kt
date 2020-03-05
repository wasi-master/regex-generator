package org.olafneumann.regex.generator.ui

import org.olafneumann.regex.generator.regex.RecognizerCombiner
import org.olafneumann.regex.generator.regex.RecognizerMatch

interface DisplayContract {
    interface View {
        var inputText: String
        var displayText: String
        var resultText: String

        val options: RecognizerCombiner.Options

        fun hideCopyButton()
        fun selectInputText()
        fun showResults(matches: Collection<RecognizerMatchPresentation>)

        fun showUserGuide(initialStep: Boolean)
        fun showGeneratedCodeForPattern(pattern: String)
    }

    interface Presenter {
        fun onButtonCopyClick()
        fun onButtonHelpClick()
        fun onInputChanges(newInput: String)
        fun onSuggestionClick(match: RecognizerMatchPresentation)
        fun onOptionsChange(options: RecognizerCombiner.Options)
    }
}

