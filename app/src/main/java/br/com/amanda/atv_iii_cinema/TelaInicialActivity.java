package br.com.amanda.atv_iii_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class TelaInicialActivity extends AppCompatActivity {

    private ImageView filme1_adaonegro; // Adão Negro
    private ImageView filme2_wakanda; // Wakanda Forever
    private ImageView filme3_luzdodeminio; // A Luz do Demônio
    private ImageView filme4_onepiece; // One Piece
    private ImageView iconePerfil; // Perfil icon

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telainicial);

        // IDs corretos mapeados aos botões
        filme1_adaonegro = findViewById(R.id.filme1_adaonegro);
        filme2_wakanda = findViewById(R.id.filme2_wakanda);
        filme3_luzdodeminio = findViewById(R.id.filme3_luzdodeminio);
        filme4_onepiece = findViewById(R.id.filme4_onepiece);
        iconePerfil = findViewById(R.id.iconePerfil);

        // Configurar cliques corretos
        configurarAcoesFilmes();

        // Perfil
        iconePerfil.setOnClickListener(v -> {
            Intent intent = new Intent(TelaInicialActivity.this, PerfilActivity.class);
            startActivity(intent);
        });
    }

    private void configurarAcoesFilmes() {
        filme1_adaonegro.setOnClickListener(v -> {
            Intent intent = new Intent(TelaInicialActivity.this, FilmeAdaoNegroActivity.class);
            startActivity(intent);
        });

        filme2_wakanda.setOnClickListener(v -> {
            Intent intent = new Intent(TelaInicialActivity.this, FilmeWakandaActivity.class);
            startActivity(intent);
        });

        filme3_luzdodeminio.setOnClickListener(v -> {
            Intent intent = new Intent(TelaInicialActivity.this, FilmeALuzDoDemonioActivity.class);
            startActivity(intent);
        });

        filme4_onepiece.setOnClickListener(v -> {
            Intent intent = new Intent(TelaInicialActivity.this, FilmeOnePieceActivity.class);
            startActivity(intent);
        });
    }
}
