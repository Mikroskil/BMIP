package com.example.bmipro2;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

	


public class bmi extends Activity implements OnClickListener{
	 	
	
	RadioButton rala;
	RadioButton rapr;
	Button but1;
	Button but2;
	EditText tinggi;
	EditText berat;
	EditText umur;
	TextView viewhasil;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bmi);
  
	
		
	rala = (RadioButton) findViewById(R.id.radiolaki);
	rapr = (RadioButton) findViewById(R.id.radiopr);
	but2 = (Button) findViewById(R.id.button2);
	but1 = (Button) findViewById(R.id.button1);
	umur = (EditText) findViewById(R.id.editText1);
	tinggi = (EditText) findViewById(R.id.editText2);
	berat = (EditText) findViewById(R.id.editText3);
	viewhasil = (TextView) findViewById(R.id.textView8);
	
	rala.setOnClickListener(this);
	rapr.setOnClickListener(this);
	but1.setOnClickListener(this);
	but2.setOnClickListener(this);
	}
	
	
	@Override
	public void onClick(View v){
		if (v == but1) {
			umur.setText("");
			tinggi.setText("");
			berat.setText("");
		}
		
		else if (v == but2){
			if  (rala.isChecked()){
				int umr = Integer.parseInt(umur.getText().toString());
				int tng = Integer.parseInt(tinggi.getText().toString());
				int brt = Integer.parseInt(berat.getText().toString());
				int hasil = umr * tng * brt;
				viewhasil.setText(String.valueOf(hasil));
			}
			else if (rapr.isChecked()){
				int umr = Integer.parseInt(umur.getText().toString());
				int tng = Integer.parseInt(tinggi.getText().toString());
				int brt = Integer.parseInt(berat.getText().toString());
				int hasil = umr + tng + brt;
				viewhasil.setText(String.valueOf(hasil));
		   	}
		}
		
	}
}
