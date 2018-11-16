package java.com.mvvm_i.di

import javax.inject.Qualifier
import javax.inject.Scope
import javax.inject.Singleton
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
annotation class ForApplication