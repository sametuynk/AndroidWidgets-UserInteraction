package com.example.androiduserinteraction;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import com.example.androiduserinteraction.databinding.ActivityAlertViewBinding;

public class AlertViewActivity extends AppCompatActivity {

    private ActivityAlertViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAlertViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.buttonNormal.setOnClickListener(v -> {
            //AlertDialog nesnesi oluşturduk
            AlertDialog.Builder ad=new AlertDialog.Builder(AlertViewActivity.this);
            ad.setMessage("Mesaj");
            ad.setTitle("Başlık");
            ad.setIcon(R.drawable.resim1);
            ad.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertViewActivity.this, "Tamam Tıklandı", Toast.LENGTH_SHORT).show();
                }
            });
            ad.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertViewActivity.this, "İptal Tıklandı", Toast.LENGTH_SHORT).show();
                }
            });
            ad.create().show();

        });

        binding.buttonOzel.setOnClickListener(v -> {
            AlertDialog.Builder ad=new AlertDialog.Builder(AlertViewActivity.this);
            ad.setMessage("Özel Mesaj");
            ad.setTitle("Başlık");
            ad.setIcon(R.drawable.resim2);
            ad.setPositiveButton("Özel Tamam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertViewActivity.this, "Özel Tamam Tıklandı", Toast.LENGTH_SHORT).show();
                }
            });
            ad.setNegativeButton("Özel İptal", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(AlertViewActivity.this, "Özel İptal Tıklandı", Toast.LENGTH_SHORT).show();
                }
            });
            ad.create().show();
        });
    }
}