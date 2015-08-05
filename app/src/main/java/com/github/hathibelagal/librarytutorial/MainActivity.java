package com.github.hathibelagal.librarytutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.github.hathibelagal.mylittlelibrary.MyView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v = new MyView(this);
        setContentView(v);

    }
}
