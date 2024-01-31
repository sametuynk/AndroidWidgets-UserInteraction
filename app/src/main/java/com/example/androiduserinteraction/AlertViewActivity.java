package com.example.androiduserinteraction;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

            View tasarim=getLayoutInflater().inflate(R.layout.alert_tasarim,null);
            EditText editTextAlert=tasarim.findViewById(R.id.editTextAlert);

            AlertDialog.Builder ad=new AlertDialog.Builder(AlertViewActivity.this);
            ad.setMessage("Özel Mesaj");
            ad.setView(tasarim);
            ad.setTitle("Başlık");
            ad.setIcon(R.drawable.resim2);
            ad.setPositiveButton("Özel Tamam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String gelenVeri=editTextAlert.getText().toString();
                    Toast.makeText(AlertViewActivity.this, "Alınan Veri : "+gelenVeri, Toast.LENGTH_SHORT).show();
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