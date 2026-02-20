package com.awesomeapp.photoidentity

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
import com.awesomeapp.photoidentity.*
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.articlelogin.Api140_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository192_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository192_5(Api112_6(),
            Api100_6(),
            Api120_6(),
            Api140_6()).getData()
        assertNotNull(result)
    }
}