package com.example.coroutine.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coroutine.repository.ArticleRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val articleRepository = ArticleRepository()
    val articlesLiveData = MutableLiveData<String>()

    fun getArticle() {
        viewModelScope.launch {
            articlesLiveData.value = articleRepository.getArticle()
        }
    }
}