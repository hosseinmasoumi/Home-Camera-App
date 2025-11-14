package com.example.cctvguard.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.cctvguard.R

@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.group_5),
                contentDescription = null,
                modifier = Modifier
                    .size(350.dp)
                    .offset(20.dp, (-160).dp)
            )

            Text(
                text = "Masuk",
                fontSize = 35.sp,
                fontFamily = FontFamily.Default,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(0.dp, (-200).dp)
            )
            OutlinedTextField(
                value = email, onValueChange = { newText ->
                    email = newText
                },
//                label = { Text(text = "Masukan Email") },
                placeholder = { Text(text = "Email") }, modifier = Modifier.offset(0.dp, (-130).dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = pass,
                onValueChange = { newText ->
                    pass = newText
                },
//                label = { Text(text = " Password") },
                placeholder = { Text(text = "Password") },
                modifier = Modifier.offset(0.dp, (-50).dp)
            )
            Button(
                onClick = {
                    navController.navigate("Login")
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) { // Changed Color.Gray
                Text(
                    "Next page ",
                    Modifier.padding(horizontal = 90.dp, vertical = 5.dp),
                    fontSize = 22.sp,
                )
            }
        }
    }
}
