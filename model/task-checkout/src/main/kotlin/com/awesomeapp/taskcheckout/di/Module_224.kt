package com.awesomeapp.taskcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.taskcheckout.Viewmodel224_1
import com.awesomeapp.taskcheckout.Activity224_2
import com.awesomeapp.taskcheckout.Activity224_3
import com.awesomeapp.taskcheckout.Fragment224_4
import com.awesomeapp.taskcheckout.Repository224_5
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.taskcheckout.Model224_8
import com.awesomeapp.taskcheckout.Model224_9
import com.awesomeapp.taskcheckout.Activity224_10
import com.awesomeapp.taskcheckout.Model224_12
import com.awesomeapp.taskcheckout.Activity224_13
import com.awesomeapp.taskcheckout.Model224_15
import com.awesomeapp.taskcheckout.Activity224_16
import com.awesomeapp.taskcheckout.Model224_18
import com.awesomeapp.taskcheckout.Activity224_19
import com.awesomeapp.taskcheckout.Model224_21
import com.awesomeapp.taskcheckout.Activity224_22
import com.awesomeapp.taskcheckout.Model224_24
import com.awesomeapp.taskcheckout.Activity224_25
import com.awesomeapp.taskcheckout.Model224_27
import com.awesomeapp.taskcheckout.Activity224_28
import com.awesomeapp.taskcheckout.Model224_30
import com.awesomeapp.taskcheckout.Activity224_31
import com.awesomeapp.taskcheckout.Model224_33
import com.awesomeapp.taskcheckout.Activity224_34
import com.awesomeapp.taskcheckout.Model224_36
import com.awesomeapp.taskcheckout.Activity224_37
import com.awesomeapp.taskcheckout.Model224_39
import com.awesomeapp.taskcheckout.Activity224_40
import com.awesomeapp.taskcheckout.Model224_42
import com.awesomeapp.taskcheckout.Activity224_43
import com.awesomeapp.taskcheckout.Model224_45
import com.awesomeapp.taskcheckout.Activity224_46
import com.awesomeapp.taskcheckout.Model224_48
import com.awesomeapp.taskcheckout.Activity224_49
import com.awesomeapp.taskcheckout.Model224_51
import com.awesomeapp.taskcheckout.Activity224_52
import com.awesomeapp.taskcheckout.Model224_54
import com.awesomeapp.taskcheckout.Activity224_55
import com.awesomeapp.taskcheckout.Model224_57
import com.awesomeapp.taskcheckout.Activity224_58
import com.awesomeapp.taskcheckout.Model224_60
import com.awesomeapp.taskcheckout.Activity224_61
import com.awesomeapp.taskcheckout.Model224_63
import com.awesomeapp.taskcheckout.Activity224_64
import com.awesomeapp.taskcheckout.Model224_66
import com.awesomeapp.taskcheckout.Activity224_67
import com.awesomeapp.taskcheckout.Model224_69
import com.awesomeapp.taskcheckout.Activity224_70
import com.awesomeapp.taskcheckout.Model224_72
import com.awesomeapp.taskcheckout.Activity224_73
import com.awesomeapp.taskcheckout.Model224_75
import com.awesomeapp.taskcheckout.Activity224_76
import com.awesomeapp.taskcheckout.Model224_78
import com.awesomeapp.taskcheckout.Activity224_79
import com.awesomeapp.taskcheckout.Model224_81
import com.awesomeapp.taskcheckout.Activity224_82
import com.awesomeapp.taskcheckout.Model224_84
import com.awesomeapp.taskcheckout.Activity224_85
import com.awesomeapp.taskcheckout.Model224_87
import com.awesomeapp.taskcheckout.Activity224_88
import com.awesomeapp.taskcheckout.Model224_90
import com.awesomeapp.taskcheckout.Activity224_91
import com.awesomeapp.taskcheckout.Model224_93
import com.awesomeapp.taskcheckout.Activity224_94
import com.awesomeapp.taskcheckout.Model224_96
import com.awesomeapp.taskcheckout.Activity224_97
import com.awesomeapp.taskcheckout.Model224_99
import com.awesomeapp.taskcheckout.Activity224_100
import com.awesomeapp.taskcheckout.Model224_102

@Module
@InstallIn(SingletonComponent::class)
object Module_224 {
    @Provides
    @Singleton
    fun provideRepository224_5(
        api0: Api188_6 = Api188_6(),
        api1: Api160_6 = Api160_6()
    ): Repository224_5 {
        return Repository224_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi224_6(): Api224_6 {
        return Api224_6()
    }
}