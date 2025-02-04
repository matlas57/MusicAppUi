package com.example.musicappui.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@Composable
fun Browse() {
    val categories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        items(categories) { cat ->
            BrowseItem(cat, R.drawable.baseline_manage_search_24)
        }
    }
}

@Composable
fun BrowseItem(cat: String, drawable: Int) {
    Card (
        modifier = Modifier.padding(16.dp).size(200.dp),
        border = BorderStroke(3.dp, color = Color.LightGray)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = cat, color = Color.Black)
            Image(painter = painterResource(id = drawable), contentDescription = cat)
        }
    }
}