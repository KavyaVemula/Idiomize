package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {

	Button babout;
	Button bstart;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_layout);
		babout=(Button)findViewById(R.id.baboutus);
		bstart=(Button)findViewById(R.id.bgo);
		
		babout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openAbout= new Intent("com.idiomize.ABOUTUS");
				startActivity(openAbout);
			}
		});
		
		bstart.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openGo =new Intent("com.idiomize.START");
				startActivity(openGo);
			}
		});
		
		
	}

	
	
}
