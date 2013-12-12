package com.example.bmipro2;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable; 
import android.text.TextWatcher; 
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter; 
import android.widget.AutoCompleteTextView; 
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class p3k extends Activity implements TextWatcher 
{
	TextView textView1; 
	AutoCompleteTextView edit; 
	String[] item = { "alergi dengan reaksi ringan-sedang","Sesak Napas","alergi dengan reaksi parah","Cedera / Terkilir / Keseleo"};
	ListView listView ;

    String[] values = new String[] { "Sesak Napas", 
                                     "alergi dengan reaksi ringan-sedang",
    								 "alergi dengan reaksi parah", 
    								 "Cedera / Terkilir / Keseleo"
                                          
                                 
                                    };
	
	public void onCreate(Bundle savedInstanceState)
		{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.p3k);  
	
	    listView = (ListView) findViewById(R.id.list);
	    
	    textView1 = (TextView) findViewById(R.id.textView1);
		edit = (AutoCompleteTextView) findViewById(R.id.edit);
		edit.addTextChangedListener(this); 
		edit.setAdapter(new ArrayAdapter<String>(this, 
		android.R.layout.simple_dropdown_item_1line, item));
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
			      android.R.layout.simple_list_item_1, android.R.id.text1, values);
		    // Assign adapter to ListView
		    listView.setAdapter(adapter); 

		    listView.setOnItemClickListener(new OnItemClickListener() {
		       

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
			             int position, long id) {
					 // ListView Clicked item index
			           int itemPosition     = position;
			           
			           // ListView Clicked item value
			           String  itemValue    = (String) listView.getItemAtPosition(position);
			           }		
				
		     }); 
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
