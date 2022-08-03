package com.stPupero.cryptocurrencyapp.domain.repository

import com.stPupero.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.stPupero.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}