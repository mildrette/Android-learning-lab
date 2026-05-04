package com.example.learningkotlin.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Day1(){
    Row(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Column(modifier = Modifier
            .background(Color.Blue)
            .padding(16.dp)) {

            Text("Hello!", color = Color.White)
            Spacer(modifier = Modifier.padding(8.dp))
            Text("My name is Mildred", color = Color.White)
            Spacer(modifier = Modifier.padding(4.dp))
            Text("I am an Android Developer", color = Color.White)
        }
    }

}


@Preview(showBackground = true)
@Composable
fun Day1Preview() {
Day1()
}