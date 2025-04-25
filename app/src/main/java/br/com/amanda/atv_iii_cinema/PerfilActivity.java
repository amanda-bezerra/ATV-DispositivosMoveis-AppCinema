package br.com.amanda.atv_iii_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    private ImageView botaoVoltarPerfil, botaoMeusIngressos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_perfil); // Certifique-se de que o layout está correto

        // Inicializando os componentes
        botaoVoltarPerfil = findViewById(R.id.botaoVoltarPerfil);
        botaoMeusIngressos = findViewById(R.id.botaoMeusIngressos);

        // Configurar o clique no botão de voltar
        botaoVoltarPerfil.setOnClickListener(v -> finish()); // Volta para a tela anterior

        // Configurar o clique no botão "Meus Ingressos"
        botaoMeusIngressos.setOnClickListener(v -> {
            Intent intent = new Intent(PerfilActivity.this, SeuHistoricoIngressoActivity.class);
            startActivity(intent); // Abre a tela de histórico de ingressos
        });
    }
}
