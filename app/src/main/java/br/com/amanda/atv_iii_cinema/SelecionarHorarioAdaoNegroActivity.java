package br.com.amanda.atv_iii_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SelecionarHorarioAdaoNegroActivity extends AppCompatActivity {

    private ImageView btnFinalizarHorario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecionar_horario_adao_negro); // Certifique-se de que o layout está correto

        // Configurando o botão de finalizar para abrir a tela de pagamento
        btnFinalizarHorario = findViewById(R.id.btnFinalizarHorario);
        btnFinalizarHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelecionarHorarioAdaoNegroActivity.this, PagamentoPixActivity.class);
                startActivity(intent);
            }
        });

        // Configuração para o botão de voltar
        ImageView botaoVoltar = findViewById(R.id.botaoVoltarHorario);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Volta para a tela anterior
            }
        });
    }
}
