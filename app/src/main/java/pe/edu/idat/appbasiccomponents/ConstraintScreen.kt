package pe.edu.idat.appbasiccomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun EjemploConstraint(){
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxBlue, boxRed, boxYellow, boxMagenta) = createRefs()
        Box(modifier = Modifier.size(100.dp).background(Color.Blue)
            .constrainAs(boxBlue){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })
        Box(modifier = Modifier.size(100.dp).background(Color.Red)
            .constrainAs(boxRed){
                top.linkTo(boxBlue.bottom)
                start.linkTo(boxBlue.end)
            })

    }
}