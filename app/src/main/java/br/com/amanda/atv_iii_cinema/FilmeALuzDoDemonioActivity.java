package br.com.amanda.atv_iii_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FilmeALuzDoDemonioActivity extends AppCompatActivity {

    private ImageView botaoImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filme_a_luz_do_demonio); // Usando o layout correto

        // Inicializando o botão de compra
        botaoImagem = findViewById(R.id.botaoImagem);

        // Configurando o clique para abrir a tela de Selecionar Horário
        botaoImagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FilmeALuzDoDemonioActivity.this, SelecionarHorarioALuzDoDemonioActivity.class);
                startActivity(intent);
            }
        });

        // Configuração para o botão de voltar
        ImageView botaoVoltar = findViewById(R.id.botaoVoltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Volta para a activity anterior
            }
        });
    }
}
