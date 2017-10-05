package com.example.errorutil;

import android.util.Log;

/**
 * Created by Arnold on 10/5/2017.
 */

public class ErrorDebug {
    private static final String TAG = "SUPER AWESOME APP";

    public static void e (String message){
        Log.e(TAG, message);

    }
}
