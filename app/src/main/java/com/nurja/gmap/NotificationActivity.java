package com.nurja.gmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Intz on 15.05.2016.
 */
public class NotificationActivity extends AppCompatActivity {

    private TextView textViewTripmeterMetrics;
    private TextView textViewWayPointMetrics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_notification);
    }
}
