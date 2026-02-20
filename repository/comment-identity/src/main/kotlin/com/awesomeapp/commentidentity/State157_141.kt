package com.awesomeapp.commentidentity

sealed class State157_141 {
    data object Loading : State157_141()
    data class Success(val data: String) : State157_141()
    data class Error(val message: String) : State157_141()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}