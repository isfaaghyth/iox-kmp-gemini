package di

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import org.koin.core.component.KoinComponent
import ui.GeminiViewModel

object Providers : KoinComponent {

    @Composable
    fun viewModel() = viewModel { GeminiViewModel() }
}