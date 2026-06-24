package com.zx_tole.myapplication.mvi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zx_tole.myapplication.ApiClient
import com.zx_tole.myapplication.User
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class UserListViewModel : ViewModel() {

    private val _state = MutableStateFlow<UserListState>(UserListState.Idle)
    val state = _state.asStateFlow()

    private val _effect = MutableSharedFlow<UserListEffect>()
    val effect = _effect.asSharedFlow()

    init {
        loadUsers()
    }

    fun onEvent(event: UserListEvent) {
        when (event) {
            UserListEvent.LoadUsers -> loadUsers()
            is UserListEvent.UserClicked -> handleUserClicked(event.user)
            UserListEvent.Retry -> loadUsers()
        }
    }

    private fun loadUsers() {
        _state.value = UserListState.Loading
        
        viewModelScope.launch {
            ApiClient.apiService.getUsers().enqueue(object : retrofit2.Callback<List<User>> {
                override fun onResponse(
                    call: Call<List<User>>,
                    response: Response<List<User>>
                ) {
                    if (response.isSuccessful) {
                        _state.value = UserListState.Success(response.body() ?: emptyList())
                    } else {
                        _state.value = UserListState.Error(
                            "Loading error: ${response.code()}"
                        )
                    }
                }

                override fun onFailure(call: Call<List<User>>, t: Throwable) {
                    _state.value = UserListState.Error(
                        "Network error: ${t.message ?: "Unknown error"}"
                    )
                }
            })
        }
    }

    private fun handleUserClicked(user: User) {
        viewModelScope.launch {
            _effect.emit(UserListEffect.NavigateToDetails(user))
        }
    }
}
