package app.example.hellotextview;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewManager;
import android.widget.TextView;

public class Resume extends Activity {
	private TextView txt1;
	private TextView txt2;
	private TextView txt3;
	private TextView txt4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resume);
		ViewMatching();
		
	}
	private void ViewMatching() {
		// TODO Auto-generated method stub
		txt1 = (TextView) findViewById(R.id.txtname);
		txt2 = (TextView) findViewById(R.id.txtTel);
		txt3 = (TextView) findViewById(R.id.txtnickname);
		txt4 = (TextView) findViewById(R.id.txtemail);
		
	txt1.setText("supaorn ploengpit");
	txt2.setText("0801013317");
	txt3.setText("lek");
	txt4.setText("lek_1543@hotmail.com");
	}

}
