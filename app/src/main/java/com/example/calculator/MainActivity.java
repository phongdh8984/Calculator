package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvKetQua;
    Button btnCong, btnTru, btnNhan, btnChia;
    EditText edtSoThu1, edtSoThu2;
    String stringKetQua  = "Kết quả : ";
    String stringPhepTinh = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ánh xạ
        tvKetQua = findViewById(R.id.text_view_result);
        btnCong = findViewById(R.id.button_cong);
        btnTru = findViewById(R.id.button_tru);
        btnNhan = findViewById(R.id.button_nhan);
        btnChia = findViewById(R.id.button_chia);
        edtSoThu1 = findViewById(R.id.edit_text_number_1);
        edtSoThu2 = findViewById(R.id.edit_text_number_2);


        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringPhepTinh = " + ";
                String  textNumber1 = edtSoThu1.getText().toString();
                String  textNumber2 = edtSoThu2.getText().toString();
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập giá trị cho phép tính", Toast.LENGTH_SHORT).show();
                    return;
                }

                Float numberSoThu1 = Float.parseFloat(textNumber1);
                Float numberSoThu2 = Float.parseFloat(textNumber2);
                Float numberKetQua = numberSoThu1 + numberSoThu2;

                boolean isInterger = numberKetQua % 1 == 0;

                if (isInterger){
                    tvKetQua.setText(stringKetQua + textNumber1 + stringPhepTinh + textNumber2 + " = " +String.valueOf(Math.round(numberKetQua) ));
                }else{
                    tvKetQua.setText(stringKetQua + textNumber1 + stringPhepTinh + textNumber2 + " = " + String.valueOf(numberKetQua));
                }

//                Log.d("AAA","Giá trị số 1 : " + textNumber1);
//                Log.d("AAA","Giá trị số 2 : " + textNumber2);
             }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringPhepTinh = " - ";
                String  textNumber1 = edtSoThu1.getText().toString();
                String  textNumber2 = edtSoThu2.getText().toString();
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập giá trị cho phép tính", Toast.LENGTH_SHORT).show();
                    return;
                }

                Float numberSoThu1 = Float.parseFloat(textNumber1);
                Float numberSoThu2 = Float.parseFloat(textNumber2);
                Float numberKetQua = numberSoThu1 - numberSoThu2;

                boolean isInterger = numberKetQua % 1 == 0;

                if (isInterger){
                    tvKetQua.setText(stringKetQua + textNumber1 + stringPhepTinh + textNumber2 + " = " +String.valueOf(Math.round(numberKetQua) ));
                }else{
                    tvKetQua.setText(stringKetQua + textNumber1 + stringPhepTinh + textNumber2 + " = " + String.valueOf(numberKetQua));
                }
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringPhepTinh = " x ";
                String  textNumber1 = edtSoThu1.getText().toString();
                String  textNumber2 = edtSoThu2.getText().toString();
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập giá trị cho phép tính", Toast.LENGTH_SHORT).show();
                    return;
                }

                Float numberSoThu1 = Float.parseFloat(textNumber1);
                Float numberSoThu2 = Float.parseFloat(textNumber2);
                Float numberKetQua = numberSoThu1 * numberSoThu2;

                boolean isInterger = numberKetQua % 1 == 0;

                if (isInterger){
                    tvKetQua.setText(stringKetQua + textNumber1 + stringPhepTinh + textNumber2 + " = " +String.valueOf(Math.round(numberKetQua) ));
                }else{
                    tvKetQua.setText(stringKetQua + textNumber1 + stringPhepTinh + textNumber2 + " = " + String.valueOf(numberKetQua));
                }
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringPhepTinh = " : ";
                String  textNumber1 = edtSoThu1.getText().toString();
                String  textNumber2 = edtSoThu2.getText().toString();
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập giá trị cho phép tính", Toast.LENGTH_SHORT).show();
                    return;
                }

                Float numberSoThu1 = Float.parseFloat(textNumber1);
                Float numberSoThu2 = Float.parseFloat(textNumber2);
                Float numberKetQua = numberSoThu1 / numberSoThu2;

                boolean isInterger = numberKetQua % 1 == 0;

                if (isInterger){
                    tvKetQua.setText(stringKetQua + textNumber1 + stringPhepTinh + textNumber2 + " = " +String.valueOf(Math.round(numberKetQua) ));
                }else{
                    tvKetQua.setText(stringKetQua + textNumber1 + stringPhepTinh + textNumber2 + " = " + String.format("%.2f",numberKetQua));
                }
            }
        });
    }

}