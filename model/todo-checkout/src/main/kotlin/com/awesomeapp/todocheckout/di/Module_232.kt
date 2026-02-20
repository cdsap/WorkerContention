package com.awesomeapp.todocheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.todocheckout.Viewmodel232_1
import com.awesomeapp.todocheckout.Activity232_2
import com.awesomeapp.todocheckout.Activity232_3
import com.awesomeapp.todocheckout.Fragment232_4
import com.awesomeapp.todocheckout.Repository232_5
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.todocheckout.Model232_8
import com.awesomeapp.todocheckout.Model232_9
import com.awesomeapp.todocheckout.Activity232_10
import com.awesomeapp.todocheckout.Model232_12
import com.awesomeapp.todocheckout.Activity232_13
import com.awesomeapp.todocheckout.Model232_15
import com.awesomeapp.todocheckout.Activity232_16
import com.awesomeapp.todocheckout.Model232_18
import com.awesomeapp.todocheckout.Activity232_19
import com.awesomeapp.todocheckout.Model232_21
import com.awesomeapp.todocheckout.Activity232_22
import com.awesomeapp.todocheckout.Model232_24
import com.awesomeapp.todocheckout.Activity232_25
import com.awesomeapp.todocheckout.Model232_27
import com.awesomeapp.todocheckout.Activity232_28
import com.awesomeapp.todocheckout.Model232_30
import com.awesomeapp.todocheckout.Activity232_31
import com.awesomeapp.todocheckout.Model232_33
import com.awesomeapp.todocheckout.Activity232_34
import com.awesomeapp.todocheckout.Model232_36
import com.awesomeapp.todocheckout.Activity232_37
import com.awesomeapp.todocheckout.Model232_39
import com.awesomeapp.todocheckout.Activity232_40
import com.awesomeapp.todocheckout.Model232_42
import com.awesomeapp.todocheckout.Activity232_43
import com.awesomeapp.todocheckout.Model232_45
import com.awesomeapp.todocheckout.Activity232_46
import com.awesomeapp.todocheckout.Model232_48
import com.awesomeapp.todocheckout.Activity232_49
import com.awesomeapp.todocheckout.Model232_51
import com.awesomeapp.todocheckout.Activity232_52
import com.awesomeapp.todocheckout.Model232_54
import com.awesomeapp.todocheckout.Activity232_55
import com.awesomeapp.todocheckout.Model232_57
import com.awesomeapp.todocheckout.Activity232_58
import com.awesomeapp.todocheckout.Model232_60
import com.awesomeapp.todocheckout.Activity232_61
import com.awesomeapp.todocheckout.Model232_63
import com.awesomeapp.todocheckout.Activity232_64
import com.awesomeapp.todocheckout.Model232_66
import com.awesomeapp.todocheckout.Activity232_67
import com.awesomeapp.todocheckout.Model232_69
import com.awesomeapp.todocheckout.Activity232_70
import com.awesomeapp.todocheckout.Model232_72
import com.awesomeapp.todocheckout.Activity232_73
import com.awesomeapp.todocheckout.Model232_75
import com.awesomeapp.todocheckout.Activity232_76
import com.awesomeapp.todocheckout.Model232_78
import com.awesomeapp.todocheckout.Activity232_79
import com.awesomeapp.todocheckout.Model232_81
import com.awesomeapp.todocheckout.Activity232_82
import com.awesomeapp.todocheckout.Model232_84
import com.awesomeapp.todocheckout.Activity232_85
import com.awesomeapp.todocheckout.Model232_87
import com.awesomeapp.todocheckout.Activity232_88
import com.awesomeapp.todocheckout.Model232_90
import com.awesomeapp.todocheckout.Activity232_91
import com.awesomeapp.todocheckout.Model232_93
import com.awesomeapp.todocheckout.Activity232_94
import com.awesomeapp.todocheckout.Model232_96
import com.awesomeapp.todocheckout.Activity232_97
import com.awesomeapp.todocheckout.Model232_99
import com.awesomeapp.todocheckout.Activity232_100
import com.awesomeapp.todocheckout.Model232_102
import com.awesomeapp.todocheckout.Activity232_103
import com.awesomeapp.todocheckout.Model232_105
import com.awesomeapp.todocheckout.Activity232_106
import com.awesomeapp.todocheckout.Model232_108
import com.awesomeapp.todocheckout.Activity232_109
import com.awesomeapp.todocheckout.Model232_111
import com.awesomeapp.todocheckout.Activity232_112
import com.awesomeapp.todocheckout.Model232_114
import com.awesomeapp.todocheckout.Activity232_115
import com.awesomeapp.todocheckout.Model232_117
import com.awesomeapp.todocheckout.Activity232_118
import com.awesomeapp.todocheckout.Model232_120
import com.awesomeapp.todocheckout.Activity232_121
import com.awesomeapp.todocheckout.Model232_123
import com.awesomeapp.todocheckout.Activity232_124
import com.awesomeapp.todocheckout.Model232_126
import com.awesomeapp.todocheckout.Activity232_127
import com.awesomeapp.todocheckout.Model232_129
import com.awesomeapp.todocheckout.Activity232_130
import com.awesomeapp.todocheckout.Model232_132
import com.awesomeapp.todocheckout.Activity232_133
import com.awesomeapp.todocheckout.Model232_135
import com.awesomeapp.todocheckout.Activity232_136
import com.awesomeapp.todocheckout.Model232_138
import com.awesomeapp.todocheckout.Activity232_139
import com.awesomeapp.todocheckout.Model232_141
import com.awesomeapp.todocheckout.Activity232_142

@Module
@InstallIn(SingletonComponent::class)
object Module_232 {
    @Provides
    @Singleton
    fun provideRepository232_5(
        api0: Api156_6 = Api156_6()
    ): Repository232_5 {
        return Repository232_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi232_6(): Api232_6 {
        return Api232_6()
    }
}