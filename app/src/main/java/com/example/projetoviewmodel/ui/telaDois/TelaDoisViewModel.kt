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

class TelaDoisViewModel() : ViewModel() {

    private var _telaDoisUIState = MutableStateFlow(TelaDoisUIState())
    val telaDoisUIState: StateFlow<TelaDoisUIState> = _telaDoisUIState.asStateFlow()


    fun tocarInformacoesTela() {

        _telaDoisUIState.update { currentState ->
            currentState.copy(
                idImagem = R.drawable.imagem2,
                idBotao = R.string.click,
                idTitulo = R.string.teste_viewmodell
            )
        }
    }

}