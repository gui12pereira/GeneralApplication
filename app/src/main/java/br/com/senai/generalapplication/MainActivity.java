package br.com.senai.generalapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Toolbar toolbar;
    private TextInputLayout txtlEmail;
    private TextInputLayout txtlSenha;
    private EditText txtEmail;
    private EditText txtSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button =  findViewById(R.id.button_login);

        txtlEmail = findViewById(R.id.text_input_email);
        txtlSenha = findViewById(R.id.text_input_password);
        txtEmail = findViewById(R.id.string_email);
        txtSenha = findViewById(R.id.string_password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = txtEmail.getText().toString().trim();
                String senha = txtSenha.getText().toString().trim();

                if (email.isEmpty()) {
                    txtlEmail.setError("E-mail é obrigatório!");
                    txtlEmail.setErrorEnabled(true);
                } else
                    txtlEmail.setErrorEnabled(false);

                if (senha.isEmpty()) {
                    txtlSenha.setError("Senha é obrigatória!");
                    txtlSenha.setErrorEnabled(true);
                } else
                    txtlSenha.setErrorEnabled(false);

                if (!email.isEmpty() && !senha.isEmpty()) {
                    Intent categories = new Intent(MainActivity.this, CategoriesActivity.class);
                    startActivity(categories);
                }
            }
        });
    }
}

