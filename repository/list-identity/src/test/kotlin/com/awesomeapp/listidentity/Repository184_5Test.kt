package com.awesomeapp.listidentity

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
import com.awesomeapp.listidentity.*
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.sessionlogin.Api120_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository184_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository184_5(Api136_6(),
            Api104_6(),
            Api128_6(),
            Api124_6(),
            Api108_6(),
            Api144_6(),
            Api112_6(),
            Api100_6(),
            Api120_6()).getData()
        assertNotNull(result)
    }
}