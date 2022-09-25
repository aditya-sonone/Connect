package com.example.connect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.connect.ui.theme.Blue
import com.example.connect.ui.theme.ConnectTheme
import com.example.connect.ui.theme.Typography
import com.example.connect.ui.view.ChatView
import com.example.connect.ui.view.ContactView
import com.example.connect.ui.view.StatusView

enum class HomeTab{
    CHAT, STATUS, CONTACT
}

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConnectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeView()
                }
            }
        }
    }
}

@Composable
fun HomeView() {
    var showMenu by remember {
        mutableStateOf(false)
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Connect", fontSize = 24.sp, fontWeight = FontWeight.Bold)},
                elevation = 0.dp,
                actions = {
                    DropdownMenu(
                        expanded = showMenu,
                        onDismissRequest = { showMenu = false }
                    ) {
                        DropdownMenuItem(onClick = { /*TODO*/ }) {
                            Text(text = "New Group")
                        }
                        DropdownMenuItem(onClick = { /*TODO*/ }) {
                            Text(text = "New Broadcast")
                        }
                        DropdownMenuItem(onClick = { /*TODO*/ }) {
                            Text(text = "Link Device")
                        }
                        DropdownMenuItem(onClick = { /*TODO*/ }) {
                            Text(text = "Setting")
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Search, contentDescription = "Search")
                    }
                    IconButton(onClick = { showMenu = showMenu != true }) {
                        Icon(Icons.Default.MoreVert, contentDescription = "Search")
                    }
                }
            )
        },
        modifier = Modifier.fillMaxSize()
    ) {
        Column(Modifier.fillMaxSize()) {
            var tabSelected by remember {
                mutableStateOf(HomeTab.CHAT)
            }
            HomeTabBar(
                tabSelected,
                onTabSelected = { tabSelected = it }
            )
            when(tabSelected){
                HomeTab.CHAT -> ChatView()
                HomeTab.CONTACT -> ContactView()
                HomeTab.STATUS -> StatusView()
            }
        }
    }
}

@Composable
fun HomeTabBar(
    tabSelected: HomeTab,
    onTabSelected: (HomeTab) -> Unit
) {
    AppTabBar {tabBarModifier ->
        AppTab(modifier = tabBarModifier, titles = HomeTab.values().map{it.name}, tabSelected = tabSelected, onTabSelected = {
            newTab -> onTabSelected(HomeTab.values()[newTab.ordinal])
        })

    }
}

