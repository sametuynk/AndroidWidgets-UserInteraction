package com.example.androiduserinteraction;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androiduserinteraction.databinding.ActivitySnackBarBinding;
import com.google.android.material.snackbar.Snackbar;

public class SnackBarActivity extends AppCompatActivity {
    private ActivitySnackBarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySnackBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonNormal1.setOnClickListener(v -> {
            Snackbar.make(v,"Merhaba",Snackbar.LENGTH_SHORT).show();
        });

        binding.buttongeriDonus.setOnClickListener(v -> {

            Snackbar.make(v,"Mesaj Silinsin mi?",Snackbar.LENGTH_SHORT)
                    .setAction("Evet", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Snackbar.make(v,"Mesaj Silindi",Snackbar.LENGTH_SHORT).show();
                        }
                    }).show();
        });

        binding.buttonOzel1.setOnClickListener(v -> {
            Snackbar snackbar=Snackbar.make(v,"İnternet Bağlantısı Kesildi!",Snackbar.LENGTH_SHORT)
                    .setAction("Tekrar Dene", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    });

            snackbar.setActionTextColor(Color.RED);
            snackbar.setBackgroundTint(Color.WHITE);
            snackbar.setTextColor(Color.BLUE);
//
            snackbar.show();
        });

    }
}