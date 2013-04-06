package com.example.bteventmodel;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

// %%%%%%%%%%%%%% PHASE Finished
public class EventHandler implements OnClickListener {

	private Context ctx;

	public EventHandler(Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public void onClick(View arg0) {
		Toast.makeText(ctx, "hello from external class", Toast.LENGTH_SHORT).show();
		
	}
	

	
}
