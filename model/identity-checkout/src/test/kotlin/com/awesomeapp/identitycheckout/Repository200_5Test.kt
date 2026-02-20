package com.awesomeapp.identitycheckout

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
import com.awesomeapp.identitycheckout.*
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.feedidentity.Api156_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository200_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository200_5(Api164_6(),
            Api152_6(),
            Api156_6()).getData()
        assertNotNull(result)
    }
}