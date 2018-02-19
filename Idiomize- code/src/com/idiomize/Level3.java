package com.idiomize;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Level3 extends Activity{
	
	Button learn,test,back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level3_layout);
		ImageView wheel = (ImageView)findViewById(R.id.mini);
		AnimatorSet wheelSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.star_spin);
		wheelSet.setTarget(wheel);
		wheelSet.start();
		learn=(Button)findViewById(R.id.bl3learn);
		test=(Button)findViewById(R.id.bl3test);
		back=(Button)findViewById(R.id.bl3back);
		 
		learn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent openlearn2=new Intent("com.idiomize.LEARN3");
				startActivity(openlearn2);
				
			}
		});
		
		test.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent opentest2=new Intent("com.idiomize.L3TEST");
				startActivity(opentest2);
			}
		});
		
back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openID=new Intent("com.idiomize.IDIOMS");
				startActivity(openID);
			}
		});
		
	}

	
	
}
