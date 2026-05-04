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
fun Day2(){
    val greetings = "Hello there"
    val myName = "my name is Astrid"
    val myJob = "i work as a Cook"
    var mood = "i am energized nd building my future"
    mood = "I am tired, so tired"

    val name = "Astrid"
    val age = 31
    val myHeight =1.6
    val amIHappy = false

    Row(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Column(modifier = Modifier.background(Color.Gray).padding(16.dp)) {
            Text(greetings, color = Color.White)
            Spacer(modifier = Modifier.padding(8.dp))
            Text(myName, color = Color.White)
            Spacer(modifier = Modifier.padding(4.dp))
            Text(myJob, color = Color.White)
            Spacer(modifier = Modifier.padding(4.dp))
            Text(mood, color = Color.White)


        }

        Column(modifier = Modifier.background(Color.Gray).padding(16.dp)) {
            Text("My name is : $name", color = Color.White)
            Spacer(modifier = Modifier.padding(16.dp))
            Text("Age: $age", color = Color.White)
            Spacer(modifier = Modifier.padding(16.dp))
            Text("Height is : $myHeight", color = Color.White)
            Spacer(modifier = Modifier.padding(16.dp))
            Text("Am i really happy right now? : $amIHappy", color = Color.White)


        }
    }
}

@Preview(showBackground = true)
@Composable
fun Day2Preview() {
    Day2()
}