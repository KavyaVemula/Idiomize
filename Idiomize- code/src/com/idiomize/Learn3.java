package com.idiomize;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Learn3 extends Activity{
	
	TextView idiom,meaning,sentence;
	Button next;
	
	int q;
	
	String idioms[];
	String meanings[];
	String sentences[];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.learn3_layout);
		init();
		
	}
	
	public void init()
	{
		idioms=new String[]{"Work like a charm","Get the axe","Waiting in the wings","Have your heart in the right place"," Go bananas"," Hard as nails"};
		meanings=new String[]{"Meaning - Works very well or has the desired effect","Meaning - lose the job","Meaning - Waiting for an opportunity to take action, mostly to replace someone else in their job","Meaning - Refers to a person with good intentions; even though the results are not that impressive","Meaning - Refers to someone who behaves in a crazy way out of emotions","Meaning - Refers to a person without sentiments and sympathy for anyone."};
		sentences=new String[]{"Example - I had cloves from my sore throat and they worked like a charm","Example - The projects team was undergoing a major restructuring, recruitment executives were the first to get the axe","Example - The senior manager is going to retire in next 2 months. Two of his juniors who are waiting in the wings will have a fierce competition","Example - The dinner she had cooked wasn't the best but she had her heart in the right place","Example - Your decision to go abroad for a year will make your family go bananas","Example - He has become as hard as a nail after his brother was brutally murdered"};
		q=-1;
		
		idiom=(TextView)findViewById(R.id.tvl3id);
		meaning=(TextView)findViewById(R.id.tvl3meaning);
		sentence=(TextView)findViewById(R.id.tvl3sentence);
		next=(Button)findViewById(R.id.bl3next);
		
		showIdiom();
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showIdiom();
				
				}
		});

		
		
		
	}

	private void showIdiom() {
		// TODO Auto-generated method stub
		q++;
		if(q==idioms.length)
		{
		q=0;	
		}
		idiom.setText(idioms[q]);
		meaning.setText(meanings[q]);
		sentence.setText(sentences[q]);
		
	}
	

}
