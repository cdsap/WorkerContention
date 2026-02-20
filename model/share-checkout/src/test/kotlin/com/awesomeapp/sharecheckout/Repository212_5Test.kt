package com.awesomeapp.sharecheckout

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
import com.awesomeapp.sharecheckout.*
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.photoidentity.Api192_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository212_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository212_5(Api160_6(),
            Api188_6(),
            Api156_6(),
            Api168_6(),
            Api180_6(),
            Api192_6()).getData()
        assertNotNull(result)
    }
}