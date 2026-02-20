package com.awesomeapp.alarmidentity

sealed class State178_99 {
    data object Loading : State178_99()
    data class Success(val data: String) : State178_99()
    data class Error(val message: String) : State178_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}