package com.awesomeapp.forecastcheckout

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
import com.awesomeapp.forecastcheckout.*
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.accountidentity.Api168_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository236_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository236_5(Api160_6(),
            Api188_6(),
            Api184_6(),
            Api156_6(),
            Api164_6(),
            Api192_6(),
            Api168_6()).getData()
        assertNotNull(result)
    }
}