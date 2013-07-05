package com.innervision.infectivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.app.Activity;

public class Menu extends Activity implements OnClickListener{
		
	Button playBtn, newGameBtn, okBtn;
	Button bacterialBtn, fungalBtn, parasiteBtn, prionsBtn, viralBtn, bioBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE); //Remove title bar
		setContentView(R.layout.menu);
		
		playBtn = (Button)findViewById(R.id.button_play);
		
		//set event listeners
        playBtn.setOnClickListener(this);
        
        

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		// New Game or Load a Game Screen
		case R.id.button_play:
			setContentView(R.layout.select_new_or_load);
			newGameBtn = (Button)findViewById(R.id.button_newgame);
			newGameBtn.setOnClickListener(this);			
		break;
		// Select Disease Type Menu Screen
		case R.id.button_newgame:
			setContentView(R.layout.select_disease_type);
			okBtn = (Button)findViewById(R.id.button_ok);
			okBtn.setOnClickListener(this);			
		break;
		case R.id.button_ok:
			
			setContentView(R.layout.select_name_of_disease);
		break;
		}
		
	}

}
