package com.awesomeapp.checkoutidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Viewmodel152_1
import com.awesomeapp.checkoutidentity.Activity152_2
import com.awesomeapp.checkoutidentity.Activity152_3
import com.awesomeapp.checkoutidentity.Fragment152_4
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.checkoutidentity.Model152_8
import com.awesomeapp.checkoutidentity.Model152_9
import com.awesomeapp.checkoutidentity.Activity152_10
import com.awesomeapp.checkoutidentity.Model152_12
import com.awesomeapp.checkoutidentity.Activity152_13
import com.awesomeapp.checkoutidentity.Model152_15
import com.awesomeapp.checkoutidentity.Activity152_16
import com.awesomeapp.checkoutidentity.Model152_18
import com.awesomeapp.checkoutidentity.Activity152_19
import com.awesomeapp.checkoutidentity.Model152_21
import com.awesomeapp.checkoutidentity.Activity152_22
import com.awesomeapp.checkoutidentity.Model152_24
import com.awesomeapp.checkoutidentity.Activity152_25

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api140_6 = Api140_6(),
        api1: Api128_6 = Api128_6(),
        api2: Api132_6 = Api132_6(),
        api3: Api136_6 = Api136_6(),
        api4: Api112_6 = Api112_6(),
        api5: Api116_6 = Api116_6()
    ): Repository152_5 {
        return Repository152_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}