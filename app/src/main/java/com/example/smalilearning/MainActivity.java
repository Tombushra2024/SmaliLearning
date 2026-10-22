
package com.example.smalilearning;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Hello! My first Smali app");
        text.setTextSize(24);
        text.setPadding(32, 48, 32, 32);

        setContentView(text);
    }
}
