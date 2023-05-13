package com.example.mylibrary;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class loadingAlert {
   // private Activity activity;
    private static AlertDialog dialog;

   /*public loadingAlert(Activity activity1){
        activity = activity1;
    }*/
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
