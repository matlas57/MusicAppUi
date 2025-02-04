package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun SubscriptionView() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            textAlign = TextAlign.Center,
            text = "Manage Subscription"
        )

        Card(elevation = 4.dp) {
            Column (
                modifier = Modifier.wrapContentHeight().padding(16.dp),
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text("Musical")
                        Text("Free Tier")
                    }
                    Row {
                        TextButton(
                            onClick = {}
                        ) {
                            Text("See All Plans")
                        }
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = "See All Plans"
                        )
                    }
                }
                Divider()
                Row (
                    modifier = Modifier.fillMaxWidth().padding(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.AccountBox,
                        contentDescription = "Get a Plan"
                    )
                    Text("Get a Plan")
                }
            }
        }
    }
}