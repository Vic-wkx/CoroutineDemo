package com.example.coroutine.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coroutine.repository.ArticleRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val articlesLiveData = MutableLiveData<String>()
    private val articleRepository = ArticleRepository()

    fun getArticle() {
        viewModelScope.launch {
            articlesLiveData.value = articleRepository.getArticle()
        }
    }
}