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
	//AutoCompleteTextView edit; 
	String[] item = { "Sesak napas", 
            "Alergi",
            "Demam",
			 "Gangguan pernapasan",
            "Sakit gigi",
			 "Gigi tanggal",
            "Gigi patah",
			 "Nyeri dada",
			 "Kejang",
			 "Syok",
			 "Suhu ekstrim / Trauma dingin",
			 "Cedera / Terkilir / Keseleo"};
	ListView listView ;

    String[] values = new String[] { "Sesak napas", 
                                     "Alergi",
                                     "Demam",
    								 "Gangguan pernapasan",
                                     "Sakit gigi",
    								 "Gigi tanggal",
                                     "Gigi patah",
    								 "Nyeri dada",
    								 "Kejang",
    								 "Syok",
    								 "Suhu ekstrim / Trauma dingin",
    								 "Cedera / Terkilir / Keseleo"
                                          
                                 
                                    };
	
	public void onCreate(Bundle savedInstanceState)
		{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.p3k);  
	
	    listView = (ListView) findViewById(R.id.list);
	    
	    textView1 = (TextView) findViewById(R.id.textView1);
	    
	    //ini bagian autotext
		//edit = (AutoCompleteTextView) findViewById(R.id.edit);
		//edit.addTextChangedListener(this); 
		//edit.setAdapter(new ArrayAdapter<String>(this, 
		//android.R.layout.simple_dropdown_item_1line, item)); 
		
		//ini listview
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
			           Toast.makeText(getApplicationContext(),
			                      "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
			                      .show();  
			           if(itemValue == "Sesak napas"){
			           textView1.setText("Sesak napas merupakan kondisi ketidaknyamanan dan kesulitan bernapas yang dialami seseorang. Kondisi ini bisa disebabkan oleh gangguan sisitem pernapasan (paru-paru, hidung, tenggorokan) atau gangguan dari luar paru-paru seperti jantung. Jika penderita sadar: 1.Pastikan penderita dalam posisi aman. 2.Segera panggil ambulance atau bantuan orang lain. 3.Tanyakan penyakit yang diderita serta obat-obtan yang biasa dikonsumsi ketika sesak napas.4.Segera berikan obat yang biasa dikonsumsi bila penderita memiliki penyakit khusus seperti sakit jantung. 5.Temani pasien hingga mendapat pertolongan medis.");
			           }
			           else if(itemValue == "Alergi"){
			        	  textView1.setText("Pada alergi tahap ringan sampai sedang penanganannya, sebagai berikut: 1.Cobalah untuk menenangkan penderita karena kecemasan malah akan memperparah kondisinya.2.Ketahui dan identifikasi faktor yang memicu alergi. Jika sedah diketahui segera jauhkan penderita dari pemicunya. Jika pemicu alergi berupa sengatan lebah maka sebaiknya ditangani dengan mengeluarkan sengat dengan pencungkil kuku jangan gunakan pinset karena bisa menghancurkan sengat akibatnya racun akan menyebar lebih banyak.3.Jika penderita mengalami gatal-gatal segera oleskan pelembab yang mengandung kalamin atau berikan sesuatu yang dingin.4.Waspadai penderita dengan gejala-gejala peningkatan distres5.Gejala alergi ringan biasanya hanya memerlukan pengobatan dokter yang ringan seperti antialergi.");
			           }
			           else if(itemValue == "Demam"){
				        	  textView1.setText("Demam merupakan bentuk reaksi yang menandakan adanya infeksi dalam tubuh. Normalnya suhu badan seseorang sekitar 37 �C. Seseorang dapat digolongkan menderita demam bila suhu tubuhnya lebih tinggi dari 38 �C. Dalam keadaan normal suhu tubuh paling tinggi terjadi pada pukul 4 sore dan paling rendah pada pukul 4 pagi.Berbeda dengan orang dewasa pada umumnya, sedikit saja peningkatan suhu tubuh bayi di bawah usia 1 tahun bisa saja menandakan adanya infeksi. Pada bayi yang baru lahir, suhu tubuh yang lebih rendah dari normal juga bisa menandakan adanya penyakit serius.1.Bila suhu tubuh yang tidak melebihi 38,9 �C maka tidak memerlukan obat penurun demam2.Bila suhu tubuh lebih dari 38,9 �C maka berikan obat penurun demam seperti paracetamol atau acetaminofen dengan dosis 10-15 mg/kg berat badan tiap kali minum.3.Jangan berikan aspirin pada anak-anak karena dapat menyebabkan efek samping yang  dapat menyebabkan kematian4.Saat demam tubuh memerlukan banyak cairan. Tiap kenaikan suhu 1 �C tubuh memerlukan cairan sebanyak 12,5%. Itulah alasan mengapa saat demam penderita disarankan untuk banyak minum agar tidak kekurangan cairan.") ;
				           }
			           else if(itemValue == "Gangguan pernapasan"){
				        	  textView1.setText("Jika terjadi gangguan pada pernapasan sebaiknya lakukan tindakan-tindakan berikut ini:1.Periksa pernapasan dengan cara memperhatikan dada pasien. Dekatkan pipi dan telinga Anda ke hidung dan mulut pasien dengan mata mengarah ke dada pasien. Lakukan selama 10 detik.2.Jika pasien masih bernapas tapi pingsan maka arahkan tubuh pasien miring ke kiri (posisi mantap) dan pastikan jalan napas tetap terbuka. Segera minta bantuan ahli medis dan lakukan pengecekan tiap 2 menit apakah pasien masih bernapas atau tidak.3.Bila pasien mengalami kesulitan bernapas atau bahkan tidak bernapas, lakukan tindakan ini:4.Segera hubungi ahli medis untuk meminta bantuan.5.Buka jalan napas dengan menengadahkan kepala pasien dan menopang dagu pasien.6.Cek ada tidaknya sumbatan dalam mulut pasien. Jika terdapat sumbatan maka bersihkan dengan dua jari yang sudah dibalut dengan kain. Usap dari bibir sapu ke dalam dan ke arah luar.7.Berikan napas buatan pada pasien. Caranya, tariklah napas seperti biasa kemudian tempelkan bibir Anda ke bibir pasien dengan perantara alat pelindung diri (face mask, face shield); hembuskan perlahan sambil jari tangan menutup hidung pasien dan mata mengarah ke dada pasien untuk mengetahui berhasil atau tidaknya pernapasan buatan yang Anda lakukan. Bila berhasil maka dada pasien akan naik.8.Beri napas buatan sebanyak 2 kali kemudian periksa denyut nadi pasien dengan cara meraba daerah leher dengan jeri telunjuk atau jari tengah seperti yang terlihat pada gambar. Jiak tidak terasa adanya denyut maka langsung lakukan tindakan CPR9.Jika masih terasa adanya denyut nadi maka lakukan napas buatan dengan frekuensi 12 kali per menit setiap 5 detik hingga pasien sadar dan kembali bernapas; pastikan ada tidaknya denyut nadi pasien tiap 2 menit.") ;
				           }
			           else if(itemValue == "Sakit gigi"){
				        	  textView1.setText("Sakit gigi pada umumnyatimbul akibat gigi berlubang dan gangguan pada bagian gusi. Selain itu sakit gigi dapat juga disebabkan adanya kelainan laindari bagian luar gigi, seperti kelainan padatelinga, hidung, bahkan bisa juga disebabkan adanya kelainan pada jantung.1.Konsumsi paracetamol atau aspirin.Penggunaan obat-obatan tersebut dimaksudkan untuk mengurangi rasa sakit yang ditimbulkan dari gejala sakit gigi, yang perlu digarisbawahi adalah obat jenis aspirin tidak diperbolehkan diberikan pada anak-anak karena dapat memicu komplikasi serius.2.Menghindari konsumsi makanan dan minuman manis, pedas, panas serta dingin. Makanan yang terllau manis, pedas, dingin, dan panasdapat menyebabkan iritasi gigi dan akan semakin meningkatkan kadar rasa sakit.3.Berkumur menggunakan air hangat yang dicampur garam pada tiap jam.4.Sakit gigi yang disebabkan gigi berlubang dapatmenutup bagian gigi berlubang dengan menggunakan kapas yang dibasahi minyak cengkeh.5.Jika sakit gigi belum juga reda, baru ambil langkah untuk pergi ke dokter.") ;
				           }
			           else if(itemValue == "Gigi patah"){
				        	  textView1.setText("Gigi patah dapat disebabkan oleh adanya beberapa keadaan seperti lepasnya gigi pada bagian email gigi atau lepasnya gigi pada seluruhbagian mahkota gigi.1.Mengompresbagian gigi yang patah dengan menggunakan kain yang telah dibasahi air dingin. Mengompres gigi dengan mempergunakan air dingin ini bermanfaat untuk meminimalisir pembengkakan.2.Menyimpan patahan gigi ke dalam tempat yang di dalamnya terdapat susu cair.Patahan gigi juga dapatdibungkus dengan menggunakan kain yang basa3.Segera pergi ke dokter gigi.") ;
				           }
			           else if(itemValue == "Gigi tanggal"){
				        	  textView1.setText("jika gigi yang tanggal adalah gigi permanen atau gigi orang dewasa, maka gigi yang tanggal ini dapat dipasangkan kembalipada tempatnya dan jika masih dalam jangka waktu kurang dari 20 menit dapat segera pergi ke dokter gigi.1.Pegang gigi yang tanggal pada bagian mahkotanya, bukan pada bagian akar.2.Hindari atau jangan membersihkan atau menggosokgigi dengan menggunakan benda apapun.3.Bilas gigi dengan menggunakan air dingin yang mengalir selama �10 detik.4.Jika masih memungkinkan, tempatkan gigi kembali pada tempat semula.Selanjutnya gigit kain yang telah dibasahi air dingin untuk menahan gigi yang tanggal kembali pada posisi semula.5.Jika langkah-langkah di atas tidak cukup membantu, segera masukkan gigi pada tempat yang berisi susu cair atau biarkan tetap berada dalam mulut.6.Segera pergi ke dokter gigi.") ;
				           }
			           else if(itemValue == "Nyeri dada"){
				        	  textView1.setText("Nyeri dada merupakan perasaan nyeri yang timbul di daerah dada karena dipicu oleh sesuatu yang merusak seperti trauma, kelainan pada dinding dada, selaput paru (pleura), jantung, diafragma, lambung, atau kerongkongan.Jika penderita tidak sadar1.Segera panggil bantuan2.Langkah breathing3.Langkah CPRJika penderita sadar:1.Segera panggil bantuan2.Tempatkan penderita ke lokasi yang aman3.Tanyakan riwayat penyakit dan obat4.Berikan obat yang biasa dikonsumsi penderita5.Temani penderita sampai ada bantuan medis.") ;
				           }
			           else if(itemValue == "Kejang"){
				        	  textView1.setText("Kejang atau Seizure merupakan cetusan aktivitas listrik abnormal yang terjadi secara tiba-tiba. Aktivitas ini bersifat sementara di antara saraf-saraf otak yang tidak bisa dikendalikan. Hal ini mengakibatkan terganggunya kerja otak dan bisa menyebabkan penurunan kesadaran, gerakan klonik (kelonjotan) atau gerakan tonik (kaku), konvulsi dan fenomena psikologis lainnya. Terjadinya gejala seizure secara berulang tanpa pencetus apapun disebut dengan epilepsi atau ayan.Sementara itu pengertian dari konvulsi adalah gerakan otot-otot tak terkendali yang terjadi tiba-tiba dan serempak serta bersifat menyeluruh. Gerakan ini lebih dikenal dengan kejang. Dengan kata lain, kejang hanya merupakan salah satu manifestasi dari seizure.1.Jangan panik2.Lindungi kepala pasien dari trauma3.Hindari pasien dari jangkauan benda-benda tajam4.Longgarkan baju pada daerah leher5.Baringkan pasien dalam posisi miring agar cairan dapat keluar dan tidak menghalangi saluran napas.6.Segera bersihkan mulut bila ada benda asing didalamnya7.Jangan pegangi pasien yang sedang kejang8.Jangan menaruh benda di mulut untuk mencegah lidah tergigit9.Jangan beri obat, makanan atau minuman kepada pasien selama kejang10.Jangan siram pasien dengan air11.Amati gejala-gejala dan durasi kejang yang terjadi pada pasien guna dilaporkan kepada ahli medis.");
				           }
			           else if(itemValue == "Syok"){
				        	  textView1.setText("Syok merupakan kondisi sirkulasi darah yang gagal secara mendadak karena adanya gangguan peredaran darah atau hilangnya cairan tubuh secara berlebihan. Kegagalan sirkulasi darah bisa sangat berbahaya, bahkan bisa menyebabkan kematian. Hal ini dikarenakan terganggunya sirkulasi darah yang berfungsi mengantar oksigen dan zat-zat lain ke seluruh tubuh serta membuang semua zat sisa yang sudah tidak diperlukan tubuh.1.Pastikan Anda dan penderita berada di tempat yang aman dan tidak membahayakan seperti di lokasi kebakaran.2.Jaga jalan napas penderita.3.Cegah perdarahan dengan balut, tekan, dan peninggian.4.Naikkan tungkai setinggi 8-12 inchi.5.Usahakan tubuh penderita tetap hangat6.Periksa pernapasan dan denyut jantung penderita tiap 5 menit sembari menunggu tibanya bantuan medis.");
				           }
			           else if(itemValue == "Suhu ekstrim / Trauma dingin"){
				        	  textView1.setText("Bila timbul suhu ekstrim yang rendah terdapat dua tahapan yang akan terjadi yakni hipotermia dan frostbite. Hipotermia merupakan kondisi dimana suhu tubuh menurun di bawah suhu normal. Bila turun 1-2 �C maka tingkat hipotermia tergolong masih ringan. Namun, jika turun lebih dari 3 �C maka tingkat hipotermia tergolong berat. Penderita akan mengalami menggigil yang ringan sampai berat tergantung tingkatannya. Selain itu, pasien juga bisa mengalami mati rasa, gerakan melambat, bahkan kesadarannya menurun. Bila hal itu terjadi segera bawa penderita ke rumah sakit.1.Perhatikan pernapasan dan denyut nadi pasien.Bersiaplah melakukan tindakan resusitasi jantung paru.2.Bila keadaan memungkinkan segeralah pindahkan pasien ke ruangan dengan suhu kamar. Namun, bila keadaan tidak memungkinkan segeralah ganti pakaian pasien yang basah dengan pakaian kering kemudian selimuti seluruh tubuh pasien agar hangat.3.Jangan gosok tubuh pasien khususnya pada organ jantung karena bisa menyebabkan komplikasi yang fatal.4.Hangatkan tubuh pasien dengan perlahan. Jangan langsung memanaskan tubuh pasien. Sementara itu, kompres daerah ketiak, dada, leher, pergelangan tangan, dan lipatan paha dengan kain yang dibasahi air hangat.5.Secara perlahan beri minum air hangat bila pasien masih sadar. Bila terlalu cepat menghangatkan tubuh pasien dikhawatirkan bisa menyebabkan gangguan jantung.");
				           }
			           else if(itemValue == "Cedera / Terkilir / Keseleo"){
				        	  textView1.setText("Biasanya sprain ditandai dengan bengkak, nyeri, memar, dan ketidakmampuan menggerakkan sendi. Walaupun demikian, gejalanya tergantung dengan seberapa parahnya sprain yang dialami. Pada dasarnya pengobatan sprain bertujuan untuk mengurangi nyeri dan bengkak yang terjadi. Langkah yang harus dilakukan pada tahap awal (24-48 jam) adalah prinsip RICE (rest, ice, compression, elevation), yakni:1.Rest (istirahat)Sebaiknya kurangi aktivitas saat mengalami sprain. Jangan letakkan beban pada deareh yang mengalami cedera selama 48 jam. Gunakan alat bantu penyangga tubuh dari kayu atau besi yang biasa dicebut crutch untuk mengurangi beban pada cedera.2.Ice (es) Masukkan es yang sudah hancur ke kantung plastik lalu letakkan kantung di daerah yang mengalami cedera selama maksimal 2 menit untuk menghindari cedera akibat dingin.  Compression (penekanan)Lakukan penekanan di daerah yang mengalami cedera untuk mengurangi terjadinya pembengkakan. Perban plastik dapat digunakan untuk melakukan penekanan. Balutan dimuali dari area yang paling jauh dengan jantung ke arah jantung.3.Elevation (peninggian)Usahakan posisi daerah yang cedera lebih tinggi dari jantung. Bila edera terjadi pada perhelangan kaki maka letakkan bantal dibawahnya agar pergelangan kaki lebih tinggi dari jantung. Tindakan ini bertujuan untuk mengurangi pembengkakan.") ;
				           }
			        	   
				}		
				
		     }); 
		}
	public void onTextChanged(CharSequence s, int start, int 
		before, int count) { 

		}
	
	public void beforeTextChanged(CharSequence s, int start, int count, int after) { 
		// not used 
		} 
	
	public void afterTextChanged(Editable s) { 
	// not used 
		}
		
  
  
   

     

}

