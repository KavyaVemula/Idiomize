package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Id6 extends Activity implements OnClickListener{

	Button id6next,id6back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.id6_layout);
		id6next=(Button)findViewById(R.id.bid6next);
		id6back=(Button)findViewById(R.id.bid6back);
		
		id6next.setOnClickListener(this);
		id6back.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.bid6next:
			Intent opentest1=new Intent("com.idiomize.TEST2");
			startActivity(opentest1);
			break;
		case R.id.bid6back:
			Intent openpage105=new Intent("com.idiomize.PAGE105");
			startActivity(openpage105);
			break;
		}
	}
	
	

}
