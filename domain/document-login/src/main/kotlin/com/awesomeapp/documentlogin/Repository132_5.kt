package com.awesomeapp.documentlogin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.mediacontact.Api96_6


@Singleton
class Repository132_5 @Inject constructor(
    private val api0: Api80_6,
    private val api1: Api84_6,
    private val api2: Api72_6,
    private val api3: Api88_6,
    private val api4: Api56_6,
    private val api5: Api68_6,
    private val api6: Api96_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() },
                        { api6.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}