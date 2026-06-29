package com.example.learningkotlin.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeView() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Column{
            Text("Welcome to My Todo list App")

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {}) {
                Text("Get Started")
            }

            Spacer(modifier = Modifier.height(16.dp))

            FilledTonalButton(onClick = {}) {
                Text("Tonal Button")
            }

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedButton(onClick = {}) { Text("Outlined Buttons") }

            Spacer(modifier = Modifier.height(16.dp))

            ElevatedButton(onClick = {}) { Text("Elevated Buttons") }

            Spacer(modifier = Modifier.height(16.dp))

            TextButton(onClick = {}) { Text("Text Button") }
        }
    }
    Column {
        Text("Welcome to My Todo list App")
        ProfileCard()
    }

}

@Composable
fun ProfileCard() {
    Column(modifier = Modifier
        .padding(16.dp)){
Text("First Mini Project week 1")

        Text("Name: Mildred")

        Spacer(modifier = Modifier.padding(10.dp))
        Text("Role: Android App Dev")

        Spacer(modifier = Modifier.padding(10.dp))
        Text("City: Bamenda")


    }

}

@Preview
@Composable
fun WelcomeViewPreview() {
    WelcomeView()
}