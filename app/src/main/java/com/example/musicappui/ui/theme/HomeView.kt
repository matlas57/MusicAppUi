package com.example.musicappui.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home() {
    val categories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    val grouped = listOf<String>("New Release", "Favorites", "Top Rated").groupBy { it[0] } //Group elements based on first character
    LazyColumn {
        grouped.forEach{
            //Create a header that sticks as objects below scroll
            stickyHeader {
                Text(text = it.value[0], modifier = Modifier.padding(16.dp), color = Color.Black)
                LazyRow {
                    items(categories) {
                        cat ->
                        BrowserItem(cat = cat, drawable = R.drawable.baseline_music_video_24)
                    }
                }
            }
        }
    }
}

@Composable
fun BrowserItem(cat: String, drawable: Int) {
    Card (
        modifier = Modifier.padding(16.dp).size(200.dp),
        border = BorderStroke(3.dp, color = Color.LightGray)
    ){
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = cat, color = Color.Black)
            Image(painter = painterResource(id = drawable), contentDescription = cat)
        }
    }
}