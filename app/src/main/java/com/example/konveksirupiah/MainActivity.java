package com.example.konveksirupiah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText edt_angka;
    Button bt_yen, bt_pounds, bt_euro, bt_USD;
    TextView tv_hasil;

    double angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_angka = (EditText) findViewById(R.id.et_input);
        bt_yen = (Button) findViewById(R.id.rptoyen);
        bt_euro = (Button) findViewById(R.id.rptoeuro);
        bt_pounds = (Button) findViewById(R.id.rptopounds);
        bt_USD = (Button) findViewById(R.id.rptousd);
        tv_hasil = (TextView) findViewById(R.id.tv_hasil);
    }

    public boolean cek(){
        if (edt_angka.getText().toString().isEmpty()){
            Toast.makeText(this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void toYen(View view){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 125;
        tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(hasil));
        Toast.makeText(this, "1 Yen = Rp 134", Toast.LENGTH_SHORT).show();
    }
    public void toEuro(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 14103;
        tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(hasil));
        Toast.makeText(this, "1 Euro = Rp 17.000", Toast.LENGTH_SHORT).show();
    }

    public void toPounds(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 16618;
        tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.ENGLISH).format( hasil ));
        Toast.makeText(this, "1 poundsterling = Rp 19.500", Toast.LENGTH_SHORT).show();
    }

    public void toUSD(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 13260;
        tv_hasil.setText(NumberFormat.getCurrencyInstance(Locale.US).format(hasil));
        Toast.makeText(this, "1 U$D = Rp 14.000", Toast.LENGTH_SHORT).show();
    }
}