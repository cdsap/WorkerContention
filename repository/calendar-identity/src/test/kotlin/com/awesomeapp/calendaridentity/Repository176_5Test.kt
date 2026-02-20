package com.awesomeapp.calendaridentity

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
import com.awesomeapp.calendaridentity.*
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.gallerylogin.Api144_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository176_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository176_5(Api120_6(),
            Api116_6(),
            Api136_6(),
            Api100_6(),
            Api132_6(),
            Api128_6(),
            Api112_6(),
            Api104_6(),
            Api140_6(),
            Api144_6()).getData()
        assertNotNull(result)
    }
}