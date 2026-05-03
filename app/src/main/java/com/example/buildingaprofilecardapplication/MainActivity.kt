package com.example.buildingaprofilecardapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buildingaprofilecardapplication.ui.theme.BuildingAProfileCardApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuildingAProfileCardApplicationTheme {
                ProfileCard()
            }
        }
    }
}

@Composable
fun ProfileCard() {
    // Main vertical layout for the profile card screen
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE3F2FD))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Circular profile image
        Image(
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "Profile picture",
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // User's full name
        Text(
            text = "Gabriel Graves",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0D47A1),
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Short biography
        Text(
            text = "Android development student learning Jetpack Compose and mobile app design.",
            fontSize = 16.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}