package com.example.projetoviewmodel.ui.telaHome

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.projetoviewmodel.R

data class TelaHomeUIState(
    var campoDeTexto: String = "",
    var idImagem: Int = R.drawable.imagem,
    var idTitulo: Int = R.string.projeto_viewmodel,
    var idBotao: Int = R.string.aperte
)
