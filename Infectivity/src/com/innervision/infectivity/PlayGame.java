package com.innervision.infectivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.app.Activity;

public class PlayGame extends Activity {
	
	ImageView imgNewYorkInfected;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imgNewYorkInfected = (ImageView)findViewById(R.id.img_newyork_infected);
		imgNewYorkInfected.setVisibility(View.GONE);
	}

}
