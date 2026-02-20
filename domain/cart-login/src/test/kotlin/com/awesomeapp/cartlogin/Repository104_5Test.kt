package com.awesomeapp.cartlogin

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
import com.awesomeapp.cartlogin.*
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.analyticscontact.Api72_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository104_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository104_5(Api64_6(),
            Api68_6(),
            Api96_6(),
            Api88_6(),
            Api56_6(),
            Api72_6()).getData()
        assertNotNull(result)
    }
}