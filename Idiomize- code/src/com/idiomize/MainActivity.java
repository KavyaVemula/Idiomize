package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	MediaPlayer ourSong;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ourSong= MediaPlayer.create(MainActivity.this, R.raw.introsong);
		ourSong.start();
		Thread timer=new Thread(){
			public void run()
			{
				try
				{
					sleep(4000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				finally
				{
					Intent openHome= new Intent("com.idiomize.HOME");
					startActivity(openHome);
				}
			}
		};
		
		timer.start();
		
		
	}
	protected void onPause()
	{
		super.onPause();
		ourSong.release();
		finish();
	}
}
