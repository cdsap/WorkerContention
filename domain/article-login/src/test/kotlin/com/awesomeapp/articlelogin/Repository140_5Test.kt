package com.awesomeapp.articlelogin

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
import com.awesomeapp.articlelogin.*
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.metriccontact.Api76_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository140_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository140_5(Api64_6(),
            Api72_6(),
            Api96_6(),
            Api88_6(),
            Api80_6(),
            Api52_6(),
            Api76_6()).getData()
        assertNotNull(result)
    }
}