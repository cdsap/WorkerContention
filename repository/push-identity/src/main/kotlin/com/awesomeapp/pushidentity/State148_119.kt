package com.awesomeapp.pushidentity

sealed class State148_119 {
    data object Loading : State148_119()
    data class Success(val data: String) : State148_119()
    data class Error(val message: String) : State148_119()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}