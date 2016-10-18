package edu.tecii.android.tipcalc02;

import android.app.Application;

/**
 * Created by ppmtz_000 on 13/09/2016.
 */
public class TipCalcApp extends Application{
    private final static String ABOUT_URL = "https://www.facebook.com/PpMtZo";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
