package com.example.bteventmodel;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

// %%%%%%%%%%%%%% PHASE FINISHED
//step 4b: implement the apporpriate listener interface
//step 5b: add unimplemented methods
public class MainActivity extends Activity implements OnClickListener  {

	//step 1: declare a reference to the UI components
	// %%%%%%%%%%%%%% PHASE 1
	Button btnShow;
	Button btnQuit;
	EventHandler evtHandler;
	
	//this is the equivalent of java's main() method for an activity.
	// %%%%%%%%%%%%%% PHASE 0
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//step 2: assign the reference to the inflated object
		// %%%%%%%%%%%%%% PHASE 0
		btnShow =  (Button) findViewById(R.id.btnShow);
		btnQuit =  (Button) findViewById(R.id.btnQuit);
		
		// %%%%%%%%%%%%%% PHASE 1
		//Step 3a: create the listener
//		btnShow.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			public void onClick(View arg0) {
//				//step 4a program behavior
//				Toast.makeText(MainActivity.this, "hello from anonymous class", Toast.LENGTH_SHORT).show();
//			}
//		});
		
		
		// %%%%%%%%%%%%%% PHASE 1
		//3b assign listener to this
		btnQuit.setOnClickListener(this);
		
		//3c assign listener as external class, but pass in the context
		evtHandler = new EventHandler(this);
		btnShow.setOnClickListener(evtHandler);
		
		
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	// %%%%%%%%%%%%%% PHASE 1
	@Override
	public void onClick(View v) {
		//step 6b program behavior
		finish();
	}

}
