package com.mindnotix.validationutils;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Admin on 11/13/2017.
 */

public class Utils {

    public static final boolean isValidPassword(EditText edt) {

        String mPassword = edt.getText().toString();
        int mPassLength = mPassword.length();
        if (mPassLength > 6 && mPassLength < 20) {
            return true;
        }
        return false;
    }

    public static final boolean isEmailValid(String email) {

        if (email == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }

    }

    public static final void ShowToast(Context context, String msg) {
        if (!msg.isEmpty())
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
