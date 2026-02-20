package com.awesomeapp.alarmcheckout

sealed class State227_99 {
    data object Loading : State227_99()
    data class Success(val data: String) : State227_99()
    data class Error(val message: String) : State227_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}