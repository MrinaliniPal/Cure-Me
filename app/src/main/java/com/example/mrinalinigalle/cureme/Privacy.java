package com.example.mrinalinigalle.cureme;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Privacy extends AppCompatActivity {

    String s1,s2,s3,s4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);

        TextView textView = (TextView) findViewById(R.id.textView1);
        s1 = "This app is created for submission is GDG Bhubaneswar as a project.<br><br>";
        s2="This app is aimed at people over 13 years of age. It collects contact number(s) and chamber/shop addresses of the doctors/pharmacies.<br><br>";
        s3="It is a medical app which collects information about your disease symptoms and aims to provide the corresponding disease name along with the relevant doctors and pharmacies providing homeopathy/allopathic treatment.<br><br>";
        s4="The information of the doctors and medical stores have been taken from www.justdial.com.<br>";
        textView.setText(Html.fromHtml(s1+s2+s3+s4));
        Linkify.addLinks(textView, Linkify.WEB_URLS);
        textView.setLinkTextColor(Color.parseColor("#BB0038"));

    }

}