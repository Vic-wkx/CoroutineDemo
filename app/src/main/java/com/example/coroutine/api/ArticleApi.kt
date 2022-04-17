package com.example.coroutine.api

import com.example.coroutine.bean.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ArticleApi {
    @GET("article/list/{page}/json")
    suspend fun getHomeArticles(@Path("page") page: Int): Response
}