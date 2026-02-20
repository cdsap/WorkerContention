package com.awesomeapp.timeridentity

sealed class State179_84 {
    data object Loading : State179_84()
    data class Success(val data: String) : State179_84()
    data class Error(val message: String) : State179_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}