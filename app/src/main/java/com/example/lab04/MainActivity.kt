package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab04.ui.theme.Lab04Theme
import com.example.lab04.R

// Modificado por Sergio
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hola, Sergio y Alexander !") // Conflicto resuelto

        Button(
            onClick = { /* acción futura */ },
            modifier = Modifier.padding(top = 24.dp)
        ) {
            Text("Navegar")
        }

        Text(
            text = "¡Bienvenido a Lab04!",
            modifier = Modifier.padding(top = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo de la aplicación",
            modifier = Modifier
                .padding(top = 32.dp)
                .size(200.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04Theme {
        Greeting("Android")
    }
}
