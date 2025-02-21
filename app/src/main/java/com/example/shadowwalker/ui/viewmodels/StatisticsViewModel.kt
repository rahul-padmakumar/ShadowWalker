package com.example.shadowwalker.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.shadowwalker.repositories.RunRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(private val runRepo: RunRepo): ViewModel() {
}