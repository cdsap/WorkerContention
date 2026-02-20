package com.awesomeapp.pushidentity

sealed class State148_116 {
    data object Loading : State148_116()
    data class Success(val data: String) : State148_116()
    data class Error(val message: String) : State148_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}