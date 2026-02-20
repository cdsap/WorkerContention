package com.awesomeapp.task

sealed class State28_158 {
    data object Loading : State28_158()
    data class Success(val data: String) : State28_158()
    data class Error(val message: String) : State28_158()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}