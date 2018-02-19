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

public class L3test extends Activity{
	
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
		setContentView(R.layout.l3test_layout);
		init();
	}
	public void init()
	{
		questions=new String[]{"W_r_ / l_k_ / a /_h_r_ /-Meaning - Works very well or has the desired effect","_ _t /t_e /_x_ /-Meaning - lose the job","_ _i_i_g /_ _ / _h_ / _i_g_ /-Meaning - Waiting for an opportunity to take action, mostly to replace someone else in their job","H_ _e / _o_r / h_a_t / i_ / t_e /_i_h_ /_l_c_ /-Meaning - Refers to a person with good intentions; even though the results are not that impressive"," _ _ / b_n_n_s /-Meaning - Refers to someone who behaves in a crazy way out of emotions"," H_r_ / _ _/ n_i_s /-Meaning - Refers to a person without sentiments and sympathy for anyone."};
		answers=new String[]{"Work like a charm","Get the axe","Waiting in the wings","Have your heart in the right place"," Go bananas","Hard as nails"};
		q=-1;
		question=(TextView)findViewById(R.id.tvl3question);
		answer=(EditText)findViewById(R.id.etl3);
		correctans=(TextView)findViewById(R.id.tvl3correctans);
		go=(Button)findViewById(R.id.bl3check);
		bmenu=(Button)findViewById(R.id.bl3back);
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
				Intent openmenu=new Intent("com.idiomize.LEVEL2");
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
			ourSong= MediaPlayer.create(L3test.this, R.raw.correct);
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

			ourSong1= MediaPlayer.create(L3test.this, R.raw.wrong);
			ourSong1.start();
		correctans.setText("wrong ans..correct ans is:" + answers[q]);	
		
		}}
	
		
	}
	

}
