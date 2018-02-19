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

public class Logo extends Activity{

	TextView whatquestion;
	EditText whatanswer;
	Button go;
	TextView whatcorrect;
	Button nextquestion;
	int questions[];
	String answers[];
	ImageView imageview;
	int q;
	int id;
	MediaPlayer ourSong;
	MediaPlayer ourSong1;
	ImageView correctsm,wrongsm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logo_layout);
		init();
	}

	public void init() {
		 
		
	 questions=new int[]{getResources().getIdentifier("com.idiomize:drawable/dominos" , null, null),
			 getResources().getIdentifier("com.idiomize:drawable/nike" , null, null),
			 getResources().getIdentifier("com.idiomize:drawable/twitter" , null, null),
			 getResources().getIdentifier("com.idiomize:drawable/adidas" , null, null),
			 getResources().getIdentifier("com.idiomize:drawable/blackberry" , null, null),
			 getResources().getIdentifier("com.idiomize:drawable/gucci" , null, null),
			 getResources().getIdentifier("com.idiomize:drawable/ing" , null, null),
			 getResources().getIdentifier("com.idiomize:drawable/jaguar" , null, null),
			 getResources().getIdentifier("com.idiomize:drawable/lacoste" , null, null),
			 getResources().getIdentifier("com.idiomize:drawable/pringles" , null, null)};
	 answers=new String[]{"dominos","nike","twitter","adidas","blackberry","gucci","ing",
			 "jaguar","lacoste","pringles"};
	 q=-1;
	 
	 whatanswer=(EditText)findViewById(R.id.whatanswer);
	 go=(Button)findViewById(R.id.whatcheck);
	 whatcorrect=(TextView)findViewById(R.id.whatcorrect);
	 nextquestion=(Button)findViewById(R.id.whatnext);
	 imageview=(ImageView)findViewById(R.id.imagequestion);
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
	imageview.setImageResource(questions[q]);
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
	{   correctsm.setVisibility(View.VISIBLE);
	    wrongsm.setVisibility(View.GONE);
		ourSong= MediaPlayer.create(Logo.this, R.raw.correct);
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
	{ wrongsm.setVisibility(View.VISIBLE);
	 correctsm.setVisibility(View.GONE);
		ourSong1= MediaPlayer.create(Logo.this, R.raw.wrong);
		ourSong1.start();
	whatcorrect.setText("wrong ans..correct ans is:" + answers[q]);	
	
	}}
}	
	
}

