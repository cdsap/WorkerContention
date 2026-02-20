package com.awesomeapp.articlelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articlelogin.Viewmodel140_1
import com.awesomeapp.articlelogin.Activity140_2
import com.awesomeapp.articlelogin.Activity140_3
import com.awesomeapp.articlelogin.Fragment140_4
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.articlelogin.Service140_7
import com.awesomeapp.articlelogin.Worker140_8
import com.awesomeapp.articlelogin.Model140_10
import com.awesomeapp.articlelogin.Model140_11
import com.awesomeapp.articlelogin.Activity140_12
import com.awesomeapp.articlelogin.Model140_14
import com.awesomeapp.articlelogin.Activity140_15
import com.awesomeapp.articlelogin.Model140_17
import com.awesomeapp.articlelogin.Activity140_18
import com.awesomeapp.articlelogin.Model140_20
import com.awesomeapp.articlelogin.Activity140_21
import com.awesomeapp.articlelogin.Model140_23
import com.awesomeapp.articlelogin.Activity140_24
import com.awesomeapp.articlelogin.Model140_26
import com.awesomeapp.articlelogin.Activity140_27
import com.awesomeapp.articlelogin.Model140_29
import com.awesomeapp.articlelogin.Activity140_30
import com.awesomeapp.articlelogin.Model140_32
import com.awesomeapp.articlelogin.Activity140_33
import com.awesomeapp.articlelogin.Model140_35
import com.awesomeapp.articlelogin.Activity140_36
import com.awesomeapp.articlelogin.Model140_38
import com.awesomeapp.articlelogin.Activity140_39
import com.awesomeapp.articlelogin.Model140_41
import com.awesomeapp.articlelogin.Activity140_42
import com.awesomeapp.articlelogin.Model140_44
import com.awesomeapp.articlelogin.Activity140_45

@Module
@InstallIn(SingletonComponent::class)
object Module_140 {
    @Provides
    @Singleton
    fun provideRepository140_5(
        api0: Api64_6 = Api64_6(),
        api1: Api72_6 = Api72_6(),
        api2: Api96_6 = Api96_6(),
        api3: Api88_6 = Api88_6(),
        api4: Api80_6 = Api80_6(),
        api5: Api52_6 = Api52_6(),
        api6: Api76_6 = Api76_6()
    ): Repository140_5 {
        return Repository140_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi140_6(): Api140_6 {
        return Api140_6()
    }
}