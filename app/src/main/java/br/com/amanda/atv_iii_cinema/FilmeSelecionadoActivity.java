package br.com.amanda.atv_iii_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FilmeSelecionadoActivity extends AppCompatActivity {

    private ImageView botaoVoltar;
    private TextView tituloFilme, descricaoFilme, duracaoFilme, valorIngresso;
    private ImageView botaoComprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cada tela usa um layout diferente conforme o filme
        setContentView(R.layout.filme_a_luz_do_demonio); // Mude para o layout correto da tela atual

        // Inicializando componentes
        botaoVoltar = findViewById(R.id.botaoVoltar);
        tituloFilme = findViewById(R.id.tituloFilme);
        descricaoFilme = findViewById(R.id.descricaoFilme);
        duracaoFilme = findViewById(R.id.duracaoFilme);
        valorIngresso = findViewById(R.id.valorIngresso);
        botaoComprar = findViewById(R.id.botaoImagem);

        // Configurações e ações
        configurarBotaoVoltar();
        configurarBotaoComprar();
    }

    private void configurarBotaoVoltar() {
        botaoVoltar.setOnClickListener(v -> finish()); // Volta para a tela anterior
    }

    private void configurarBotaoComprar() {
        botaoComprar.setOnClickListener(v -> {
            // Adicione lógica para compra
            Intent intent = new Intent(FilmeSelecionadoActivity.this, CompraActivity.class);
            startActivity(intent);
        });
    }
}
