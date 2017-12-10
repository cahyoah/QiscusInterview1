package wkwkw.asek.tesqiscus.helper;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.androidadvance.topsnackbar.TSnackbar;

/**
 * Created by ASUS on 10/12/2017.
 */

public class Util {
    static ProgressDialog dialog;
    public static void showToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void showProgresDialog(Context context){
        dialog= new ProgressDialog(context);
        dialog.setMessage("Silahkan tunggu beberapa saat");
        dialog.setCancelable(false);
        dialog.show();
    }
    public static void closeProgresDialog(){
        dialog.dismiss();
    }

    public static void showSnackBar(CoordinatorLayout coordinatorLayout, String message){
        TSnackbar snackbar = TSnackbar.make(coordinatorLayout, message, TSnackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.WHITE);
        View snackbarView = snackbar.getView();
         TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
        textView.setTextColor(Color.WHITE);
        snackbar.show();
    }
}
