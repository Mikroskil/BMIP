package com.example.bmipro2;



import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.content.Intent;
import java.lang.Math;
import java.util.Random;


	


public class kalori extends Activity{
	 	
	
	RadioButton rala;
	RadioButton rapr;
	Button but1;
	Button but2;
	EditText tinggi;
	EditText berat;
	EditText umur;
	EditText leher;
	EditText pinggang;
	EditText pinggul;
	TextView viewhasil;


	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kalori);
  
	
		
	rala = (RadioButton) findViewById(R.id.radiolaki);
	rapr = (RadioButton) findViewById(R.id.radiopr);

	but2 = (Button) findViewById(R.id.button2);
	but1 = (Button) findViewById(R.id.button1);
	umur = (EditText) findViewById(R.id.editText1);
	tinggi = (EditText) findViewById(R.id.editText2);
	berat = (EditText) findViewById(R.id.editText3);
	leher = (EditText) findViewById(R.id.editText4);
	pinggang = (EditText) findViewById(R.id.editText5);
	pinggul = (EditText) findViewById(R.id.editText6);
	viewhasil = (TextView) findViewById(R.id.htambah);
	
	
	
	
	but1.setOnClickListener(new View.OnClickListener() {
		   @Override
	   public void onClick(View w) {
			   if(but1.isClickable()) {
					umur.setText("");
					tinggi.setText("");
					berat.setText("");
					leher.setText("");
					pinggang.setText("");
					pinggul.setText("");
			   }
	    }
	  });
	
	
	but2.setOnClickListener(new View.OnClickListener() {
		   @Override
	   public void onClick(View v) {
	    kirimParams();
	    	
	    }
	  });
	}
	
	public void kirimParams(){
				 double umr, tng, brt, lhr, pgg, pgl, hasil;
				
				if  (rala.isChecked()){
					 umr = Integer.parseInt(umur.getText().toString());
					 tng = Integer.parseInt(tinggi.getText().toString());
					 brt = Integer.parseInt(berat.getText().toString());
					 lhr = Integer.parseInt(leher.getText().toString());
					 pgg = Integer.parseInt(pinggang.getText().toString());
					 pgl = Integer.parseInt(pinggul.getText().toString());
					 hasil = 495/(1.0324-0.19077*(Math.log(pgg-lhr)) + 0.15456*(Math.log(tng)))-450;
					
					viewhasil.setText(String.format("%.2f",hasil));
				}
				else if (rapr.isChecked()){
					 umr = Integer.parseInt(umur.getText().toString());
					 tng = Integer.parseInt(tinggi.getText().toString());
					 brt = Integer.parseInt(berat.getText().toString());
					 lhr = Integer.parseInt(leher.getText().toString());
					 pgg = Integer.parseInt(pinggang.getText().toString());
					 pgl = Integer.parseInt(pinggul.getText().toString());
					 hasil = 495/(1.29579-0.35004*(Math.log(pgg+pgl-lhr+brt-brt)) + 0.221000*(Math.log(tng)))-450;
					
					viewhasil.setText(String.format("%.2f",hasil));
			   	}
				
							
				Intent i = new Intent(kalori.this, hkalori.class);
				i.putExtra("hasil", viewhasil.getText().toString());
				startActivity(i);
			}	
		}

