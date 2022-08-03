package com.stPupero.cryptocurrencyapp.domain.model

import com.stPupero.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.stPupero.cryptocurrencyapp.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val teams: List<TeamMember>
)

fun CoinDetailDto.toCoinDetail(): CoinDetail{
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags.map { it.name },
        teams = team
    )
}
