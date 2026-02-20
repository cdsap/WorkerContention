package com.awesomeapp.weathercontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathercontact.Viewmodel88_1
import com.awesomeapp.weathercontact.Activity88_2
import com.awesomeapp.weathercontact.Activity88_3
import com.awesomeapp.weathercontact.Fragment88_4
import com.awesomeapp.weathercontact.Repository88_5
import com.awesomeapp.video.Api44_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.weathercontact.Model88_7
import com.awesomeapp.weathercontact.Activity88_8

@Module
@InstallIn(SingletonComponent::class)
object Module_88 {
    @Provides
    @Singleton
    fun provideRepository88_5(
        api0: Api44_6 = Api44_6(),
        api1: Api28_6 = Api28_6(),
        api2: Api40_6 = Api40_6(),
        api3: Api36_6 = Api36_6(),
        api4: Api12_6 = Api12_6(),
        api5: Api20_6 = Api20_6(),
        api6: Api32_6 = Api32_6(),
        api7: Api48_6 = Api48_6(),
        api8: Api16_6 = Api16_6(),
        api9: Api4_6 = Api4_6(),
        api10: Api24_6 = Api24_6()
    ): Repository88_5 {
        return Repository88_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi88_6(): Api88_6 {
        return Api88_6()
    }
}