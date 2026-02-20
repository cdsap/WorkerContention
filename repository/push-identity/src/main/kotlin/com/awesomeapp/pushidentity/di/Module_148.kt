package com.awesomeapp.pushidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.pushidentity.Viewmodel148_1
import com.awesomeapp.pushidentity.Activity148_2
import com.awesomeapp.pushidentity.Activity148_3
import com.awesomeapp.pushidentity.Fragment148_4
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.pushidentity.Model148_8
import com.awesomeapp.pushidentity.Model148_9
import com.awesomeapp.pushidentity.Activity148_10
import com.awesomeapp.pushidentity.Model148_12
import com.awesomeapp.pushidentity.Activity148_13
import com.awesomeapp.pushidentity.Model148_15
import com.awesomeapp.pushidentity.Activity148_16
import com.awesomeapp.pushidentity.Model148_18
import com.awesomeapp.pushidentity.Activity148_19
import com.awesomeapp.pushidentity.Model148_21
import com.awesomeapp.pushidentity.Activity148_22
import com.awesomeapp.pushidentity.Model148_24
import com.awesomeapp.pushidentity.Activity148_25
import com.awesomeapp.pushidentity.Model148_27
import com.awesomeapp.pushidentity.Activity148_28
import com.awesomeapp.pushidentity.Model148_30
import com.awesomeapp.pushidentity.Activity148_31
import com.awesomeapp.pushidentity.Model148_33
import com.awesomeapp.pushidentity.Activity148_34
import com.awesomeapp.pushidentity.Model148_36
import com.awesomeapp.pushidentity.Activity148_37
import com.awesomeapp.pushidentity.Model148_39
import com.awesomeapp.pushidentity.Activity148_40
import com.awesomeapp.pushidentity.Model148_42
import com.awesomeapp.pushidentity.Activity148_43
import com.awesomeapp.pushidentity.Model148_45
import com.awesomeapp.pushidentity.Activity148_46
import com.awesomeapp.pushidentity.Model148_48
import com.awesomeapp.pushidentity.Activity148_49
import com.awesomeapp.pushidentity.Model148_51
import com.awesomeapp.pushidentity.Activity148_52
import com.awesomeapp.pushidentity.Model148_54
import com.awesomeapp.pushidentity.Activity148_55
import com.awesomeapp.pushidentity.Model148_57
import com.awesomeapp.pushidentity.Activity148_58
import com.awesomeapp.pushidentity.Model148_60
import com.awesomeapp.pushidentity.Activity148_61
import com.awesomeapp.pushidentity.Model148_63
import com.awesomeapp.pushidentity.Activity148_64
import com.awesomeapp.pushidentity.Model148_66
import com.awesomeapp.pushidentity.Activity148_67
import com.awesomeapp.pushidentity.Model148_69
import com.awesomeapp.pushidentity.Activity148_70
import com.awesomeapp.pushidentity.Model148_72
import com.awesomeapp.pushidentity.Activity148_73
import com.awesomeapp.pushidentity.Model148_75
import com.awesomeapp.pushidentity.Activity148_76
import com.awesomeapp.pushidentity.Model148_78
import com.awesomeapp.pushidentity.Activity148_79
import com.awesomeapp.pushidentity.Model148_81
import com.awesomeapp.pushidentity.Activity148_82
import com.awesomeapp.pushidentity.Model148_84
import com.awesomeapp.pushidentity.Activity148_85
import com.awesomeapp.pushidentity.Model148_87
import com.awesomeapp.pushidentity.Activity148_88
import com.awesomeapp.pushidentity.Model148_90
import com.awesomeapp.pushidentity.Activity148_91
import com.awesomeapp.pushidentity.Model148_93
import com.awesomeapp.pushidentity.Activity148_94
import com.awesomeapp.pushidentity.Model148_96
import com.awesomeapp.pushidentity.Activity148_97
import com.awesomeapp.pushidentity.Model148_99
import com.awesomeapp.pushidentity.Activity148_100
import com.awesomeapp.pushidentity.Model148_102
import com.awesomeapp.pushidentity.Activity148_103
import com.awesomeapp.pushidentity.Model148_105
import com.awesomeapp.pushidentity.Activity148_106
import com.awesomeapp.pushidentity.Model148_108
import com.awesomeapp.pushidentity.Activity148_109
import com.awesomeapp.pushidentity.Model148_111
import com.awesomeapp.pushidentity.Activity148_112
import com.awesomeapp.pushidentity.Model148_114
import com.awesomeapp.pushidentity.Activity148_115
import com.awesomeapp.pushidentity.Model148_117
import com.awesomeapp.pushidentity.Activity148_118
import com.awesomeapp.pushidentity.Model148_120
import com.awesomeapp.pushidentity.Activity148_121
import com.awesomeapp.pushidentity.Model148_123
import com.awesomeapp.pushidentity.Activity148_124
import com.awesomeapp.pushidentity.Model148_126
import com.awesomeapp.pushidentity.Activity148_127
import com.awesomeapp.pushidentity.Model148_129
import com.awesomeapp.pushidentity.Activity148_130
import com.awesomeapp.pushidentity.Model148_132
import com.awesomeapp.pushidentity.Activity148_133
import com.awesomeapp.pushidentity.Model148_135
import com.awesomeapp.pushidentity.Activity148_136
import com.awesomeapp.pushidentity.Model148_138
import com.awesomeapp.pushidentity.Activity148_139
import com.awesomeapp.pushidentity.Model148_141
import com.awesomeapp.pushidentity.Activity148_142
import com.awesomeapp.pushidentity.Model148_144
import com.awesomeapp.pushidentity.Activity148_145
import com.awesomeapp.pushidentity.Model148_147
import com.awesomeapp.pushidentity.Activity148_148

@Module
@InstallIn(SingletonComponent::class)
object Module_148 {
    @Provides
    @Singleton
    fun provideRepository148_5(
        api0: Api108_6 = Api108_6(),
        api1: Api136_6 = Api136_6(),
        api2: Api120_6 = Api120_6(),
        api3: Api132_6 = Api132_6(),
        api4: Api104_6 = Api104_6(),
        api5: Api128_6 = Api128_6(),
        api6: Api116_6 = Api116_6(),
        api7: Api100_6 = Api100_6(),
        api8: Api124_6 = Api124_6(),
        api9: Api140_6 = Api140_6()
    ): Repository148_5 {
        return Repository148_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi148_6(): Api148_6 {
        return Api148_6()
    }
}