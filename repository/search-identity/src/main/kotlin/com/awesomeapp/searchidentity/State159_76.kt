package com.awesomeapp.searchidentity

sealed class State159_76 {
    data object Loading : State159_76()
    data class Success(val data: String) : State159_76()
    data class Error(val message: String) : State159_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}