package com.stPupero.cryptocurrencyapp.presentation.coin_detail

import com.stPupero.cryptocurrencyapp.domain.model.Coin
import com.stPupero.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)