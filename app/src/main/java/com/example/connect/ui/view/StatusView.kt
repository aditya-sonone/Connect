package com.example.connect.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.connect.R
import com.example.connect.ui.theme.Blue
import com.google.accompanist.coil.rememberCoilPainter


@Composable
fun StatusView() {
    Row(Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Box(modifier = Modifier.weight(2f).padding(8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.manga_naruto_itachi_achblog_wallpaper_1440x900_full_hd_wallpapers),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(48.dp)
                    .border(2.dp, Blue, CircleShape)
                    .background(Color.LightGray),
                contentScale = ContentScale.Crop
            )
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = null,
                tint = Color.Green,
                modifier = Modifier.offset(x = 32.dp, y = 32.dp)
            )
        }
        Column(
            Modifier
                .padding(8.dp)
                .weight(8f)
        ) {
            Text("Your Status", maxLines = 1, fontSize = 18.sp, fontWeight = FontWeight.SemiBold, color = Blue)
            Spacer(modifier = Modifier.height(4.dp))
            Text("Click to add status", fontSize = 15.sp, color = Color.Gray)
        }
    }
}