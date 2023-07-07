package com.example.movieTicket

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movieTicket.screens.bookingScreen.BookingScreen
import com.example.movieTicket.screens.buyTicketsScreen.BuyTicketsScreen
import com.example.movieTicket.screens.filmsScreen.FilmsScreen
import com.example.movieTicket.ui.theme.MovieTicketTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieTicketApp() {
//    MovieTicketTheme() {
//        val navController = rememberNavController()
//        Scaffold{
//            NavHost(navController = navController, startDestination = AppDestination.FilmsScreen.route ){
//                composable(AppDestination.FilmsScreen.route){ FilmsScreen(navController = navController)}
//                composable(AppDestination.BookingScreen.route){ BookingScreen(navController = navController) }
//                composable(AppDestination.BuyTicketsScreen.route){ BuyTicketsScreen(navController = navController) }
//            }
//        }
//    }
}