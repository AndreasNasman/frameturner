package com.example.framer

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class Positioning {
    var name by mutableStateOf("Walkbase Northstar")

    fun changeName(newName: String) {
        println("Changing name from $name to $newName")
        name = newName
    }
}
