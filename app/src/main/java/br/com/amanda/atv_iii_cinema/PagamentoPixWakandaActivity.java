package br.com.amanda.atv_iii_cinema;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PagamentoPixWakandaActivity extends AppCompatActivity {

    private ImageView btnFinalizarPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_pagamento_pix_wakanda); // Layout específico para Wakanda

        // Inicializa o botão "Finalizar"
        btnFinalizarPagamento = findViewById(R.id.btnFinalizarPagamento);

        // Configura o clique no botão
        btnFinalizarPagamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogoConfirmacao();
            }
        });
    }

    // Método para exibir o diálogo de confirmação
    private void mostrarDialogoConfirmacao() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_confirmacao_pagamento); // Layout do diálogo de confirmação
        dialog.setCancelable(false); // Impede que o usuário feche o diálogo tocando fora

        // Configura o botão para fechar o diálogo
        Button botaoFecharDialogo = dialog.findViewById(R.id.botaoFecharDialogo);
        botaoFecharDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // Fecha o diálogo
            }
        });

        dialog.show(); // Exibe o diálogo
    }
}
