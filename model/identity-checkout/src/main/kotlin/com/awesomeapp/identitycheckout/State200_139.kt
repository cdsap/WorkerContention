package com.awesomeapp.identitycheckout

sealed class State200_139 {
    data object Loading : State200_139()
    data class Success(val data: String) : State200_139()
    data class Error(val message: String) : State200_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}