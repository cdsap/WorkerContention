package com.awesomeapp.sessionlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionlogin.Viewmodel120_1
import com.awesomeapp.sessionlogin.Activity120_2
import com.awesomeapp.sessionlogin.Activity120_3
import com.awesomeapp.sessionlogin.Fragment120_4
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.sessionlogin.Service120_7
import com.awesomeapp.sessionlogin.Worker120_8
import com.awesomeapp.sessionlogin.Usecase120_9
import com.awesomeapp.sessionlogin.Model120_11
import com.awesomeapp.sessionlogin.Model120_12
import com.awesomeapp.sessionlogin.Activity120_13
import com.awesomeapp.sessionlogin.Model120_15
import com.awesomeapp.sessionlogin.Activity120_16
import com.awesomeapp.sessionlogin.Model120_18
import com.awesomeapp.sessionlogin.Activity120_19
import com.awesomeapp.sessionlogin.Model120_21
import com.awesomeapp.sessionlogin.Activity120_22
import com.awesomeapp.sessionlogin.Model120_24
import com.awesomeapp.sessionlogin.Activity120_25
import com.awesomeapp.sessionlogin.Model120_27
import com.awesomeapp.sessionlogin.Activity120_28
import com.awesomeapp.sessionlogin.Model120_30
import com.awesomeapp.sessionlogin.Activity120_31
import com.awesomeapp.sessionlogin.Model120_33
import com.awesomeapp.sessionlogin.Activity120_34
import com.awesomeapp.sessionlogin.Model120_36
import com.awesomeapp.sessionlogin.Activity120_37
import com.awesomeapp.sessionlogin.Model120_39
import com.awesomeapp.sessionlogin.Activity120_40
import com.awesomeapp.sessionlogin.Model120_42
import com.awesomeapp.sessionlogin.Activity120_43
import com.awesomeapp.sessionlogin.Model120_45
import com.awesomeapp.sessionlogin.Activity120_46
import com.awesomeapp.sessionlogin.Model120_48
import com.awesomeapp.sessionlogin.Activity120_49
import com.awesomeapp.sessionlogin.Model120_51
import com.awesomeapp.sessionlogin.Activity120_52
import com.awesomeapp.sessionlogin.Model120_54
import com.awesomeapp.sessionlogin.Activity120_55
import com.awesomeapp.sessionlogin.Model120_57
import com.awesomeapp.sessionlogin.Activity120_58
import com.awesomeapp.sessionlogin.Model120_60
import com.awesomeapp.sessionlogin.Activity120_61
import com.awesomeapp.sessionlogin.Model120_63
import com.awesomeapp.sessionlogin.Activity120_64
import com.awesomeapp.sessionlogin.Model120_66
import com.awesomeapp.sessionlogin.Activity120_67
import com.awesomeapp.sessionlogin.Model120_69
import com.awesomeapp.sessionlogin.Activity120_70
import com.awesomeapp.sessionlogin.Model120_72
import com.awesomeapp.sessionlogin.Activity120_73
import com.awesomeapp.sessionlogin.Model120_75
import com.awesomeapp.sessionlogin.Activity120_76
import com.awesomeapp.sessionlogin.Model120_78
import com.awesomeapp.sessionlogin.Activity120_79
import com.awesomeapp.sessionlogin.Model120_81
import com.awesomeapp.sessionlogin.Activity120_82
import com.awesomeapp.sessionlogin.Model120_84
import com.awesomeapp.sessionlogin.Activity120_85
import com.awesomeapp.sessionlogin.Model120_87
import com.awesomeapp.sessionlogin.Activity120_88
import com.awesomeapp.sessionlogin.Model120_90
import com.awesomeapp.sessionlogin.Activity120_91
import com.awesomeapp.sessionlogin.Model120_93
import com.awesomeapp.sessionlogin.Activity120_94
import com.awesomeapp.sessionlogin.Model120_96
import com.awesomeapp.sessionlogin.Activity120_97
import com.awesomeapp.sessionlogin.Model120_99
import com.awesomeapp.sessionlogin.Activity120_100
import com.awesomeapp.sessionlogin.Model120_102
import com.awesomeapp.sessionlogin.Activity120_103
import com.awesomeapp.sessionlogin.Model120_105
import com.awesomeapp.sessionlogin.Activity120_106
import com.awesomeapp.sessionlogin.Model120_108
import com.awesomeapp.sessionlogin.Activity120_109
import com.awesomeapp.sessionlogin.Model120_111
import com.awesomeapp.sessionlogin.Activity120_112
import com.awesomeapp.sessionlogin.Model120_114
import com.awesomeapp.sessionlogin.Activity120_115
import com.awesomeapp.sessionlogin.Model120_117
import com.awesomeapp.sessionlogin.Activity120_118
import com.awesomeapp.sessionlogin.Model120_120
import com.awesomeapp.sessionlogin.Activity120_121
import com.awesomeapp.sessionlogin.Model120_123
import com.awesomeapp.sessionlogin.Activity120_124
import com.awesomeapp.sessionlogin.Model120_126
import com.awesomeapp.sessionlogin.Activity120_127
import com.awesomeapp.sessionlogin.Model120_129
import com.awesomeapp.sessionlogin.Activity120_130
import com.awesomeapp.sessionlogin.Model120_132
import com.awesomeapp.sessionlogin.Activity120_133
import com.awesomeapp.sessionlogin.Model120_135
import com.awesomeapp.sessionlogin.Activity120_136
import com.awesomeapp.sessionlogin.Model120_138
import com.awesomeapp.sessionlogin.Activity120_139

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api52_6 = Api52_6(),
        api1: Api76_6 = Api76_6(),
        api2: Api80_6 = Api80_6(),
        api3: Api72_6 = Api72_6(),
        api4: Api84_6 = Api84_6(),
        api5: Api56_6 = Api56_6()
    ): Repository120_5 {
        return Repository120_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}