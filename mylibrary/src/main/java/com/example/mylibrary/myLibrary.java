package com.example.mylibrary;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.logging.Handler;

public class myLibrary {
    private static AlertDialog dialog;

    public static void blinkingtext(TextView tv){
        Animation animation = new AlphaAnimation(0.0f,1.0f);
        animation.setDuration(500);
        animation.setStartOffset(200);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);
        tv.startAnimation(animation);
    }
    public static void startAlertDialog(Activity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dialog_layout,null));
        builder.setCancelable(true);
        dialog = builder.create();
        dialog.show();
    }

    public  static  void closeAlertDialog(){
        dialog.dismiss();
    }

}
