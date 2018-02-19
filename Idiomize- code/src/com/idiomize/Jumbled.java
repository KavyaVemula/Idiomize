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

public class Jumbled extends Activity{

	TextView jumbledquestion;
	EditText jumbledanswer;
	Button go;
	TextView jumbledcorrect;
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
		setContentView(R.layout.jumbled_layout);
		init();
	}

	public void init() {
	 questions=new String[]{"gihlt","carkt","tpsa","etts","orwra","rmuro","laos"};
	 answers=new String[]{"light","track","past","test","arrow","rumor","also"};
	 q=-1;
	 jumbledquestion=(TextView)findViewById(R.id.jumbledquestion);
	 jumbledanswer=(EditText)findViewById(R.id.jumbledanswer);
	 go=(Button)findViewById(R.id.jumbledgo);
	 jumbledcorrect=(TextView)findViewById(R.id.jumbledcorrectans);
	 nextquestion=(Button)findViewById(R.id.jumblednext);
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
	jumbledquestion.setText(questions[q]);
	jumbledanswer.setText("");
	jumbledcorrect.setText("");
	
}
public boolean isCorrect(String ans)
{
	return(ans.equalsIgnoreCase(answers[q]));
}

public void checkAnswer()
{
	String ans=jumbledanswer.getText().toString();
	if(isCorrect(ans))
	{
		 correctsm.setVisibility(View.VISIBLE);
		    wrongsm.setVisibility(View.GONE);
		ourSong= MediaPlayer.create(Jumbled.this, R.raw.correct);
		ourSong.start();
		jumbledcorrect.setText("You're right!! :D");
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
		ourSong1= MediaPlayer.create(Jumbled.this, R.raw.wrong);
		ourSong1.start();	
	jumbledcorrect.setText("wrong ans..correct ans is:" + answers[q]);	
	
	}}
}	
	
}
