package com.awesomeapp.newsidentity

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
import com.awesomeapp.newsidentity.*
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.messagelogin.Api116_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository188_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository188_5(Api120_6(),
            Api112_6(),
            Api104_6(),
            Api124_6(),
            Api108_6(),
            Api136_6(),
            Api132_6(),
            Api116_6()).getData()
        assertNotNull(result)
    }
}