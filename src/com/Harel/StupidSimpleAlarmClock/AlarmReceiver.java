package com.Harel.StupidSimpleAlarmClock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class AlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		// start the snooze/stop GUI

		Bundle extras = intent.getExtras();
		int cafea1=0;
		
		if(extras!= null){
			cafea1=extras.getInt("cafea1", 0);
		}
		
		
		Intent intentAlarm = new Intent(context, Bt.class);
		intentAlarm.putExtra("cafea2", cafea1);
		intentAlarm.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(intentAlarm);
	}
}
