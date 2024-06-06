package pe.edu.idat.appbasiccomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EjemploColumnas(){
    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 25.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Luis Angel",
            Modifier
                .fillMaxWidth()
                .background(Color.Blue))
        Text(text = "Juan Lopez", Modifier.fillMaxWidth())
        Text(text = "Javier Medrano", Modifier.fillMaxWidth())
        Text(text = "German Huiman", Modifier.fillMaxWidth())
        Text(text = "Carolina Yataco", Modifier.fillMaxWidth())
    }
}

@Composable
fun EjemploBox(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Box(modifier = Modifier
            .background(Color.Gray)
            .width(200.dp)
            .height(200.dp),
            contentAlignment = Alignment.Center) {
            Text(text = "Hola mundo!!")
        }

    }
}

@Composable
fun espacio(tamanio: Int){
    Spacer(modifier = Modifier.height(tamanio.dp))
}

@Composable
fun EjemploContainer(){
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f),
            contentAlignment = Alignment.Center) {
            Text(text = "Luis Angel")
        }
        espacio(tamanio = 45)
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .weight(1f)) {
            Box(
                Modifier
                    .fillMaxHeight()
                    .background(Color.Yellow)
                    .weight(1f),
                contentAlignment = Alignment.Center) {
                Text(text = "Karla Lopez")
            }
            Box(
                Modifier
                    .fillMaxHeight()
                    .background(Color.Magenta)
                    .weight(1f),
                contentAlignment = Alignment.Center) {
                Text(text = "Juan Lopez")
            }
        }
    }
}