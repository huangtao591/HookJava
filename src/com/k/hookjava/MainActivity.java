package com.k.hookjava;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	TextView tvShow = null;
	Button btnTest = null;
	Button btnTestJNI = null;
	hookLib hlib = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		hlib = new hookLib();
		
		try {
			Runtime.getRuntime().exec("su");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		tvShow = (TextView)findViewById(R.id.tvShow);
		btnTest = (Button)findViewById(R.id.btnTest);
		btnTest.setOnClickListener(this);
		btnTestJNI = (Button)findViewById(R.id.btnTestJni);
		btnTestJNI.setOnClickListener(this);
	}
	
	public String test(){
		return "test";
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.btnTest:
			tvShow.setText(test());
			break;
		case R.id.btnTestJni:

			tvShow.setText(hookLib.test());
			break;
		}
	}
}
