package com.example.musicappui.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicappui.Lib
import com.example.musicappui.libraries

@Composable
fun Library() {
    LazyColumn {
        items(libraries) {
            lib ->
            LibraryItem(lib)
            Divider()
        }
    }
}

@Composable
fun LibraryItem(lib: Lib) {
    Column{
        Row (
            modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Row {
                Image(painter = painterResource(lib.icon), contentDescription = lib.name, modifier = Modifier.padding(horizontal = 8.dp))
                Text(text = lib.name, color = Color.Black)
            }
            Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
        }
    }
}