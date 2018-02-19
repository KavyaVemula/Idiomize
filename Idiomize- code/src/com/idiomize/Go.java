package com.idiomize;






import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;



public class Go extends Activity  {
	
	 public int goal;
	
	Button bjumbled;
	Button bwhatami,logo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.go_layout);
		ObjectAnimator cloudAnim = ObjectAnimator.ofFloat(findViewById(R.id.cloud), "x", -350);
		cloudAnim.setDuration(3000);
		cloudAnim.setRepeatCount(ValueAnimator.INFINITE);
		cloudAnim.setRepeatMode(ValueAnimator.REVERSE);
		cloudAnim.start();
		bjumbled=(Button)findViewById(R.id.bjumbled);
		bwhatami=(Button)findViewById(R.id.bwhatami);
		logo=(Button)findViewById(R.id.blogo);
		bjumbled.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openjumbled=new Intent("com.idiomize.JUMBLED");
				startActivity(openjumbled);
			}
		});
		
     bwhatami.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent openwhatami=new Intent("com.idiomize.WHATAMI");
			startActivity(openwhatami);
		}
	});
     
     logo.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent openlogo= new Intent("com.idiomize.LOGO");
			startActivity(openlogo);
			
		}
	});
		
		
	}



	










	
}


