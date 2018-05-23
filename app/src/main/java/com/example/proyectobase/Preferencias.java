package com.example.proyectobase;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Miguel Á. Núñez on 22/05/2018.
 */
public class Preferencias extends PreferenceActivity {
    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
