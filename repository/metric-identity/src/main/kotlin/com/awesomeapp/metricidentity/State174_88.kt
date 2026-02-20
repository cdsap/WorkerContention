package com.awesomeapp.metricidentity

sealed class State174_88 {
    data object Loading : State174_88()
    data class Success(val data: String) : State174_88()
    data class Error(val message: String) : State174_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}