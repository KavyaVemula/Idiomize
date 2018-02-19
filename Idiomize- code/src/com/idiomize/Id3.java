package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Id3 extends Activity implements OnClickListener{

	Button id3next,id3back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.id3_layout);
		id3next=(Button)findViewById(R.id.bid3next);
		id3back=(Button)findViewById(R.id.bid3back);
		
		id3next.setOnClickListener(this);
		id3back.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.bid3next:
			Intent opentest1=new Intent("com.idiomize.TEST1");
			startActivity(opentest1);
			break;
		case R.id.bid3back:
			Intent openpage105=new Intent("com.idiomize.PAGE105");
			startActivity(openpage105);
			break;
		}
	}
	
	

}
