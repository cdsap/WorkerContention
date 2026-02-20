package com.awesomeapp.metriccontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.metriccontact.Viewmodel76_1
import com.awesomeapp.metriccontact.Activity76_2
import com.awesomeapp.metriccontact.Activity76_3
import com.awesomeapp.metriccontact.Fragment76_4
import com.awesomeapp.metriccontact.Repository76_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.metriccontact.Model76_8
import com.awesomeapp.metriccontact.Model76_9
import com.awesomeapp.metriccontact.Activity76_10
import com.awesomeapp.metriccontact.Model76_12
import com.awesomeapp.metriccontact.Activity76_13
import com.awesomeapp.metriccontact.Model76_15
import com.awesomeapp.metriccontact.Activity76_16
import com.awesomeapp.metriccontact.Model76_18
import com.awesomeapp.metriccontact.Activity76_19
import com.awesomeapp.metriccontact.Model76_21
import com.awesomeapp.metriccontact.Activity76_22

@Module
@InstallIn(SingletonComponent::class)
object Module_76 {
    @Provides
    @Singleton
    fun provideRepository76_5(
        api0: Api4_6 = Api4_6(),
        api1: Api24_6 = Api24_6(),
        api2: Api44_6 = Api44_6()
    ): Repository76_5 {
        return Repository76_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi76_6(): Api76_6 {
        return Api76_6()
    }
}