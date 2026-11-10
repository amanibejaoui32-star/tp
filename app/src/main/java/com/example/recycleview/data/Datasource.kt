package com.example.recycleview.data

import com.example.recycleview.model.Word
import java.util.LinkedList

class DataSource {
    fun loadWords(): LinkedList<Word> {
        // Mettre les données initiales dans la liste de mots.
        val wordList = LinkedList<Word>()
        for (i in 0 until 20) {
            wordList.addLast(Word("Word $i"))
        }
        return wordList
    }}
