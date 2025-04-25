package br.com.amanda.atv_iii_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SelecionarHorarioOnePieceActivity extends AppCompatActivity {

    private ImageView btnFinalizarHorario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecionar_horario_onepiece);

        btnFinalizarHorario = findViewById(R.id.btnFinalizarHorario);
        btnFinalizarHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelecionarHorarioOnePieceActivity.this, PagamentoPixOnePieceActivity.class);
                startActivity(intent);
            }
        });

        ImageView botaoVoltar = findViewById(R.id.botaoVoltarHorario);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
