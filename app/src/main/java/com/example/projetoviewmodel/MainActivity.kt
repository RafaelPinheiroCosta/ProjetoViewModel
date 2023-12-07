package com.example.projetoviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projetoviewmodel.ui.telaHome.TelaDois
import com.example.projetoviewmodel.ui.telaHome.TelaHome
import com.example.projetoviewmodel.ui.telaHome.TelaHomeViewModel
import com.example.projetoviewmodel.ui.theme.ProjetoViewModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoViewModelTheme {
                AppProjetoViewModel()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppProjetoViewModel(
    telaHomeViewModel: TelaHomeViewModel = viewModel()
) {

    val controleDeNavegacao =  rememberNavController()

   NavHost(
       navController = controleDeNavegacao,
       startDestination = "TelaHome"
   ){
       composable(
            route = "TelaHome"
       ){
           TelaHome(
               telaHomeViewModel = telaHomeViewModel
           )
       }
       composable(
           route = "TelaDois"
       ){
           TelaDois(
               telaHomeViewModel = telaHomeViewModel
           )
       }

   }



}