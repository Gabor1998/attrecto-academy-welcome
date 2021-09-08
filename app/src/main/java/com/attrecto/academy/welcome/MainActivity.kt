package com.attrecto.academy.welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.attrecto.academy.welcome.ui.theme.AttrectoAcademyWelcomeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AttrectoAcademyWelcomeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Attrecto Akadémián")
                }
            }
        }
    }
}

@Composable
fun Greeting(event: String) {
    Text(text = "Üdvözöllek az $event!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AttrectoAcademyWelcomeTheme {
        Greeting("Android kurzuson")
    }
}