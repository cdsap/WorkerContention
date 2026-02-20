package com.awesomeapp.eventcheckout

sealed class State226_96 {
    data object Loading : State226_96()
    data class Success(val data: String) : State226_96()
    data class Error(val message: String) : State226_96()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}