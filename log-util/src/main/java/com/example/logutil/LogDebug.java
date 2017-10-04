package com.example.logutil;

import android.util.Log;

/**
 * Created by Arnold on 10/3/2017.
 */

public class LogDebug {
    private static final String TAG = "SUPER AWESOME APP";

    public static void d (String message){
        Log.d(TAG, message);

    }
}
