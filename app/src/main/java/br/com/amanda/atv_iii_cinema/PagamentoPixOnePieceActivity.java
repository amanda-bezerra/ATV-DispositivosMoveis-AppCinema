package br.com.amanda.atv_iii_cinema;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PagamentoPixOnePieceActivity extends AppCompatActivity {

    private ImageView btnFinalizarPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_pagamento_pix_onepiece);

        btnFinalizarPagamento = findViewById(R.id.btnFinalizarPagamento);

        btnFinalizarPagamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogoConfirmacao();
            }
        });
    }

    private void mostrarDialogoConfirmacao() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_confirmacao_pagamento); // Certifique-se de que este layout existe
        dialog.setCancelable(false);

        Button botaoFecharDialogo = dialog.findViewById(R.id.botaoFecharDialogo);
        botaoFecharDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
