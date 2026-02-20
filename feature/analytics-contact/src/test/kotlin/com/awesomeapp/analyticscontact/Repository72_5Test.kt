package com.awesomeapp.analyticscontact

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
import com.awesomeapp.analyticscontact.*
import com.awesomeapp.search.Api12_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository72_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository72_5(Api12_6()).getData()
        assertNotNull(result)
    }
}