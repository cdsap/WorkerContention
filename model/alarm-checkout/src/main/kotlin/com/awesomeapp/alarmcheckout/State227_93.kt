package com.awesomeapp.alarmcheckout

sealed class State227_93 {
    data object Loading : State227_93()
    data class Success(val data: String) : State227_93()
    data class Error(val message: String) : State227_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}