package com.example.projetoviewmodel.ui.telaHome

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.projetoviewmodel.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TelaHomeViewModel() : ViewModel() {

    private var _telaHomeUIState = MutableStateFlow(TelaHomeUIState())
    val telaHomeUIState: StateFlow<TelaHomeUIState> = _telaHomeUIState.asStateFlow()

    var campoDeTexto by mutableStateOf("")
        private set

    fun updateCampoDeTexto(campoDeTexto: String) {
        this.campoDeTexto = campoDeTexto
        _telaHomeUIState.update { currentState ->
            currentState.copy(
                campoDeTexto = campoDeTexto
            )
        }
    }

    fun tocarInformacoesTela() {

        _telaHomeUIState.update { currentState ->
            currentState.copy(
                idImagem = R.drawable.imagem2,
                idBotao = R.string.click,
                idTitulo = R.string.teste_viewmodell
            )
        }
    }

}