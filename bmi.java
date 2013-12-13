package com.example.bmipro2;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;





public class bmi extends Activity {

 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.bmi);

 
 
  final EditText umur = (EditText) findViewById(R.id.editText1);
  final EditText tinggi = (EditText) findViewById(R.id.editText2);
  final EditText berat = (EditText) findViewById(R.id.editText3);
  final TextView viewHasil = (TextView) findViewById(R.id.textView8);
  Button tambah = (Button) findViewById(R.id.button2);
  tambah.setOnClickListener(new OnClickListener() {

   @Override
   public void onClick(View arg0) {
    int umr = Integer.parseInt(umur.getText().toString());
    int tng = Integer.parseInt(tinggi.getText().toString());
    int brt = Integer.parseInt(berat.getText().toString());
    
    int hasil = umr + tng+ brt;
    viewHasil.setText(String.valueOf(hasil));
   }
  });
 
 }
}
