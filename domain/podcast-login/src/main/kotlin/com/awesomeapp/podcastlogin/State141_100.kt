package com.awesomeapp.podcastlogin

sealed class State141_100 {
    data object Loading : State141_100()
    data class Success(val data: String) : State141_100()
    data class Error(val message: String) : State141_100()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}