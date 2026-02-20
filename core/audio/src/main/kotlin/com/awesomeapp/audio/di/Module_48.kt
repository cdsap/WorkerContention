package com.awesomeapp.audio.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.audio.Viewmodel48_1
import com.awesomeapp.audio.Activity48_2
import com.awesomeapp.audio.Activity48_3
import com.awesomeapp.audio.Fragment48_4
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.audio.Usecase48_7
import com.awesomeapp.audio.Model48_9
import com.awesomeapp.audio.Model48_10
import com.awesomeapp.audio.Activity48_11
import com.awesomeapp.audio.Model48_13
import com.awesomeapp.audio.Activity48_14
import com.awesomeapp.audio.Model48_16
import com.awesomeapp.audio.Activity48_17
import com.awesomeapp.audio.Model48_19
import com.awesomeapp.audio.Activity48_20
import com.awesomeapp.audio.Model48_22
import com.awesomeapp.audio.Activity48_23
import com.awesomeapp.audio.Model48_25
import com.awesomeapp.audio.Activity48_26
import com.awesomeapp.audio.Model48_28
import com.awesomeapp.audio.Activity48_29
import com.awesomeapp.audio.Model48_31
import com.awesomeapp.audio.Activity48_32
import com.awesomeapp.audio.Model48_34
import com.awesomeapp.audio.Activity48_35
import com.awesomeapp.audio.Model48_37
import com.awesomeapp.audio.Activity48_38
import com.awesomeapp.audio.Model48_40
import com.awesomeapp.audio.Activity48_41
import com.awesomeapp.audio.Model48_43
import com.awesomeapp.audio.Activity48_44
import com.awesomeapp.audio.Model48_46
import com.awesomeapp.audio.Activity48_47
import com.awesomeapp.audio.Model48_49
import com.awesomeapp.audio.Activity48_50
import com.awesomeapp.audio.Model48_52
import com.awesomeapp.audio.Activity48_53
import com.awesomeapp.audio.Model48_55
import com.awesomeapp.audio.Activity48_56
import com.awesomeapp.audio.Model48_58
import com.awesomeapp.audio.Activity48_59
import com.awesomeapp.audio.Model48_61
import com.awesomeapp.audio.Activity48_62
import com.awesomeapp.audio.Model48_64
import com.awesomeapp.audio.Activity48_65
import com.awesomeapp.audio.Model48_67
import com.awesomeapp.audio.Activity48_68
import com.awesomeapp.audio.Model48_70
import com.awesomeapp.audio.Activity48_71
import com.awesomeapp.audio.Model48_73
import com.awesomeapp.audio.Activity48_74
import com.awesomeapp.audio.Model48_76
import com.awesomeapp.audio.Activity48_77
import com.awesomeapp.audio.Model48_79
import com.awesomeapp.audio.Activity48_80
import com.awesomeapp.audio.Model48_82
import com.awesomeapp.audio.Activity48_83
import com.awesomeapp.audio.Model48_85
import com.awesomeapp.audio.Activity48_86
import com.awesomeapp.audio.Model48_88
import com.awesomeapp.audio.Activity48_89
import com.awesomeapp.audio.Model48_91
import com.awesomeapp.audio.Activity48_92
import com.awesomeapp.audio.Model48_94
import com.awesomeapp.audio.Activity48_95

@Module
@InstallIn(SingletonComponent::class)
object Module_48 {
    @Provides
    @Singleton
    fun provideRepository48_5(): Repository48_5 {
        return Repository48_5()
    }

    @Provides
    @Singleton
    fun provideApi48_6(): Api48_6 {
        return Api48_6()
    }
}