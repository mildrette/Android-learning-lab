package com.example.learningkotlin.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WeekTwoView(){
    Row(modifier = Modifier.fillMaxSize()) {
        Card(modifier = Modifier.background(Color.LightGray)) {
            Text("Learning Card")
        }
    }

}

@Preview
@Composable
fun WeekTwoViewPreview(){
    WeekTwoView()
}