package com.stPupero.cryptocurrencyapp.presentation

sealed class Screen(val route: String) {
    object CoinListScreen : Screen("coin_list_screen")
    object CoinDetailScreen : Screen("coin_detail_Screen")
    object SplashScreen : Screen("splash_screen")
}
