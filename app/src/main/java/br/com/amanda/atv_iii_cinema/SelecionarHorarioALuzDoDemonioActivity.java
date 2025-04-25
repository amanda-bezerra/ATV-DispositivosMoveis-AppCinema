package br.com.amanda.atv_iii_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SelecionarHorarioALuzDoDemonioActivity extends AppCompatActivity {

    private ImageView btnFinalizarHorario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecionar_horario_a_luz_do_demonio);

        btnFinalizarHorario = findViewById(R.id.btnFinalizarHorario);
        btnFinalizarHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelecionarHorarioALuzDoDemonioActivity.this, PagamentoPixLuzDemonioActivity.class);
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
