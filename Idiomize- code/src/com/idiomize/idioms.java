package com.idiomize;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class idioms extends Activity implements OnClickListener{
	
	Button level1,level2,level3;
	Button back;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.idioms_layout);
		

		ObjectAnimator cloudAnim = ObjectAnimator.ofFloat(findViewById(R.id.cloud), "x", -350);
		cloudAnim.setDuration(3000);
		cloudAnim.setRepeatCount(ValueAnimator.INFINITE);
		cloudAnim.setRepeatMode(ValueAnimator.REVERSE);
		cloudAnim.start();
		
		level1=(Button)findViewById(R.id.blevel1);
		level2=(Button)findViewById(R.id.blevel2);
		level3=(Button)findViewById(R.id.blevel3);
		back=(Button)findViewById(R.id.bidiomsback);
		
		
		level1.setOnClickListener(this);
		level2.setOnClickListener(this);
		level3.setOnClickListener(this);
		back.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.blevel1:
			Intent open105=new Intent("com.idiomize.PAGE105");
			startActivity(open105);
			break;
		case R.id.blevel2:
			Intent openlevel2=new Intent("com.idiomize.LEVEL2");
			startActivity(openlevel2);
			break;
		case R.id.blevel3:
			Intent openlevel3=new Intent("com.idiomize.LEVEL3");
			startActivity(openlevel3);
			break;
		case R.id.bidiomsback:
			Intent opentest1=new Intent("com.idiomize.START");
			startActivity(opentest1);
			break;
	
		}
	}
	
	

}
