package com.awesomeapp.metriccontact

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
import com.awesomeapp.metriccontact.*
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.video.Api44_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository76_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository76_5(Api4_6(),
            Api24_6(),
            Api44_6()).getData()
        assertNotNull(result)
    }
}