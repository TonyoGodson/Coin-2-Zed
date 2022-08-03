package com.stPupero.cryptocurrencyapp.data.repository

import com.stPupero.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.stPupero.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.stPupero.cryptocurrencyapp.data.remote.dto.CoinDto
import com.stPupero.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinsById(coinId)
    }
}