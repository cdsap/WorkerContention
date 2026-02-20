package com.awesomeapp.synccheckout

sealed class State211_150 {
    data object Loading : State211_150()
    data class Success(val data: String) : State211_150()
    data class Error(val message: String) : State211_150()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}