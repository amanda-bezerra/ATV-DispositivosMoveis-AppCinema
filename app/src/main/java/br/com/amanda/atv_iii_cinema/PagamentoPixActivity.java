package br.com.amanda.atv_iii_cinema;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class PagamentoPixActivity extends AppCompatActivity {

    private ImageView btnFinalizarPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_pagamento_pix); // Verifique se o layout está correto

        btnFinalizarPagamento = findViewById(R.id.btnFinalizarPagamento);

        // Listener para o botão "Finalizar"
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
        dialog.setContentView(R.layout.dialog_confirmacao_pagamento); // Certifique-se de ter esse layout
        dialog.setCancelable(false); // Impede o fechamento ao clicar fora do diálogo

        // Botão para fechar o diálogo
        Button botaoFecharDialogo = dialog.findViewById(R.id.botaoFecharDialogo);
        botaoFecharDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // Fecha o diálogo
            }
        });

        dialog.show();
    }
}
