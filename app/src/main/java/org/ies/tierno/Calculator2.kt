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
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.ies.tierno.ui.theme.FirstExampleTheme

class Calculator2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            org.ies.tierno.ui.theme.FirstExampleTheme {
                Calculator2Content()
            }
        }
    }
}


@Composable
fun Calculator2Content() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text("1")
                }

                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text("2")
                }

                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text("3")
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text("4")
                }

                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text("5")
                }

                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text("6")
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text("7")
                }

                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text("8")
                }

                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text("9")
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    onClick = {}
                ) {
                    Text(".")
                }

                Button(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(2f),
                    onClick = {}
                ) {
                    Text("=")
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    FirstExampleTheme {
        Calculator2Content()
    }
}
