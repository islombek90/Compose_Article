package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Paragraph
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    GreetingImage(
                        stringResource(R.string.jetpack_compose_tutorial),
                        stringResource(R.string.first_paragraph_name),
                        stringResource(R.string.second_paragraph_name)
                    )
                }

            }
        }
    }
}

@Composable
fun GreetingText(articleName: String, articleFirstParagraph: String,
                 articleSecondParagraph: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = articleName,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = articleFirstParagraph,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(
                start = 16.dp,
                end = 16.dp)
        )
        Text(
            text = articleSecondParagraph,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)

        )
    }
}

@Composable
fun GreetingImage(articleName: String, articleFirstParagraph: String,
                  articleSecondParagraph: String){
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        GreetingText(
            articleName = articleName ,
            articleFirstParagraph = articleFirstParagraph ,
            articleSecondParagraph = articleSecondParagraph )

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        GreetingImage(
            stringResource(R.string.jetpack_compose_tutorial),
            stringResource(R.string.first_paragraph_name),
            stringResource(R.string.second_paragraph_name)
            )
    }
}