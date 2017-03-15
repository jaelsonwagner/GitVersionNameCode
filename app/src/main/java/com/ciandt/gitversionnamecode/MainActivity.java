package com.ciandt.gitversionnamecode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String appVersionInfo = String.format("Version Name: %s\nVersion Code: %s\nFlavor: %s\nBuild Type: %s",
                BuildConfig.VERSION_NAME,
                BuildConfig.VERSION_CODE,
                BuildConfig.FLAVOR,
                BuildConfig.BUILD_TYPE
        );

        TextView appVersionNameCode = (TextView) findViewById(R.id.app_version_name_code);
        appVersionNameCode.setText(appVersionInfo);

    }
}
