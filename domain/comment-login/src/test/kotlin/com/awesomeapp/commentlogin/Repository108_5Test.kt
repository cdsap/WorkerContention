package com.awesomeapp.commentlogin

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
import com.awesomeapp.commentlogin.*
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.mediacontact.Api96_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository108_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository108_5(Api88_6(),
            Api80_6(),
            Api68_6(),
            Api96_6()).getData()
        assertNotNull(result)
    }
}