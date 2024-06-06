package pe.edu.idat.appbasiccomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun FormularioImc(){
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 30.dp)) {
        var talla by rememberSaveable {
            mutableStateOf("")
        }
        var peso by rememberSaveable {
            mutableStateOf("")
        }
        var resultado by rememberSaveable {
            mutableStateOf("")
        }
        Column {
            Text(text = "CALCULADORA IMC",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth())
            espacio(tamanio = 10)
            OutlinedTextField(value = talla,
                onValueChange = { talla = it},
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Ingrese su talla")},
                maxLines = 1,
                singleLine = true,
                keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            espacio(tamanio = 10)
            OutlinedTextField(value = peso,
                onValueChange = {peso = it},
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Ingrese su peso")},
                maxLines = 1,
                singleLine = true,
                keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            espacio(tamanio = 10)
            Button(onClick = {
                resultado = calcularImc(talla.toDouble(),
                    peso.toDouble())
                             }, modifier = Modifier.fillMaxWidth()) {
                Text(text = "CALCULAR")
            }
            espacio(tamanio = 10)
            Text(text = resultado)
        }
    }
}

fun calcularImc(talla: Double, peso: Double): String {
    var tallam = talla / 100
    val valorimc = peso / (tallam * tallam)
    var diagnostico = ""
    if(valorimc <= 16.5){
        diagnostico = "por debajo del peso"
    }else if(valorimc <= 20){
        diagnostico = "con peso normal"
    }else if(valorimc <= 25){
        diagnostico = "con sobrepeso"
    }else if(valorimc <= 30){
        diagnostico = "con obesidad leve"
    }else if(valorimc <= 35){
        diagnostico = "con obesidad media"
    } else{
        diagnostico = "con obesidad mórbida"
    }
    return "Su valor IMC = $valorimc usted se encuentra $diagnostico"
}
