package com.awesomeapp.profilecheckout

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
import com.awesomeapp.profilecheckout.*
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.groupidentity.Api164_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository204_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository204_5(Api172_6(),
            Api188_6(),
            Api192_6(),
            Api164_6()).getData()
        assertNotNull(result)
    }
}