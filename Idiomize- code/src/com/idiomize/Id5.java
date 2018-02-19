package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Id5 extends Activity implements OnClickListener{

	Button id5next,id5back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.id5_layout);
		id5next=(Button)findViewById(R.id.bid5next);
		id5back=(Button)findViewById(R.id.bid5back);
		
		id5next.setOnClickListener(this);
		id5back.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.bid5next:
			Intent opentest1=new Intent("com.idiomize.ID6");
			startActivity(opentest1);
			break;
		case R.id.bid5back:
			Intent openpage105=new Intent("com.idiomize.PAGE105");
			startActivity(openpage105);
			break;
		}
	}
	
	

}
