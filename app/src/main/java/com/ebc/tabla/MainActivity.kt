package com.ebc.tabla

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ebc.tabla.ui.theme.TablaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TablaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Tabla()
                }

            }
        }
    }
}

@Composable
fun Tabla() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            EncabezadoColumna("Cantidad\nInicial")
            Spacer(modifier = Modifier.width(10.dp))
            EncabezadoColumna("Meses\nAhorro")
            Spacer(modifier = Modifier.width(10.dp))
            EncabezadoColumna("Interés\nGanado")
            Spacer(modifier = Modifier.width(10.dp))
            EncabezadoColumna("Gran\nTotal")
            Spacer(modifier = Modifier.width(10.dp))
        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Celda(texto = "Dato1")
            Spacer(modifier = Modifier.width(10.dp))
            Celda(texto = "Dato2")
            Spacer(modifier = Modifier.width(10.dp))
            Celda(texto = "Dato3")
            Spacer(modifier = Modifier.width(10.dp))
            Celda(texto = "Dato4")
            Spacer(modifier = Modifier.width(10.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Celda(texto = "Dato1")
            Spacer(modifier = Modifier.width(10.dp))
            Celda(texto = "Dato2")
            Spacer(modifier = Modifier.width(10.dp))
            Celda(texto = "Dato3")
            Spacer(modifier = Modifier.width(10.dp))
            Celda(texto = "Dato4")
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}

@Composable
fun EncabezadoColumna(texto: String = "") {
    Box(
        modifier = Modifier
            .background(Color.Cyan)
            .width(90.dp)
            .height(60.dp)
            .wrapContentWidth(Alignment.CenterHorizontally)
            .wrapContentHeight(Alignment.CenterVertically)
    ) {
        Text(
            text = texto,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally),
        )
    }
}

@Composable
fun Celda(texto: String = "") {
    Box(
        modifier = Modifier
            .background(Color.Transparent)
            .width(90.dp)
            .height(60.dp)
            .wrapContentWidth(Alignment.Start)
            .wrapContentHeight(Alignment.CenterVertically)
    ) {
        Text(
            text = texto,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.Start),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TablaTheme {
        Tabla()
    }
}