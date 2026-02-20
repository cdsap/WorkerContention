package com.awesomeapp.logidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logidentity.Viewmodel172_1
import com.awesomeapp.logidentity.Activity172_2
import com.awesomeapp.logidentity.Activity172_3
import com.awesomeapp.logidentity.Fragment172_4
import com.awesomeapp.logidentity.Repository172_5
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.logidentity.Model172_8
import com.awesomeapp.logidentity.Model172_9
import com.awesomeapp.logidentity.Activity172_10
import com.awesomeapp.logidentity.Model172_12
import com.awesomeapp.logidentity.Activity172_13
import com.awesomeapp.logidentity.Model172_15
import com.awesomeapp.logidentity.Activity172_16
import com.awesomeapp.logidentity.Model172_18
import com.awesomeapp.logidentity.Activity172_19
import com.awesomeapp.logidentity.Model172_21
import com.awesomeapp.logidentity.Activity172_22
import com.awesomeapp.logidentity.Model172_24
import com.awesomeapp.logidentity.Activity172_25
import com.awesomeapp.logidentity.Model172_27
import com.awesomeapp.logidentity.Activity172_28
import com.awesomeapp.logidentity.Model172_30
import com.awesomeapp.logidentity.Activity172_31
import com.awesomeapp.logidentity.Model172_33
import com.awesomeapp.logidentity.Activity172_34
import com.awesomeapp.logidentity.Model172_36
import com.awesomeapp.logidentity.Activity172_37
import com.awesomeapp.logidentity.Model172_39
import com.awesomeapp.logidentity.Activity172_40
import com.awesomeapp.logidentity.Model172_42
import com.awesomeapp.logidentity.Activity172_43
import com.awesomeapp.logidentity.Model172_45
import com.awesomeapp.logidentity.Activity172_46
import com.awesomeapp.logidentity.Model172_48
import com.awesomeapp.logidentity.Activity172_49
import com.awesomeapp.logidentity.Model172_51
import com.awesomeapp.logidentity.Activity172_52
import com.awesomeapp.logidentity.Model172_54
import com.awesomeapp.logidentity.Activity172_55
import com.awesomeapp.logidentity.Model172_57
import com.awesomeapp.logidentity.Activity172_58
import com.awesomeapp.logidentity.Model172_60
import com.awesomeapp.logidentity.Activity172_61
import com.awesomeapp.logidentity.Model172_63
import com.awesomeapp.logidentity.Activity172_64
import com.awesomeapp.logidentity.Model172_66
import com.awesomeapp.logidentity.Activity172_67
import com.awesomeapp.logidentity.Model172_69
import com.awesomeapp.logidentity.Activity172_70
import com.awesomeapp.logidentity.Model172_72
import com.awesomeapp.logidentity.Activity172_73
import com.awesomeapp.logidentity.Model172_75
import com.awesomeapp.logidentity.Activity172_76
import com.awesomeapp.logidentity.Model172_78
import com.awesomeapp.logidentity.Activity172_79
import com.awesomeapp.logidentity.Model172_81
import com.awesomeapp.logidentity.Activity172_82
import com.awesomeapp.logidentity.Model172_84
import com.awesomeapp.logidentity.Activity172_85
import com.awesomeapp.logidentity.Model172_87
import com.awesomeapp.logidentity.Activity172_88
import com.awesomeapp.logidentity.Model172_90
import com.awesomeapp.logidentity.Activity172_91
import com.awesomeapp.logidentity.Model172_93
import com.awesomeapp.logidentity.Activity172_94
import com.awesomeapp.logidentity.Model172_96
import com.awesomeapp.logidentity.Activity172_97
import com.awesomeapp.logidentity.Model172_99
import com.awesomeapp.logidentity.Activity172_100
import com.awesomeapp.logidentity.Model172_102
import com.awesomeapp.logidentity.Activity172_103
import com.awesomeapp.logidentity.Model172_105
import com.awesomeapp.logidentity.Activity172_106
import com.awesomeapp.logidentity.Model172_108
import com.awesomeapp.logidentity.Activity172_109
import com.awesomeapp.logidentity.Model172_111
import com.awesomeapp.logidentity.Activity172_112
import com.awesomeapp.logidentity.Model172_114
import com.awesomeapp.logidentity.Activity172_115
import com.awesomeapp.logidentity.Model172_117
import com.awesomeapp.logidentity.Activity172_118

@Module
@InstallIn(SingletonComponent::class)
object Module_172 {
    @Provides
    @Singleton
    fun provideRepository172_5(
        api0: Api144_6 = Api144_6()
    ): Repository172_5 {
        return Repository172_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi172_6(): Api172_6 {
        return Api172_6()
    }
}