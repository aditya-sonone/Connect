package com.example.connect.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CallMissed
import androidx.compose.material.icons.filled.CallReceived
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.connect.data.Call
import com.example.connect.data.DummyData
import com.example.connect.ui.theme.Blue
import com.google.accompanist.coil.rememberCoilPainter

@Composable
fun ContactView() {
    val dummyCall = DummyData.listCall

    LazyColumn{
        items(dummyCall.size){ index ->
            CallItem(dummyCall[index])
        }
    }
}

@Composable
fun CallItem(call: Call) {
    Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Box(modifier = Modifier.weight(2f)) {
            Image(
                painter = rememberCoilPainter(request = call.imageUrl),
                contentDescription = "Image",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(64.dp)
                    .border(2.dp, Blue, CircleShape),
                contentScale = ContentScale.Crop
            )
        }
        Column(
            Modifier
                .padding(horizontal = 8.dp)
                .weight(7f)) {
            Text(
                text = call.name,
                maxLines = 1,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold
            )
            Row(Modifier.fillMaxWidth()) {
                if (call.isMissCall){
                    Icon(
                        imageVector = Icons.Default.CallMissed,
                        contentDescription = "miss call",
                        tint = Color.Red
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.CallReceived,
                        contentDescription = "Received",
                        tint = Color.Green
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = call.date, fontSize = 15.sp, color = Color.Gray)
            }
            Spacer(modifier = Modifier.height(14.dp))
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "Call",
                tint = Blue
            )
        }
    }
}


@Preview
@Composable
fun Preview() {
    androidx.compose.material.Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ){
        ContactView()
    }
}