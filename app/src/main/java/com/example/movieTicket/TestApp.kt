package com.example.movieTicket

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.movieTicket.ui.theme.MovieTicketTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TestApp() {


    MovieTicketTheme {
        Scaffold(
            topBar = {
                TopAppBar(title = { Text(text = "kareem") })

            },

content = {
    Column(Modifier.fillMaxSize()) {
        Text("Helloooooooooo", color = Color.DarkGray)

    }
}
        )

    }

}


@Preview
@Composable
fun previewTest(){
    TestApp()
}