package com.awesomeapp.metricidentity

sealed class State174_115 {
    data object Loading : State174_115()
    data class Success(val data: String) : State174_115()
    data class Error(val message: String) : State174_115()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}