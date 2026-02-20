package com.awesomeapp.todocheckout

sealed class State232_131 {
    data object Loading : State232_131()
    data class Success(val data: String) : State232_131()
    data class Error(val message: String) : State232_131()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}