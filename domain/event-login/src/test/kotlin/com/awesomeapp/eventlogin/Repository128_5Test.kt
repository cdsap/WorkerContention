package com.awesomeapp.eventlogin

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
import com.awesomeapp.eventlogin.*
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.metriccontact.Api76_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository128_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository128_5(Api84_6(),
            Api64_6(),
            Api52_6(),
            Api92_6(),
            Api60_6(),
            Api76_6()).getData()
        assertNotNull(result)
    }
}