package com.example.corsitest;

import com.example.corsitest.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
//	Button nextButton;
//	ImageView welcomeImage;
//	ImageView instructionsImage;
//	ImageView practiceImage;
//	ImageView greatJobImage;
//	ImageView playImage;
//	ImageView instructionsTextImage;
//	ImageView readyTextImage;
	ImageButton button1;
	ImageButton button2;
	ImageButton button3;
	ImageButton button4;
	ImageButton button5;
	ImageButton button6;
	ImageButton button7;
	ImageButton button8;
	ImageButton button9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		initializeViews();
		setButtonListeners();
	}
	
	public void initializeViews() {
//    	welcomeImage = (ImageView) findViewById(R.id.welcomeImage);
//    	instructionsImage = (ImageView) findViewById(R.id.instructionsImage);
//    	instructionsTextImage = (ImageView) findViewById(R.id.instructionsTextImage);
//    	readyTextImage = (ImageView) findViewById(R.id.readyTextImage);
//    	practiceImage = (ImageView) findViewById(R.id.practiceImage);
//    	greatJobImage = (ImageView) findViewById(R.id.greatJobImage);
//    	playImage = (ImageView) findViewById(R.id.playImage);
//    	nextButton = (Button) findViewById(R.id.nextButton);
    	button1 = (ImageButton) findViewById(R.id.imageButton1);
    	button2 = (ImageButton) findViewById(R.id.imageButton2);
    	button3 = (ImageButton) findViewById(R.id.imageButton3);
    	button4 = (ImageButton) findViewById(R.id.imageButton4);
    	button5 = (ImageButton) findViewById(R.id.imageButton5);
    	button6 = (ImageButton) findViewById(R.id.imageButton6);
    	button7 = (ImageButton) findViewById(R.id.imageButton7);
    	button8 = (ImageButton) findViewById(R.id.imageButton8);
    	button9 = (ImageButton) findViewById(R.id.imageButton9);
    	
    }
	
	public void setButtonListeners() {
		correctButtonListener(button1);
		correctButtonListener(button2);
		correctButtonListener(button3);
		correctButtonListener(button4);
		correctButtonListener(button5);
		correctButtonListener(button6);
		correctButtonListener(button7);
		correctButtonListener(button8);
		correctButtonListener(button9);
	}
	
	void correctButtonListener(final ImageButton button) {
		button.setOnTouchListener(new OnTouchListener() {

		    public boolean onTouch(View v, MotionEvent event) {
		        if (event.getAction() == MotionEvent.ACTION_DOWN ) {
		            button.setImageResource(R.drawable.corsicorrect);

		        }
		         else if (event.getAction() == MotionEvent.ACTION_UP ) {
		            button.setImageResource(R.drawable.corsisquare);

		        }

		        return false;
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
