package com.cmunaro.countryinfo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cmunaro.countryinfo.ui.screen.countrylist.COUNTRY_LIST_PATH
import com.cmunaro.countryinfo.ui.screen.countrylist.CountryListScreen
import com.cmunaro.countryinfo.ui.theme.CountryInfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            CountryInfoTheme {
                Surface(color = MaterialTheme.colors.background) {
                    NavHost(navController = navController, startDestination = COUNTRY_LIST_PATH) {
                        composable(COUNTRY_LIST_PATH) { CountryListScreen() }
                        //composable(COUNTRY_LIST_PATH) { CountryDetailScreen() }
                    }
                }
            }
        }
    }
}