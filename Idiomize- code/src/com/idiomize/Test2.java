package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Test2 extends Activity{

	TextView question,correctans;
	EditText answer;
	int q;
	Button go,bmenu;
	String questions[];
	String answers[];
	MediaPlayer ourSong;
	MediaPlayer ourSong1;
	ImageView correctsm,wrongsm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test2_layout);
		init();
		
		
	}

public void init()
{
	questions=new String[]{"B_ _ _/ _o/ t_e /d_ _w_n_/ _o_r_/-When an attempt fails and it's time to start all over.","B_t_ / o_ _/ m_r_/ t_ _n /y_ _ /c_n/ c_e_/-To take on a task that is way to big","B_ _ _/ t_e /m_d_i_h_/ o_ _/-To work late into the night, alluding to the time before electric lighting.","B_ _ _ / t_ /_ _ _/ _r_w_n_ /_ _ar_ /-When an attempt fails and it's time to start all over","B_ _ _ / t_e /_ _d_i_ht/ o_ _ /-To work late into the night, alluding to the time before electric lighting","B_ _e/ _ _ _/ m_r_/ _ _an/ y_ _ /c_n /c_e_ /-To take on a task that is way to big"};
	answers=new String[]{"Back to the drawing board","Bite off more than you can chew","Burn the midnight oil","Back to the drawing board","Burn the midnight oil","Bite off more than you can chew"};
	q=-1;
	question=(TextView)findViewById(R.id.tvtest2);
	answer=(EditText)findViewById(R.id.ettest2);
	correctans=(TextView)findViewById(R.id.tvcorrectans);
	go=(Button)findViewById(R.id.btest2);
	bmenu=(Button)findViewById(R.id.bmenu);
	correctsm=(ImageView)findViewById(R.id.correctsm);
	wrongsm=(ImageView)findViewById(R.id.wrongsm);
	showQuestion();
	go.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			checkAnswer();
			}
	});
	
bmenu.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent openmenu=new Intent("com.idiomize.PAGE105");
			startActivity(openmenu);
			}
	});
	
}

private void showQuestion() {
	// TODO Auto-generated method stub
	q++;
	if(q==questions.length)
	{
	q=0;	
	}
	question.setText(questions[q]);
	answer.setText("");
	
}

public boolean isCorrect(String ans)
{
	return(ans.equalsIgnoreCase(answers[q]));
}

public void checkAnswer()
{
	String ans=answer.getText().toString();
	
	if(isCorrect(ans))
	{
		 correctsm.setVisibility(View.VISIBLE);
		    wrongsm.setVisibility(View.GONE);
		ourSong= MediaPlayer.create(Test2.this, R.raw.correct);
		ourSong.start();
		showQuestion();
		correctans.setText("");
	}
	
	else
	{
		if(ans.equals(""))
		{
			Toast.makeText(getApplicationContext(),"please enter the answer", Toast.LENGTH_SHORT).show();
		}
	else
	{
		 correctsm.setVisibility(View.GONE);
		    wrongsm.setVisibility(View.VISIBLE);
		

		ourSong1= MediaPlayer.create(Test2.this, R.raw.wrong);
		ourSong1.start();
	correctans.setText("wrong ans..correct ans is:" + answers[q]);	
	
	}}
}
	
}
