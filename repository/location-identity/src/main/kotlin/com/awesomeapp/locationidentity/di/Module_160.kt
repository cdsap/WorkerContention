package com.awesomeapp.locationidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.locationidentity.Viewmodel160_1
import com.awesomeapp.locationidentity.Activity160_2
import com.awesomeapp.locationidentity.Activity160_3
import com.awesomeapp.locationidentity.Fragment160_4
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.locationidentity.Service160_7
import com.awesomeapp.locationidentity.Worker160_8
import com.awesomeapp.locationidentity.Model160_10
import com.awesomeapp.locationidentity.Model160_11
import com.awesomeapp.locationidentity.Activity160_12
import com.awesomeapp.locationidentity.Model160_14
import com.awesomeapp.locationidentity.Activity160_15
import com.awesomeapp.locationidentity.Model160_17
import com.awesomeapp.locationidentity.Activity160_18
import com.awesomeapp.locationidentity.Model160_20
import com.awesomeapp.locationidentity.Activity160_21

@Module
@InstallIn(SingletonComponent::class)
object Module_160 {
    @Provides
    @Singleton
    fun provideRepository160_5(
        api0: Api100_6 = Api100_6(),
        api1: Api112_6 = Api112_6(),
        api2: Api124_6 = Api124_6()
    ): Repository160_5 {
        return Repository160_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi160_6(): Api160_6 {
        return Api160_6()
    }
}