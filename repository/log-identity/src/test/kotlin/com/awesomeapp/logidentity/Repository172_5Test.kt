package com.awesomeapp.logidentity

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
import com.awesomeapp.logidentity.*
import com.awesomeapp.gallerylogin.Api144_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository172_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository172_5(Api144_6()).getData()
        assertNotNull(result)
    }
}