package com.unaaagy.statecounter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _count: MutableState<Int> = mutableIntStateOf(0)
    val count: State<Int> = _count

    fun incrementCount() {
        _count.value++
    }

    fun decrementCount() {
        _count.value--
    }
}