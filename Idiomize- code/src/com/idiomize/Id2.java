package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Id2 extends Activity implements OnClickListener{

	Button id2next,id2back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.id2_layout);
		id2next=(Button)findViewById(R.id.bid2next);
		id2back=(Button)findViewById(R.id.bid2back);
		
		id2next.setOnClickListener(this);
		id2back.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.bid2next:
			Intent openid3=new Intent("com.idiomize.ID3");
			startActivity(openid3);
			break;
		case R.id.bid2back:
			Intent openpage105=new Intent("com.idiomize.PAGE105");
			startActivity(openpage105);
			break;
		}
	}
	
	

}
