package ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import di.Providers

@Composable
fun GeminiApp(
    viewModel: GeminiViewModel = Providers.viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Text("Hello world!")
}