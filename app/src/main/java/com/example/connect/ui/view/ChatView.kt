package com.example.connect.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.connect.data.Chat
import com.example.connect.data.DummyData
import com.example.connect.ui.theme.Blue
import com.google.accompanist.coil.rememberCoilPainter

@Composable
fun ChatView() {
    val dummyChat = DummyData.listChat
    
    LazyColumn{
        items(dummyChat.size){ index -> 
            ChatItem(dummyChat[index])    
        }
    }
}

@Composable
fun ChatItem(chat: Chat) {
    Row(Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Box(modifier = Modifier.padding(horizontal = 16.dp)) {
            Image(
                painter = rememberCoilPainter(request = chat.imageUrl),
                contentDescription = "Image",
                modifier = Modifier
                    .clip(CircleShape)
                    .border(2.dp, Blue, CircleShape)
                    .size(64.dp),
                contentScale = ContentScale.Crop
            )
        }
        Column(Modifier.padding(8.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = chat.name,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    color = Blue
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = chat.time, fontWeight = FontWeight.Light, fontSize = 12.sp)
            }
            Text(
                text = chat.lastMessage ?: "",
                maxLines = 1,
                fontSize = 15.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}


@Preview
@Composable
fun preview() {
    androidx.compose.material.Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ){
        ChatView()
    }
}