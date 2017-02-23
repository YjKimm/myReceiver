package com.example.yjkim.mysmsreceiver3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class MySMSReceiver3 extends BroadcastReceiver {
    public MySMSReceiver3() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG,"onReceiver() 호출됨");
        //화면 띄우기
        Intent myIntent = new Intent(context, MainActivity.class);
        //화면이 없으면 띄우고 있으면 그 화면에 띄우는 것
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(myIntent);
    }
}
