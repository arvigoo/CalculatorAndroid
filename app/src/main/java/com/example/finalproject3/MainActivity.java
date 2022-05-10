package com.example.finalproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    Button buttonDelete, buttonAnswer;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonTitik, button0;
    Button buttonTambah, buttonKurang, buttonKali, buttonBagi, buttonPersen;

    public static double nilaiSekarang = 0;
    public static String operasiSekarang = "";
    public static double hasil = 0.0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init() {

        textView = (TextView) findViewById(R.id.hasil);

        button1 = (Button) findViewById(R.id.satu);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.dua);
        button2.setOnClickListener(this);

        button3 = (Button) findViewById(R.id.tiga);
        button3.setOnClickListener(this);

        button4 = (Button) findViewById(R.id.empat);
        button4.setOnClickListener(this);

        button5 = (Button) findViewById(R.id.lima);
        button5.setOnClickListener(this);

        button6 = (Button) findViewById(R.id.enam);
        button6.setOnClickListener(this);

        button7 = (Button) findViewById(R.id.tujuh);
        button7.setOnClickListener(this);

        button8 = (Button) findViewById(R.id.delapan);
        button8.setOnClickListener(this);

        button9 = (Button) findViewById(R.id.sembilan);
        button9.setOnClickListener(this);

        button0 = (Button) findViewById(R.id.nol);
        button0.setOnClickListener(this);

        buttonTitik = (Button) findViewById(R.id.titik);
        buttonTitik.setOnClickListener(this);

        buttonTambah = (Button) findViewById(R.id.tambah);
        buttonTambah.setOnClickListener(this);

        buttonKurang = (Button) findViewById(R.id.kurang);
        buttonKurang.setOnClickListener(this);

        buttonKali = (Button) findViewById(R.id.kali);
        buttonKali.setOnClickListener(this);

        buttonBagi = (Button) findViewById(R.id.bagi);
        buttonBagi.setOnClickListener(this);

        buttonPersen = (Button) findViewById(R.id.persen);
        buttonPersen.setOnClickListener(this);

        buttonDelete = (Button) findViewById(R.id.delete);
        buttonDelete.setOnClickListener(this);

        buttonAnswer = (Button) findViewById(R.id.answer);
        buttonAnswer.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.satu:
                textView.setText(textView.getText().toString().trim()+"1");
                break;
            case R.id.dua:
                textView.setText(textView.getText().toString().trim()+"2");
                break;
            case R.id.tiga:
                textView.setText(textView.getText().toString().trim()+"3");
                break;
            case R.id.empat:
                textView.setText(textView.getText().toString().trim()+"4");
                break;
            case R.id.lima:
                textView.setText(textView.getText().toString().trim()+"5");
                break;
            case R.id.enam:
                textView.setText(textView.getText().toString().trim()+"6");
                break;
            case R.id.tujuh:
                textView.setText(textView.getText().toString().trim()+"7");
                break;
            case R.id.delapan:
                textView.setText(textView.getText().toString().trim()+"8");
                break;
            case R.id.sembilan:
                textView.setText(textView.getText().toString().trim()+"9");
                break;
            case R.id.titik:
                textView.setText(textView.getText().toString().trim()+".");
                break;
            case R.id.nol:
                textView.setText(textView.getText().toString().trim()+"0");
                break;

            case R.id.tambah:
                operasiSekarang = "tambah";
                nilaiSekarang = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                break;
            case R.id.kurang:
                operasiSekarang = "kurang";
                nilaiSekarang = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                break;
            case R.id.kali:
                operasiSekarang = "kali";
                nilaiSekarang = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                break;
            case R.id.bagi:
                operasiSekarang = "bagi";
                nilaiSekarang = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                break;
            case R.id.persen:
                operasiSekarang = "persen";
                nilaiSekarang = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                break;

            case R.id.delete:
                textView.setText("");
                break;
            case R.id.answer:
                if (operasiSekarang.equals("tambah")) {
                    hasil = nilaiSekarang + Double.parseDouble(textView.getText().toString().trim());
                }

                if (operasiSekarang.equals("kurang")) {
                    hasil = nilaiSekarang - Double.parseDouble(textView.getText().toString().trim());
                }

                if (operasiSekarang.equals("kali")) {
                    hasil = nilaiSekarang * Double.parseDouble(textView.getText().toString().trim());
                }

                if (operasiSekarang.equals("bagi")) {
                    hasil = nilaiSekarang / Double.parseDouble(textView.getText().toString().trim());
                }

                if (operasiSekarang.equals("persen")) {
                    hasil = nilaiSekarang % Double.parseDouble(textView.getText().toString().trim());
                }

                int nilaiTemp = (int) hasil;
                if (nilaiTemp == hasil) {
                    textView.setText(String.valueOf((int)hasil));
                } else {
                    textView.setText(String.valueOf(hasil));
                }
                break;
        }
    }

    }