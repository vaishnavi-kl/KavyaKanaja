package com.kavyakanaja.ui.poem

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kavyakanaja.data.model.Poem
import com.kavyakanaja.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllPoemsScreen(
    poems: List<Poem>,
    onPoemClick: (Poem) -> Unit,
    onBack: () -> Unit
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "ಎಲ್ಲ ಕವನ  •  All Poems",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                },

                navigationIcon = {
                    IconButton(onClick = onBack) {

                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = SaffronDark,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

        containerColor = Parchment
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {

            Text(
                text = "${poems.size} ಕವನಗಳು  •  poems",

                style = MaterialTheme.typography.labelMedium.copy(
                    color = InkLight
                ),

                modifier = Modifier.padding(
                    horizontal = 16.dp,
                    vertical = 12.dp
                )
            )

            LazyColumn(
                contentPadding = PaddingValues(
                    horizontal = 12.dp,
                    vertical = 8.dp
                ),

                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                items(poems, key = { it.id }) { poem ->

                    PoemListCard(
                        poem = poem,

                        onClick = {
                            onPoemClick(poem)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun PoemListCard(
    poem: Poem,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },

        shape = RoundedCornerShape(20.dp),

        colors = CardDefaults.cardColors(
            containerColor = CardSurface
        ),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {

            Box(
                modifier = Modifier
                    .width(5.dp)
                    .height(60.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(SaffronGold)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = poem.title,

                    style = MaterialTheme.typography.headlineMedium.copy(
                        color = InkBrown,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    ),

                    maxLines = 1,

                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "✍️ ${poem.poet}  •  ${poem.era}",

                    style = MaterialTheme.typography.labelMedium.copy(
                        color = SaffronDark
                    )
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = poem.text.lines().first(),

                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = InkLight,
                        fontSize = 13.sp
                    ),

                    maxLines = 1,

                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}