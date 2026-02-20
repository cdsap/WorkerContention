package com.awesomeapp.fileidentity

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
import com.awesomeapp.fileidentity.*
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.eventlogin.Api128_6


@OptIn(ExperimentalCoroutinesApi::class)
class Repository180_5Test {
        @Before
    fun setup() {
    }

    @Test
    fun `test getData returns data`() = runTest {
        val result = Repository180_5(Api132_6(),
            Api108_6(),
            Api140_6(),
            Api128_6()).getData()
        assertNotNull(result)
    }
}