package com.example.coroutine.bean

data class Articles(
    val curPage: Int = 0,
    val datas: MutableList<ArticleBean> = mutableListOf(),
    val offset: Int = 0,
    val over: Boolean = false,
    val pageCount: Int = 0,
    val size: Int = 0,
    val total: Int = 0
)