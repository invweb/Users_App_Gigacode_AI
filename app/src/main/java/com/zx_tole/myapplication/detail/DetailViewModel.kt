package com.zx_tole.myapplication.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zx_tole.myapplication.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel : ViewModel() {

    private val _state = MutableStateFlow<DetailState>(DetailState.Idle)
    val state: StateFlow<DetailState> = _state

    fun loadUser(user: User) {
        _state.value = DetailState.Loaded(user)
    }
}

sealed interface DetailState {
    data object Idle : DetailState
    data class Loaded(val user: User) : DetailState
}
