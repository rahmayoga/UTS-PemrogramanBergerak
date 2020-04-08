package com.example.uts_pemrogramanbergerak;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton tipea, tipeb, tipec;
    private EditText namabarang, hargasatuan, jumlahsatuan;
    private TextView textView2;
    private TextView textView6;
    private TextView textView7;
    private Button button;
    private TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipea = (RadioButton) findViewById(R.id.tipea);
        tipeb = (RadioButton) findViewById(R.id.tipeb);
        tipec = (RadioButton) findViewById(R.id.tipec);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        namabarang = (EditText) findViewById(R.id.namabarang);
        hargasatuan = (EditText) findViewById(R.id.hargasatuan);
        jumlahsatuan = (EditText) findViewById(R.id.jumlahsatuan);
        button = (Button) findViewById(R.id.button);
        hasil = (TextView) findViewById(R.id.hasil);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int harga = Integer.parseInt(hargasatuan.getText().toString());
                int njumlah = Integer.parseInt(jumlahsatuan.getText().toString());
                int diskon = harga * njumlah;
                int totaldiskon = diskon / 100;
                int totalbayar = harga - totaldiskon;
                hasil.setText(String.valueOf(totalbayar));
            }
        });
    }
    public void keluar (View view){
        finish();
    }
}




