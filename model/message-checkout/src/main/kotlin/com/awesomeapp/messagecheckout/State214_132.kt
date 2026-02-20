package com.awesomeapp.messagecheckout

sealed class State214_132 {
    data object Loading : State214_132()
    data class Success(val data: String) : State214_132()
    data class Error(val message: String) : State214_132()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}