package sg.edu.rp.c346.id19004781.demoreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast my_toast = Toast.makeText(context, "Low Battery", Toast.LENGTH_SHORT);
        my_toast.show();
    }
}