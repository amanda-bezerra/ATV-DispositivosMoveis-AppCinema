package br.com.amanda.atv_iii_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText emailField, senhaField;
    private CheckBox lembrarSenhaCheckBox;
    private Button btnEntrar;
    private TextView linkRegister, linkForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciando os componentes do layout
        emailField = findViewById(R.id.email);
        senhaField = findViewById(R.id.senha);
        lembrarSenhaCheckBox = findViewById(R.id.lembrar_senha);
        btnEntrar = findViewById(R.id.btn_entrar);
        linkRegister = findViewById(R.id.text_view_register); // TextView "Inscreva-se"
        linkForgotPassword = findViewById(R.id.text_view_forgot_password);

        // Configuração do CheckBox de "Lembrar a senha"
        lembrarSenhaCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(MainActivity.this, "Senha será lembrada", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Senha não será lembrada", Toast.LENGTH_SHORT).show();
            }
        });

        // Configuração do clique para redirecionar para CadastroActivity
        linkRegister.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
            startActivity(intent);
        });

        // Configuração do clique no botão "Entrar"
        btnEntrar.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Função de login ainda não implementada", Toast.LENGTH_SHORT).show();
        });
    }
}
