package com.awesomeapp.video.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.video.Viewmodel44_1
import com.awesomeapp.video.Activity44_2
import com.awesomeapp.video.Activity44_3
import com.awesomeapp.video.Fragment44_4
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.video.Api44_6
import com.awesomeapp.video.Model44_8
import com.awesomeapp.video.Model44_9
import com.awesomeapp.video.Activity44_10
import com.awesomeapp.video.Model44_12
import com.awesomeapp.video.Activity44_13
import com.awesomeapp.video.Model44_15
import com.awesomeapp.video.Activity44_16
import com.awesomeapp.video.Model44_18
import com.awesomeapp.video.Activity44_19
import com.awesomeapp.video.Model44_21
import com.awesomeapp.video.Activity44_22
import com.awesomeapp.video.Model44_24
import com.awesomeapp.video.Activity44_25
import com.awesomeapp.video.Model44_27
import com.awesomeapp.video.Activity44_28
import com.awesomeapp.video.Model44_30
import com.awesomeapp.video.Activity44_31
import com.awesomeapp.video.Model44_33
import com.awesomeapp.video.Activity44_34
import com.awesomeapp.video.Model44_36
import com.awesomeapp.video.Activity44_37
import com.awesomeapp.video.Model44_39
import com.awesomeapp.video.Activity44_40
import com.awesomeapp.video.Model44_42
import com.awesomeapp.video.Activity44_43
import com.awesomeapp.video.Model44_45
import com.awesomeapp.video.Activity44_46
import com.awesomeapp.video.Model44_48
import com.awesomeapp.video.Activity44_49
import com.awesomeapp.video.Model44_51
import com.awesomeapp.video.Activity44_52
import com.awesomeapp.video.Model44_54
import com.awesomeapp.video.Activity44_55
import com.awesomeapp.video.Model44_57
import com.awesomeapp.video.Activity44_58
import com.awesomeapp.video.Model44_60
import com.awesomeapp.video.Activity44_61
import com.awesomeapp.video.Model44_63
import com.awesomeapp.video.Activity44_64
import com.awesomeapp.video.Model44_66
import com.awesomeapp.video.Activity44_67
import com.awesomeapp.video.Model44_69
import com.awesomeapp.video.Activity44_70
import com.awesomeapp.video.Model44_72
import com.awesomeapp.video.Activity44_73
import com.awesomeapp.video.Model44_75
import com.awesomeapp.video.Activity44_76
import com.awesomeapp.video.Model44_78
import com.awesomeapp.video.Activity44_79
import com.awesomeapp.video.Model44_81
import com.awesomeapp.video.Activity44_82
import com.awesomeapp.video.Model44_84
import com.awesomeapp.video.Activity44_85
import com.awesomeapp.video.Model44_87
import com.awesomeapp.video.Activity44_88
import com.awesomeapp.video.Model44_90
import com.awesomeapp.video.Activity44_91
import com.awesomeapp.video.Model44_93
import com.awesomeapp.video.Activity44_94
import com.awesomeapp.video.Model44_96
import com.awesomeapp.video.Activity44_97
import com.awesomeapp.video.Model44_99
import com.awesomeapp.video.Activity44_100
import com.awesomeapp.video.Model44_102
import com.awesomeapp.video.Activity44_103
import com.awesomeapp.video.Model44_105
import com.awesomeapp.video.Activity44_106
import com.awesomeapp.video.Model44_108
import com.awesomeapp.video.Activity44_109
import com.awesomeapp.video.Model44_111
import com.awesomeapp.video.Activity44_112
import com.awesomeapp.video.Model44_114
import com.awesomeapp.video.Activity44_115
import com.awesomeapp.video.Model44_117
import com.awesomeapp.video.Activity44_118
import com.awesomeapp.video.Model44_120
import com.awesomeapp.video.Activity44_121
import com.awesomeapp.video.Model44_123
import com.awesomeapp.video.Activity44_124

@Module
@InstallIn(SingletonComponent::class)
object Module_44 {
    @Provides
    @Singleton
    fun provideRepository44_5(): Repository44_5 {
        return Repository44_5()
    }

    @Provides
    @Singleton
    fun provideApi44_6(): Api44_6 {
        return Api44_6()
    }
}