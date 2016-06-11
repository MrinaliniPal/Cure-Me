package com.example.mrinalinigalle.cureme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.util.Linkify;
import android.widget.TextView;

public class About extends AppCompatActivity {

    String s1,s2,s3,s4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);

        TextView textView = (TextView)findViewById(R.id.textView1);
        s1="The app has been created for education purpose for submission in GDG Bhubaneswar by Mrinalini Pal, a student of KIIT University.";
        s2="For any queries contact:<br>";
        s3="Phone:\t7064622027<br>";
        s4="E-mail id:\tminupal95@gmail.com";
        textView.setText(Html.fromHtml(s1 + s2 + s3 + s4));
        Linkify.addLinks(textView, Linkify.ALL);
        textView.setLinkTextColor(Color.parseColor("#BB0038"));

    }
}
