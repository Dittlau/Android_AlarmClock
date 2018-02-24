package dittlau.alarmclock;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Daniel on 13-04-2017.
 */

public class AlarmReceiver extends BroadcastReceiver{

    public void onReceive(Context c, Intent i) {

        Log.i("onReceive: ", "received");

        Toast.makeText(c, "Rise and Shine!", Toast.LENGTH_LONG).show();

        Intent intent =new Intent(c,DialogActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        c.startActivity(intent);

    }
}
