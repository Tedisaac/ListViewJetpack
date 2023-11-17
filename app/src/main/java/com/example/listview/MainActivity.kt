package com.example.listview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.listview.ui.theme.ListViewTheme

class MainActivity : ComponentActivity() {
    private lateinit var languages: List<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    languages = listOf(
                        "C++",
                        "C",
                        "C#",
                        "Java",
                        "Kotlin",
                        "Dart",
                        "Python",
                        "Javascript",
                        "SpringBoot",
                        "XML",
                        "Dart",
                        "Node JS",
                        "Typescript",
                        "Dot Net",
                        "GoLang",
                        "MongoDb"
                    )
                    ListView(languages)
                }
            }
        }
    }
}

@Composable
fun ListView(languages: List<String>) {
    val title = "List of Programming Languages"
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                color = Color.Blue,
                fontSize = TextUnit(
                    value = 20.0F,
                    type = TextUnitType.Sp
                ),
                fontWeight = FontWeight.Black
            )
        )
        LazyColumn{
            items(languages) {language ->
                Text(
                    text = language,
                    modifier = Modifier.padding(4.dp)
                )
                Divider(thickness = 5.dp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListViewTheme {
        val languages = listOf(
            "C++", "C", "C#", "Java", "Kotlin", "Dart", "Python", "Javascript", "SpringBoot",
            "XML", "Dart", "Node JS", "Typescript", "Dot Net", "GoLang", "MongoDb"
        )
        ListView(languages)
    }
}