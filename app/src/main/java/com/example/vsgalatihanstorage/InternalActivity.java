package com.example.vsgalatihanstorage;

import

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException; ...

public class InternalActivity extends AppCompatActivity implements View.OnClickListener {


        Button BuatFile, UbahFile, BacaFile, HapusFile;
        TextView textBaca;
        public static final String FILENAME = "namafile.txt" ;
        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal);
            BuatFile = findViewById(R.id.buttonBuatFile);
            UbahFile = findViewById(R.id.buttonUbahFile);
            BacaFile = findViewById(R.id.buttonBacaFile);
            HapusFile = findViewById(R.id.buttonHapusFile);
            textBaca = findViewById(R.id.textBaca) ;


            BuatFile.setOnClickListener(this);
            UbahFile.setOnClickListener(this);
            BacaFile.setOnClickListener(this);
            HapusFile.setOnClickListener(this);
        }
    @Override
           public void onClick(View v) {
            jalankanPerintah(v.getId());

        }
        void BuatFile () throws IOException {
           String isiFile = "Isi text file Internal";
            File file = new File(getFilesDir(),FILENAME);
            FileOutputStream outputStream = null;
            file.createNewFile();

        }
    void UbahFile (){

    }
    void BacaFile (){

    }
    void HapusFile (){

    }
        public void jalankanPerintah(int id){
            switch (id) {
                case R.id.buttonBuatFile:
                    BuatFile();
                    break;
                case R.id.buttonUbahFile:
                    UbahFile();
                    break;
                case R.id.buttonBacaFile:
                    BuatFile();
                    break;
                case R.id.buttonHapusFile:
                    HapusFile();
                    break;
            }
        }
}