package br.com.amanda.atv_iii_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class AberturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abertura);

        // Aguarde alguns segundos e navegue para a Tela Inicial
        new Handler().postDelayed(() -> {
            startActivity(new Intent(AberturaActivity.this, TelaInicialActivity.class));
            finish(); // Fecha a Activity de abertura
        }, 3000); // 3 segundos (ajuste conforme a duração do GIF)
    }
}
