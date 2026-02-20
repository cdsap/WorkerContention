package com.awesomeapp.statuslogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.statuslogin.Viewmodel124_1
import com.awesomeapp.statuslogin.Activity124_2
import com.awesomeapp.statuslogin.Activity124_3
import com.awesomeapp.statuslogin.Fragment124_4
import com.awesomeapp.statuslogin.Repository124_5
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.statuslogin.Model124_8
import com.awesomeapp.statuslogin.Model124_9
import com.awesomeapp.statuslogin.Activity124_10
import com.awesomeapp.statuslogin.Model124_12
import com.awesomeapp.statuslogin.Activity124_13
import com.awesomeapp.statuslogin.Model124_15
import com.awesomeapp.statuslogin.Activity124_16
import com.awesomeapp.statuslogin.Model124_18
import com.awesomeapp.statuslogin.Activity124_19
import com.awesomeapp.statuslogin.Model124_21
import com.awesomeapp.statuslogin.Activity124_22
import com.awesomeapp.statuslogin.Model124_24
import com.awesomeapp.statuslogin.Activity124_25
import com.awesomeapp.statuslogin.Model124_27
import com.awesomeapp.statuslogin.Activity124_28
import com.awesomeapp.statuslogin.Model124_30
import com.awesomeapp.statuslogin.Activity124_31

@Module
@InstallIn(SingletonComponent::class)
object Module_124 {
    @Provides
    @Singleton
    fun provideRepository124_5(
        api0: Api60_6 = Api60_6(),
        api1: Api96_6 = Api96_6(),
        api2: Api92_6 = Api92_6(),
        api3: Api88_6 = Api88_6(),
        api4: Api68_6 = Api68_6()
    ): Repository124_5 {
        return Repository124_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi124_6(): Api124_6 {
        return Api124_6()
    }
}