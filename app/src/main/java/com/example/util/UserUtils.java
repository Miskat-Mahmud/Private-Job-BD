package com.example.util;

import com.jobapp.inttechlimited.MyApplication;

public class UserUtils {
    public static String getUserId() {
        return MyApplication.getInstance().getIsLogin() ? MyApplication.getInstance().getUserId() : "";
    }
}
