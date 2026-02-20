package com.awesomeapp.notificationcheckout

sealed class State215_113 {
    data object Loading : State215_113()
    data class Success(val data: String) : State215_113()
    data class Error(val message: String) : State215_113()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}