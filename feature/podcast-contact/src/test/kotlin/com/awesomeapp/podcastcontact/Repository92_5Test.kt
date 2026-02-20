package com.awesomeapp.podcastcontact

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
import com.awesomeapp.podcastcontact.*
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.report.Api24_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository92_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository92_5(Api4_6(),
            Api28_6(),
            Api32_6(),
            Api36_6(),
            Api44_6(),
            Api48_6(),
            Api24_6()).getData()
        assertNotNull(result)
    }
}