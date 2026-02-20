package com.awesomeapp.weathercheckout

sealed class State235_98 {
    data object Loading : State235_98()
    data class Success(val data: String) : State235_98()
    data class Error(val message: String) : State235_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}