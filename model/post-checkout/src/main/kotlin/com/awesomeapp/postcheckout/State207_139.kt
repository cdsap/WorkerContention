package com.awesomeapp.postcheckout

sealed class State207_139 {
    data object Loading : State207_139()
    data class Success(val data: String) : State207_139()
    data class Error(val message: String) : State207_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}