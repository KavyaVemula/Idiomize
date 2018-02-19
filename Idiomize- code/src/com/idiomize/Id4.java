package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Id4 extends Activity implements OnClickListener{

	Button id4next,id4back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.id4_layout);
		id4next=(Button)findViewById(R.id.bid4next);
		id4back=(Button)findViewById(R.id.bid4back);
		
		id4next.setOnClickListener(this);
		id4back.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.bid4next:
			Intent opentest1=new Intent("com.idiomize.ID5");
			startActivity(opentest1);
			break;
		case R.id.bid4back:
			Intent openpage105=new Intent("com.idiomize.PAGE105");
			startActivity(openpage105);
			break;
		}
	}
	
	

}
