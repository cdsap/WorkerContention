package com.awesomeapp.checkoutidentity

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
import com.awesomeapp.checkoutidentity.*
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.messagelogin.Api116_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository152_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository152_5(Api140_6(),
            Api128_6(),
            Api132_6(),
            Api136_6(),
            Api112_6(),
            Api116_6()).getData()
        assertNotNull(result)
    }
}