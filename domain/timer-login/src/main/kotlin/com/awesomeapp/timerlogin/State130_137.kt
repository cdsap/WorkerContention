package com.awesomeapp.timerlogin

sealed class State130_137 {
    data object Loading : State130_137()
    data class Success(val data: String) : State130_137()
    data class Error(val message: String) : State130_137()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}