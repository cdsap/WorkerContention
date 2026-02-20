package com.awesomeapp.weathercheckout

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Rule
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.*
import kotlin.test.assertTrue
import kotlin.test.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import com.awesomeapp.weathercheckout.*


@OptIn(ExperimentalCoroutinesApi::class)
class State235_95Test {
        @Test
    fun `test loading state`() {
        val state = State235_95.Loading
        assertNotNull(state)
    }

    @Test
    fun `test success state`() {
        val state = State235_95.Success("test data")
        assertNotNull(state)
        assertEquals("test data", (state as State235_95.Success).data)
    }

    @Test
    fun `test error state`() {
        val state = State235_95.Error("test error")
        assertNotNull(state)
        assertEquals("test error", (state as State235_95.Error).message)
    }
}