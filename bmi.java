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
	 	
	
	RadioButton ra0;
	RadioButton ra1;
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
  
	
		
	ra0 = (RadioButton) findViewById(R.id.radio0);
	ra1 = (RadioButton) findViewById(R.id.radio1);
	but2 = (Button) findViewById(R.id.button2);
	but1 = (Button) findViewById(R.id.button1);
	umur = (EditText) findViewById(R.id.editText1);
	tinggi = (EditText) findViewById(R.id.editText2);
	berat = (EditText) findViewById(R.id.editText3);
	viewhasil = (TextView) findViewById(R.id.textView8);
	
	ra1.setOnClickListener(this);
	ra0.setOnClickListener(this);
	but1.setOnClickListener(this);
	but2.setOnClickListener(this);
	}
	
	

	@Override
	public void onClick(View v){
		if (v == but2){
			but2.setOnClickListener(new OnClickListener() {

				   @Override
				public void onClick(View arg0) {
				int umr = Integer.parseInt(umur.getText().toString());
				int tng = Integer.parseInt(tinggi.getText().toString());
				int brt = Integer.parseInt(berat.getText().toString());

				int hasil = umr + tng+ brt;
				viewhasil.setText(String.valueOf(hasil));
				}
			});
		}
	}
}

//final EditText umur = (EditText) findViewById(R.id.editText1);
//final EditText tinggi = (EditText) findViewById(R.id.editText2);
//final EditText berat = (EditText) findViewById(R.id.editText3);
//final TextView viewHasil = (TextView) findViewById(R.id.textView8);
// Button tambah = (Button) findViewById(R.id.button2);
// tambah.setOnClickListener(new OnClickListener() {

/*   @Override
public void onClick(View arg0) {
int umr = Integer.parseInt(umur.getText().toString());
int tng = Integer.parseInt(tinggi.getText().toString());
int brt = Integer.parseInt(berat.getText().toString());

int hasil = umr + tng+ brt;
viewHasil.setText(String.valueOf(hasil));
}
});
*/
