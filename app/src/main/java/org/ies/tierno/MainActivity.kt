package org.ies.tierno
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.ies.tierno.ui.theme.FirstExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstExampleTheme {
                Scaffold() { innerPadding ->
                    Texts(innerPadding)
                }
            }
        }
    }
}

@Composable
fun Texts(padding: PaddingValues) {
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(
            text = "Hello Mikel!",
            fontSize = 24.sp,
        )

        Text(
            text = "Hello Android!",
            fontSize = 24.sp,
        )
    }
}

@Composable
fun MyComplexLayout(padding: PaddingValues) {
    Column(
        modifier = Modifier.padding(padding).fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Este es un título")

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Elemento 1")
            Text(text = "Elemento 2")
            Text(text = "Elemento 3")
        }

        Text(text = "Este es un pie de página")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        fontSize = 24.sp,
        modifier = modifier
    )
}

@Preview(showBackground = true, device = Devices.PIXEL_8, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FirstExampleTheme {
        Scaffold() { innerPadding ->
            MyComplexLayout(innerPadding)
        }
    }
}