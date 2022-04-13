package com.example.coroutine.repository

import android.util.Log
import com.example.coroutine.api.ArticleApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ArticleRepository {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://www.wanandroid.com/")
        .client(OkHttpClient.Builder().addInterceptor {
            it.proceed(it.request()).apply {
                Log.d("~~~", "request ${code()}")
            }
        }.build())
        // 将返回的数据转换为String
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    suspend fun getArticle(): String {
        val articleApi = retrofit.create(ArticleApi::class.java)
        return articleApi.getHomeArticles(0).toString()
    }
}