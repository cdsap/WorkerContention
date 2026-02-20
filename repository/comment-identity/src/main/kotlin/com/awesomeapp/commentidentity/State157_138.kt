package com.awesomeapp.commentidentity

sealed class State157_138 {
    data object Loading : State157_138()
    data class Success(val data: String) : State157_138()
    data class Error(val message: String) : State157_138()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}