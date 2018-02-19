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

public class Test1 extends Activity{

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
		setContentView(R.layout.test1_layout);
		init();
		
		
	}

public void init()
{
	questions=new String[]{"A p_n_y/ _ _ _/ y_u_/ _h_ _g_t_/-A way of asking what someone is thinking","A_ _/ i_ _ _l_/ t_ /_n_u_y/-To further a loss with mockery or indignity; to worsen an unfavorable situation","A_/ _ _e/ d_ _p/_ _ /a/ h_t-without any hesitation; instantly","A / p_ _n _ / f_r / y_u_ / th_u_h_s/ -A way of asking what someone is thinking ","_ _ / t_e / d_ _p / _ _ / a / _a_/  -without any hesitation; instantly","_d_ / i_s_ _t / _ _ / _n_u_y / -To further a loss with mockery or indignity; to worsen an unfavorable situation"};
	answers=new String[]{"A penny for your thoughts","Add insult to injury","At the drop of a hat","A penny for your thoughts","At the drop of a hat","Add insult to injury"};
	q=-1;
	question=(TextView)findViewById(R.id.tvtest1);
	answer=(EditText)findViewById(R.id.ettest1);
	correctans=(TextView)findViewById(R.id.tvcorrectans);
	go=(Button)findViewById(R.id.btest1);
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
		ourSong= MediaPlayer.create(Test1.this, R.raw.correct);
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
		ourSong1= MediaPlayer.create(Test1.this, R.raw.wrong);
		ourSong1.start();
	correctans.setText("wrong ans..correct ans is:" + answers[q]);	
	
	}}
}
	
}
