package com.idiomize;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Learn2 extends Activity{
	
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
		setContentView(R.layout.learn2_layout);
		
		
		init();
		
		
	}
	

public void init()
{
	idioms=new String[]{"idiom:Cut the ground from under feet ","idiom:Chase your tail","idiom:Get ducks in a row","idiom:Think on your feet","idiom:Sail through something","idiom:Not let grass grow under feet"};
	meanings=new String[]{"meaning:When you cut the ground from under someone's feet, you do something which weakens their position","meaning:Spending a lot of time and energy doing a lot of things but actually achieving too little","meaning:Getting your things well organized","Meaning - Adjusting quickly to changes and making fast decisions","Meaning - Being successful in doing something without difficulty","Meaning - Don't delay in getting something done"};
	sentences=new String[]{"sentence:When team India hit more than 350 runs in the ODI, they cut the ground from under the opponent's feet","sentence:He's been chasing his tail all week collecting data but the report is still not ready","sentence:To ensure a successful product launch, we must get our ducks in a row","Example - A good sales man must be able to think on his feet to close the deal","Example - The presentation at the national conference was extremely important for the company. We sailed through it","Example - As soon as he finished all the registration formalities, he put the house on sale. He doesn't let the grass grow under his feet"};
	q=-1;
	
	idiom=(TextView)findViewById(R.id.tvl2id);
	meaning=(TextView)findViewById(R.id.tvl2meaning);
	sentence=(TextView)findViewById(R.id.tvl2sentence);
	next=(Button)findViewById(R.id.bl2next);
	
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
