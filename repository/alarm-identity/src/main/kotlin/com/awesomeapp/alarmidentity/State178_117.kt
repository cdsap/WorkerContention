package com.awesomeapp.alarmidentity

sealed class State178_117 {
    data object Loading : State178_117()
    data class Success(val data: String) : State178_117()
    data class Error(val message: String) : State178_117()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}