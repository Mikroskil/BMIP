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
	RadioButton rarin;
	RadioButton rased;
	RadioButton raber;
	Button but1;
	Button but2;
	EditText tinggi;
	EditText berat;
	EditText umur;
	EditText leher;
	EditText pinggang;
	EditText pinggul;
	TextView viewhasil;
	TextView viewhasil2;
	TextView viewrandom;
	TextView viewrandom2;
	Random rand;
	

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kalori);
  
	
		
	rala = (RadioButton) findViewById(R.id.radiolaki);
	rapr = (RadioButton) findViewById(R.id.radiopr);
	rarin = (RadioButton) findViewById(R.id.radio0);
	rased = (RadioButton) findViewById(R.id.radio1);
	raber = (RadioButton) findViewById(R.id.radio2);
	but2 = (Button) findViewById(R.id.button2);
	but1 = (Button) findViewById(R.id.button1);
	umur = (EditText) findViewById(R.id.editText1);
	tinggi = (EditText) findViewById(R.id.editText2);
	berat = (EditText) findViewById(R.id.editText3);
	leher = (EditText) findViewById(R.id.editText4);
	pinggang = (EditText) findViewById(R.id.editText5);
	pinggul = (EditText) findViewById(R.id.editText6);
	viewhasil = (TextView) findViewById(R.id.htambah);
	viewhasil2 = (TextView) findViewById(R.id.htambah2);
	viewrandom = (TextView) findViewById(R.id.htambah3);
	viewrandom2 = (TextView) findViewById(R.id.htambah4);
	
	
	
	
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
					viewrandom.setText("");
					viewrandom2.setText("");
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
				 double umr, tng, brt, lhr, pgg, pgl, hasil, b, bbi, bmassa, hskal;
				
				if  (rala.isChecked()){
					 umr = Integer.parseInt(umur.getText().toString());
					 tng = Integer.parseInt(tinggi.getText().toString());
					 brt = Integer.parseInt(berat.getText().toString());
					 lhr = Integer.parseInt(leher.getText().toString());
					 pgg = Integer.parseInt(pinggang.getText().toString());
					 pgl = Integer.parseInt(pinggul.getText().toString());
					 hasil = 495/(1.0324-0.19077*(Math.log(pgg-lhr)) + 0.15456*(Math.log(tng)))-450;
					

						if (hasil<14){
							int a=3;
							
							viewrandom.setText(String.valueOf((int)(b=Math.random()*a)));
							if (b>=0 && b<2){
								viewrandom2.setText(String.valueOf("Kadar lemak tubuh anda masih dibawah normal. Tingkatkan kadar lemak dalam tubuh anda dengan cara mengkonsumsi lebih banyak daging, susu, ikan segar, telur, dsb. Lemak dalam tubuh berfungsi sebagai pelindung tubuh dari suhu rendah."));
							}
							else if (b>1&&b<3){
								viewrandom2.setText(String.valueOf("Anda kekurangan lemak. Segera konsumsi makanan yang mengandung lemak untuk meningkatkan kadar lemak dalam tubuh anda. Lemak berfungi sebagai cadangan energi dan mampu membantu melindungi alat vital seperti jantung dengan bantalan lemak."));
							}
							else if (b>2&&b<4){
								viewrandom2.setText(String.valueOf("Lemak yang ada dalam tubuh anda tidak cukup banyak untuk membantu anda menahan rasa lapar. Lemak berfungsi untuk memperlambat pencernaan sehingga timbulnya rasa lapar menjadi sedikit lebih lama. Perbanyak konsumsi daging dan telur."));
							}
						}
						else if (hasil>13 && hasil<26){
							int a=3;
							
							viewrandom.setText(String.valueOf((int)(b=Math.random()*a)));
							if (b>=0 && b<2){
								viewrandom2.setText(String.valueOf("Kandungan kadar lemak yang terdapat dalam tubuh anda bisa dikatakan cukup normal. Hindari konsumsi telur, ikan segar, minyak, keju dan juga daging secara berlebihan agar stabilitas lemak dalam tubuh tetap terjaga."));
							}
							else if (b>1&&b<3){
								viewrandom2.setText(String.valueOf("Lemak dalam tubuh anda sesuai dengan standar yang ditetapkan oleh dinas kesehatan. Kurangi konsumsi daging yang berlebihan, selain mengganggu stabilitas kadar lemak dalam tubuh, hal tersebut juga dapat menimbulkan penyakit lain."));
							}
							else if (b>2&&b<4){
								viewrandom2.setText(String.valueOf("Anda mempunyai kadar lemak yang cukup stabil. Hal ini berdampak baik bagi kesehatan dan kinerja anda karena lemak dalam tubuh anda dapat menghasilkan energi cadangan yang dapat membantu anda dalam melakukan aktifitas sehari-hari"));
							
							}
						}
						else if (hasil>26){
							int a=3;
							
							viewrandom.setText(String.valueOf((int)(b=Math.random()*a)));
							if (b>=0 && b<2){
								viewrandom2.setText(String.valueOf("Kadar lemak yang terdapat dalam tubuh anda berlebihan, kurangi konsumsi daging, ikan, telur dan keju. Tingkatkan aktifitas anda dan rajin berolahraga (Jogging dan Lari) agar dapat membakar lemak yang ada di dalam tubuh anda."));
							}
							else if (b>1&&b<3){
								viewrandom2.setText(String.valueOf("Segera kurangi lemak yang ada dalam tubuh anda dengan olahraga yang teratur dan ikuti aktivitas berupa meditasi, yoga dan relaksasi untuk mengurangi stres. Stres terbukti dapat meningkatkan kadar lemak yang ada dalam tubuh."));
							}
							else if (b>2&&b<4){
								viewrandom2.setText(String.valueOf("Anda kelebihan kandungan lemak dalam tubuh. Perbanyak konsumsi sayur dan buah. Ikuti program diet sehat dan seimbang disertai dengan olahrafa rutin secara teratur untuk mengurangi kandungan lemak yang terdapat dalam tubuh anda."));
							
							}
						}
						
							
					
					
					
					if  (rarin.isChecked()){
						if (umr<40 && umr>0){
							 bbi = (tng + brt - brt - 100) - (0.1 * (tng + pgl -100 - pgl));;
							 bmassa = (bbi*30);
							 hskal = bmassa+(0.15*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
							
							
						}
						else if (umr<60 && umr>39){
							 bbi = (tng - 100) - (0.1 * (tng-100));;
							 bmassa = (bbi*30);
							 hskal = bmassa-(0.05*bmassa)+(0.15*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=60 && umr<70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa-(0.1*bmassa)+(0.15*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa-(0.2*bmassa)+(0.15*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
					}
					else if  (rased.isChecked()){
						if (umr<40 && umr>0){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa+(0.25*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
								
						else if (umr<60 && umr>39){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa-(0.05*bmassa)+(0.25*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=60 && umr<70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa-(0.1*bmassa)+(0.25*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa-(0.2*bmassa)+(0.25*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
					}
					else if  (raber.isChecked()){
						if (umr<40 && umr>0){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa+(0.45*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr<60 && umr>39){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa-(0.05*bmassa)+(0.45*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=60 && umr<70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa-(0.1*bmassa)+(0.45*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*30);
							 hskal = bmassa-(0.2*bmassa)+(0.45*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
					}
					
					
					
					
					viewhasil.setText(String.format("%.2f",hasil));
				}
				else if (rapr.isChecked()){
					 umr = Integer.parseInt(umur.getText().toString());
					 tng = Integer.parseInt(tinggi.getText().toString());
					 brt = Integer.parseInt(berat.getText().toString());
					 lhr = Integer.parseInt(leher.getText().toString());
					 pgg = Integer.parseInt(pinggang.getText().toString());
					 pgl = Integer.parseInt(pinggul.getText().toString());
					 hasil = 495/(1.29579-0.35004*(Math.log((pgg+pgl-lhr)/2)) + 0.221000*(Math.log(tng)))-450;
					
					 
					 if (hasil<21){
							int a=3;
							
							viewrandom.setText(String.valueOf((int)(b=Math.random()*a)));
							if (b>=0 && b<2){
								viewrandom2.setText(String.valueOf("Kandungan lemak yang terdapat pada tubuh anda masih dibawah normal. Perbanyak konsumsi daging, susu, ikan segar, telur, dsb agar kandungan lemak anda kembali normal. Lemak dalam tubuh berfungsi sebagai pengahasil energi cadangan bagi tubuh."));
							}
							else if (b>1&&b<3){
								viewrandom2.setText(String.valueOf("Tingkatkan kandungan lemak dalam tubuh. Segera konsumsi makanan yang mengandung lemak nabati maupun hewani untuk meningkatkan kadar lemak dalam tubuh anda. Lemak berfungi sebagai pelindung alat vital seperti jantung dengan bantalan lemak."));
							}
							else if (b>2&&b<4){
								viewrandom2.setText(String.valueOf("Anda memerlukan lebih banyak makanan yang mengandung lemak karena saat ini anda kekurangan lemak dalam tubuh. Makanan dapat membantu anda meningkatkan kandungan lemak dalam tubuh anda adalah daging, keju, ikan segar dan susu"));
							}
						}
						else if (hasil>20 && hasil<32){
							int a=3;
							
							viewrandom.setText(String.valueOf((int)(b=Math.random()*a)));
							if (b>=0 && b<2){
								viewrandom2.setText(String.valueOf("Tubuh anda mempunyai kandungan lemak yang normal. Kurangi konsumsi makanan yang mengandung lemak agar stabilitas lemak dalam tubuh anda tetap terjaga. Lemak yang berlebihan dapat menyebabkan berbagai penyakit seperti obesitas"));
							}
							else if (b>1&&b<3){
								viewrandom2.setText(String.valueOf("Kandungan lemak yang terdapat dalam tubuh anda tidak berlebihan alias normal. Makanlah makanan yang tidak banyak mengandung lemak seperti buah-buahan dan sayur agar lemak dalam tubuh anda tidak semakin berkembang."));
							}
							else if (b>2&&b<4){
								viewrandom2.setText(String.valueOf("Anda mempunyai kadar lemak yang cukup stabil. Hal ini berdampak baik bagi kesehatan dan kinerja anda karena lemak dalam tubuh anda dapat menghasilkan energi cadangan yang dapat membantu anda dalam melakukan aktifitas sehari-hari"));
							
							}
						}
						else if (hasil>31){
							int a=3;
							
							viewrandom.setText(String.valueOf((int)(b=Math.random()*a)));
							if (b>=0 && b<2){
								viewrandom2.setText(String.valueOf("Kandungan lemak dalam tubuh berlebihan. Segera tingkatkan konsumsi akan buah-buahan dan sayur, kurangi konsumsi daging, ikan, telur dan makanan yang mengandung kadar lemak yang tinggi agar kandungan lemak tidak semakin banyak"));
							}
							else if (b>1&&b<3){
								viewrandom2.setText(String.valueOf("Segera kurangi lemak yang ada dalam tubuh anda dengan olahraga yang teratur dan ikuti aktivitas berupa meditasi, yoga dan relaksasi untuk mengurangi stres. Stres terbukti dapat meningkatkan kadar lemak yang ada dalam tubuh."));
							}
							else if (b>2&&b<4){
								viewrandom2.setText(String.valueOf("Tubuh anda kelebihan kandungan lemak. Perbanyak konsumsi sayur dan buah. Ikuti program diet sehat dan seimbang disertai dengan olahraga rutin secara teratur untuk mengurangi kandungan lemak yang terdapat dalam tubuh anda."));
							
							}
						}
					 
					 
					 
					 
					 if  (rarin.isChecked()){
						if (umr<40 && umr>0){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa+(0.15*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr<60 && umr>39){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa-(0.05*bmassa)+(0.15*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=60 && umr<70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa-(0.1*bmassa)+(0.15*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa-(0.2*bmassa)+(0.15*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
					}
					else if  (rased.isChecked()){
						if (umr<40 && umr>0){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa+(0.25*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr<60 && umr>39){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa-(0.05*bmassa)+(0.25*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=60 && umr<70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa-(0.1*bmassa)+(0.25*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa-(0.2*bmassa)+(0.25*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
					}
					else if  (raber.isChecked()){
						if (umr<40 && umr>0){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa+(0.45*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr<60 && umr>39){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa-(0.05*bmassa)+(0.45*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=60 && umr<70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa-(0.1*bmassa)+(0.45*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
						else if (umr>=70){
							 bbi = (tng - 100) - (0.1 * (tng-100));
							 bmassa = (bbi*25);
							 hskal = bmassa-(0.2*bmassa)+(0.45*bmassa);
							viewhasil2.setText(String.format("%.2f",hskal));
						}
					}
					viewhasil.setText(String.format("%.2f",hasil));
			   	}
				
							
				Intent i = new Intent(kalori.this, hkalori.class);
				i.putExtra("hasil", viewhasil.getText().toString());
				i.putExtra("hskal", viewhasil2.getText().toString());
				i.putExtra("b", viewrandom2.getText().toString());
				startActivity(i);
			}	
		}

