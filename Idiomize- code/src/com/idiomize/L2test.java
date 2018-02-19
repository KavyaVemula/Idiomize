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

public class L2test extends Activity{
	
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
		setContentView(R.layout.l2test_layout);
		init();
	}
	
	public void init()
	{
		questions=new String[]{"C_t /t_e /g_o_n_/ f_o_/ _n_e_ / f_ _t /-When you cut the ground from under someone's feet, you do something which weakens their position","_ _a_e / y_u_ / _a_l /-Spending a lot of time and energy doing a lot of things but actually achieving too little","_ _t /d_c_s /_ _ / a /r_w /-Getting your things well organized","S_i_ /_h_o_g_ / _o _ _t_i_g /-Adjusting quickly to changes and making fast decisions","N_t / l_t /g_a_s /g_ow / _nd_r / _ _et/-Don't delay in getting something done"};
		answers=new String[]{"Cut the ground from under feet","Chase your tail","Get ducks in a row","Sail through something","Not let grass grow under feet"};
		q=-1;
		question=(TextView)findViewById(R.id.tvl2question);
		answer=(EditText)findViewById(R.id.etl2);
		correctans=(TextView)findViewById(R.id.tvl2correctans);
		go=(Button)findViewById(R.id.bl2check);
		bmenu=(Button)findViewById(R.id.bl2back);
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
			ourSong= MediaPlayer.create(L2test.this, R.raw.correct);
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

			ourSong1= MediaPlayer.create(L2test.this, R.raw.wrong);
			ourSong1.start();
		correctans.setText("wrong ans..correct ans is:" + answers[q]);	
			}
		
		}
	
		
	}

	

}
