package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    public void Seleccion(View view){
        switch (view.getId()){
            case R.id.fresas:
                Toast.makeText(this, "Estas son fresas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.manzanas:
                Toast.makeText(this, "Estas son manzanas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.platano:
                Toast.makeText(this, "Estos son platanos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cereza:
                Toast.makeText(this, "Estas son cerezas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sandía:
                Toast.makeText(this, "Estas son sandías", Toast.LENGTH_SHORT).show();
                break;
            case R.id.melon:
                Toast.makeText(this, "Estos son melones", Toast.LENGTH_SHORT).show();
                break;
            case R.id.frambuesas:
                Toast.makeText(this, "Estas son frambuesas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.kiwis:
                Toast.makeText(this, "Estos son kiwis", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mango:
                Toast.makeText(this, "Estos son mangos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.naranjas:
                Toast.makeText(this, "Estas son naranjas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pera:
                Toast.makeText(this, "Estas son peras", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pina:
                Toast.makeText(this, "Estas son piñas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.uvas:
                Toast.makeText(this, "Estas son uvas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.zarzamora:
                Toast.makeText(this, "Estas son zarzamoras", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}