package com.awesomeapp.videocheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.videocheckout.Viewmodel240_1
import com.awesomeapp.videocheckout.Activity240_2
import com.awesomeapp.videocheckout.Activity240_3
import com.awesomeapp.videocheckout.Fragment240_4
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.videocheckout.Service240_7
import com.awesomeapp.videocheckout.Worker240_8
import com.awesomeapp.videocheckout.Usecase240_9
import com.awesomeapp.videocheckout.Model240_11

@Module
@InstallIn(SingletonComponent::class)
object Module_240 {
    @Provides
    @Singleton
    fun provideRepository240_5(
        api0: Api160_6 = Api160_6(),
        api1: Api172_6 = Api172_6(),
        api2: Api180_6 = Api180_6(),
        api3: Api168_6 = Api168_6(),
        api4: Api156_6 = Api156_6()
    ): Repository240_5 {
        return Repository240_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi240_6(): Api240_6 {
        return Api240_6()
    }
}