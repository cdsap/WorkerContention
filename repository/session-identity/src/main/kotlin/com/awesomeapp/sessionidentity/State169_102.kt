package com.awesomeapp.sessionidentity

sealed class State169_102 {
    data object Loading : State169_102()
    data class Success(val data: String) : State169_102()
    data class Error(val message: String) : State169_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}