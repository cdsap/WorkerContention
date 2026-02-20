package com.awesomeapp.searchcheckout

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
import com.awesomeapp.searchcheckout.*
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.logidentity.Api172_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository208_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository208_5(Api192_6(),
            Api172_6()).getData()
        assertNotNull(result)
    }
}