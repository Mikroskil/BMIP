package com.example.bmipro2;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class hkalori extends Activity {
	private TextView vlemak, vkal, vhns, vkal1, vlemak1,vhns1;
	private String htambah, htambah2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hkalori);
		vlemak = (TextView) findViewById(R.id.htambah);
		vlemak1 = (TextView) findViewById(R.id.textView2);
		vhns = (TextView) findViewById(R.id.saran);
		vkal1 = (TextView) findViewById(R.id.textView1);
		vkal = (TextView) findViewById(R.id.komen);
		vhns1 = (TextView) findViewById(R.id.textView3);
		getParams();
	}
	private void getParams(){
	Bundle extras = getIntent().getExtras();
	if (extras != null) {
		htambah = extras.getString("hasil");
		htambah2 = extras.getString("hskal");
	}
    vlemak.setText("Lemak dalam tubuh (%)");
    vlemak1.setText("" + htambah);
    vhns.setText("Kalori yang dibutuhkan(Kkal)");
    vkal1.setText("" + htambah2);
 }
}

