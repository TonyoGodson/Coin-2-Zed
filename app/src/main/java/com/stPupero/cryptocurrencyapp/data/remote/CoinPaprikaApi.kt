package com.stPupero.cryptocurrencyapp.data.remote

import com.stPupero.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.stPupero.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinsById(@Path("coinId") coinId: String): CoinDetailDto
}
