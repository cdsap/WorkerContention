package com.awesomeapp.articlecheckout

sealed class State238_87 {
    data object Loading : State238_87()
    data class Success(val data: String) : State238_87()
    data class Error(val message: String) : State238_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}