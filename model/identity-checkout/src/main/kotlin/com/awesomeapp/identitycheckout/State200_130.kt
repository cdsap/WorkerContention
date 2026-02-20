package com.awesomeapp.identitycheckout

sealed class State200_130 {
    data object Loading : State200_130()
    data class Success(val data: String) : State200_130()
    data class Error(val message: String) : State200_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}