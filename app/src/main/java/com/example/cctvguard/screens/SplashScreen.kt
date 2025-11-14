package com.example.cctvguard.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.cctvguard.R

@Composable
fun SplashScreen(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.pic),
            contentDescription = "Processor-image",
            modifier = Modifier
                .size(200.dp)
                .padding(top = 0.dp)
                .offset(y = (-60).dp)
                .clip(RoundedCornerShape(40.dp))
        )
        Text(
            text = "welcome camera",
            fontSize = 35.sp,
            fontFamily = FontFamily.Default,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate("Login")
            },
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
        ) { // Changed Color.Gray
            Text(
                "Next page ",
                Modifier.padding(horizontal = 90.dp, vertical = 5.dp),
                fontSize = 22.sp,
            )
        }
    }

}
