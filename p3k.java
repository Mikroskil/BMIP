package com.example.bmipro2;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable; 
import android.text.TextWatcher; 
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView; 
import android.widget.TextView;


public class p3k extends Activity implements TextWatcher 
{
	TextView textView1; 
	AutoCompleteTextView edit; 
	String[] item = { "alergi dengan reaksi ringan-sedang","Sesak Napas","alergi dengan reaksi parah","Cedera / Terkilir / Keseleo"};

public void onCreate(Bundle savedInstanceState)
		{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.p3k);  
	  textView1 = (TextView) findViewById(R.id.textView1);
		edit = (AutoCompleteTextView) findViewById(R.id.edit);
		edit.addTextChangedListener(this); 
		edit.setAdapter(new ArrayAdapter<String>(this, 
		android.R.layout.simple_dropdown_item_1line, item));
		}
		
		public void onTextChanged(CharSequence s, int start, int 
		before, int count) { 
		textView1.setText(edit.getText()); 
		}
	
	public void beforeTextChanged(CharSequence s, int start, int count, int after) { 
		// not used 
		} 
	
	
	public void afterTextChanged(Editable s) { 
	// not used 
		}
}
