package app.example.hellotextview;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements
		android.view.View.OnClickListener {
	private Button btnone;
	private Button btntwo;
	private Button btnthree;
	private Button btnfour;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewMathching();

	}// onCreate

	private void ViewMathching() {
		// TODO Auto-generated method stub
		btnone = (Button) findViewById(R.id.one);
		btntwo = (Button) findViewById(R.id.two);
		btnthree = (Button) findViewById(R.id.three);
		btnfour = (Button) findViewById(R.id.four);
		btnone.setOnClickListener(this);
		btntwo.setOnClickListener(this);
		btnthree.setOnClickListener(this);
		btnfour.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.one:

			break;
		case R.id.two:
			Intent sresume = new Intent(MainActivity.this, Resume.class);
			startActivity(sresume);

			break;
		case R.id.three:

			break;
		case R.id.four:

			break;

		default:
			break;
		}
	}

}
