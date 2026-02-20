package com.awesomeapp.eventidentity

sealed class State177_85 {
    data object Loading : State177_85()
    data class Success(val data: String) : State177_85()
    data class Error(val message: String) : State177_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}