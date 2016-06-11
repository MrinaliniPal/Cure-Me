package com.example.mrinalinigalle.cureme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TermsCond extends AppCompatActivity {

    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);

        TextView textView = (TextView)findViewById(R.id.textView1);
        s1="The home remedies of different diseases have been taken from various different websites and the maker of the app is not responsible for any ill-effect caused to the user after following the remedies.";
        textView.setText(s1);

    }
}
