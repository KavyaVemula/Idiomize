package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Id1 extends Activity implements OnClickListener{

	Button id1next,id1back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.id1_layout);
		id1next=(Button)findViewById(R.id.bid1next);
		id1back=(Button)findViewById(R.id.bid1back);
		
		id1next.setOnClickListener(this);
		id1back.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.bid1next:
			Intent openid2=new Intent("com.idiomize.ID2");
			startActivity(openid2);
			break;
		case R.id.bid1back:
			Intent openpage105=new Intent("com.idiomize.PAGE105");
			startActivity(openpage105);
			break;
		}
	}
	
	

}
