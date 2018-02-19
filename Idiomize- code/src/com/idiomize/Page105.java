package com.idiomize;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Page105 extends Activity implements OnClickListener{

	Button id1,id2,id3,id4,id5,id6,test,test2,bmenu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page105_layout);
		ImageView wheel = (ImageView)findViewById(R.id.mini);
		AnimatorSet wheelSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.star_spin);
		wheelSet.setTarget(wheel);
		wheelSet.start();
		
		id1=(Button)findViewById(R.id.id1);
		id2=(Button)findViewById(R.id.id2);
		id3=(Button)findViewById(R.id.id3);
		test=(Button)findViewById(R.id.test1);
		id4=(Button)findViewById(R.id.id4);
		id5=(Button)findViewById(R.id.id5);
		id6=(Button)findViewById(R.id.id6);
		test2=(Button)findViewById(R.id.test2);
		bmenu=(Button)findViewById(R.id.bmenu);
		
		id1.setOnClickListener(this);
		id2.setOnClickListener(this);
		id3.setOnClickListener(this);
		test.setOnClickListener(this);
		id4.setOnClickListener(this);
		id5.setOnClickListener(this);
		id6.setOnClickListener(this);
		test2.setOnClickListener(this);
		bmenu.setOnClickListener(this);
		
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.id1:
			Intent openid1=new Intent("com.idiomize.ID1");
			startActivity(openid1);
			break;
		case R.id.id2:
			Intent openid2=new Intent("com.idiomize.ID2");
			startActivity(openid2);
			break;
		case R.id.id3:
			Intent openid3=new Intent("com.idiomize.ID3");
			startActivity(openid3);
			break;
		case R.id.test1:
			Intent opentest1=new Intent("com.idiomize.TEST1");
			startActivity(opentest1);
			break;
		case R.id.id4:
			Intent openid4=new Intent("com.idiomize.ID4");
			startActivity(openid4);
			break;
		case R.id.id5:
			Intent openid5=new Intent("com.idiomize.ID5");
			startActivity(openid5);
			break;
		case R.id.id6:
			Intent openid6=new Intent("com.idiomize.ID6");
			startActivity(openid6);
			break;
		case R.id.test2:
			Intent opentest2=new Intent("com.idiomize.TEST2");
			startActivity(opentest2);
			break;
		case R.id.bmenu:
			Intent openmenu=new Intent("com.idiomize.IDIOMS");
			startActivity(openmenu);
			break;
		}
	}
	
	

}
