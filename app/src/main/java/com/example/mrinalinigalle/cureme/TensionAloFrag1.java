package com.example.mrinalinigalle.cureme;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mrinalini galle on 21-03-2016.
 */
public class TensionAloFrag1 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.tension_alo_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="<b>Dr Mohit Shidhore</b><br>";
        s3="<i><u>Address:</i></u>\tKar Clinic & Hospitals, A-32, Unit-4, Unit 4, Bhubaneshwar - 751001.<br>";
        s4="<i><u>Phone:</i></u>	";
        s5="<b>Dr Amiya Kumar Mohapatra</b><br>";
        s6="<i><u>Address:</i></u>\t179-B, HIG Duplex, BDA Colony, Baramunda Colony, Bhubaneshwar - 751003, Near Baramunda Main Bus Stand.<br>";
        s7="<b>Dr Pramod Kumar Upadhyaya</b><br>";
        s8="<i><u>Address:</i></u>\tN 4/254, Irc Village, Bhubaneshwar - 751015.<br>";
        s9="<b>Dr Amitav Rath</b><br>";
        s10="<i><u>Address:</i></u>\tC/ O Kalinga Hospital, Nandan Kanan Road, Maitri Vihar, Bhubaneshwar - 751023, Chandrasekharpur.<br>";
        textView.setText(Html.fromHtml(s1 + s2 + s3 + s4 + "\t8908938311<br><br>" + s1 + s5 + s6 + s4 + "\t9437044648<br><br>" + s1 + s7 + s8 + s4 + "\t6742552003<br><br>" + s1 + s9 + s10 + s4 + "\t6742300570\t/\t9178061805<br>"));
        Linkify.addLinks(textView, Linkify.PHONE_NUMBERS);
        textView.setLinkTextColor(Color.parseColor("#2f6699"));

        return view;
    }
}
