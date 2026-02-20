package com.awesomeapp.eventidentity

sealed class State177_103 {
    data object Loading : State177_103()
    data class Success(val data: String) : State177_103()
    data class Error(val message: String) : State177_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}