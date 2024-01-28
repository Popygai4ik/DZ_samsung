package ru.myitschool.mte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ru.myitschool.mte.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String login = getIntent().getStringExtra("login");
        String password = getIntent().getStringExtra("password");

        binding.textViewLogin.setText("Login: " + login);
        binding.textViewPassword.setText("Password: " + password);

        binding.buttonBack.setOnClickListener(view -> {onBackPressed();
        });
    }
}