package com.idiomize;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;


public class Start extends Activity{
	
	Button idioms;
	Button games;
	MediaPlayer song;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_layout);
		
		ObjectAnimator cloudAnim = ObjectAnimator.ofFloat(findViewById(R.id.cloud), "x", -350);
		cloudAnim.setDuration(3000);
		cloudAnim.setRepeatCount(ValueAnimator.INFINITE);
		cloudAnim.setRepeatMode(ValueAnimator.REVERSE);
		cloudAnim.start();
		
		
		
		idioms=(Button)findViewById(R.id.bidioms);
		games=(Button)findViewById(R.id.bgames);
		song= MediaPlayer.create(Start.this, R.raw.correct);
		
		idioms.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openidioms= new Intent("com.idiomize.IDIOMS");
				startActivity(openidioms);
			}
		});
		
		games.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent opengo= new Intent("com.idiomize.GO");
				startActivity(opengo);
			}
		});
		
		
		
		
		
	}

	


	
	
}


