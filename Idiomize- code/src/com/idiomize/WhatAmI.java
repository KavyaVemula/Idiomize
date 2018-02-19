package com.idiomize;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class WhatAmI extends Activity{

	TextView whatquestion;
	EditText whatanswer;
	Button go;
	TextView whatcorrect;
	Button nextquestion;
	String questions[];
	String answers[];
	int q;
	MediaPlayer ourSong;
	MediaPlayer ourSong1;
	ImageView correctsm,wrongsm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.whatami_layout);
		init();
	}

	public void init() {
	 questions=new String[]{"I may be made of metal, bone, or wood and have many teeth. My bite hurts no one and the ladies love me. What am I?",
			 "I can be cracked, made, told, and played. What am I?",
			 "I like to twirl my body but keep my head up high. After I go in, everything becomes tight. What am I?",
			 "Although I may have eyes, I cannot see. I have a round brown face with lots of acne. What am I?",
			 "I am lighter than air but a hundred people cannot lift me. Careful, I am fragile. What am I?",
			 "I wear a green jacket on the outside, white jacket as a second layer, and red jacket inside. I am pregnant with a lot of babies. What am I?",
			 "I dance on one feet and knows only one shape. Someone with same name as me is very good with directions. What am I?"};
	 answers=new String[]{"comb","joke","screw","potato","bubble","watermelon","compass"};
	 q=-1;
	 whatquestion=(TextView)findViewById(R.id.whatquestion);
	 whatanswer=(EditText)findViewById(R.id.whatanswer);
	 go=(Button)findViewById(R.id.whatcheck);
	 whatcorrect=(TextView)findViewById(R.id.whatcorrect);
	 nextquestion=(Button)findViewById(R.id.whatnext);
	 correctsm=(ImageView)findViewById(R.id.correctsm);
	 wrongsm=(ImageView)findViewById(R.id.wrongsm);
	 showQuestion();
	 go.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			checkAnswer();
		}

	});
	
	 nextquestion.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			showQuestion();
			
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
	whatquestion.setText(questions[q]);
	whatanswer.setText("");
	whatcorrect.setText("");
	
}
public boolean isCorrect(String ans)
{
	return(ans.equalsIgnoreCase(answers[q]));
}

public void checkAnswer()
{
	String ans=whatanswer.getText().toString();
	if(isCorrect(ans))
	{
		 correctsm.setVisibility(View.VISIBLE);
		    wrongsm.setVisibility(View.GONE);
		ourSong= MediaPlayer.create(WhatAmI.this, R.raw.correct);
		ourSong.start();
		whatcorrect.setText("You're right!! :D");
	}
	if(!isCorrect(ans))
	{
		if(ans.equals(""))
		{
			Toast.makeText(getApplicationContext(),"please enter the answer", Toast.LENGTH_SHORT).show();
		}
	else
	{
		 correctsm.setVisibility(View.GONE);
		    wrongsm.setVisibility(View.VISIBLE);

		ourSong1= MediaPlayer.create(WhatAmI.this, R.raw.wrong);
		ourSong1.start();
	whatcorrect.setText("wrong ans..correct ans is:" + answers[q]);	
	
	}}
}	
	
}

