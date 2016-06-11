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
public class StomCrampAloFrag1 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.stom_cramp_alo_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="<b>Dr P. C. Dalai</b><br>";
        s3="<i><u>Address:</i></u>\tC/O Kalinga Hospital, Bhubaneswar, Bhubaneshwar - 751023.<br>";
        s4="<i><u>Phone:</i></u>	";
        s5="<b>DR. B.C. Panda</b><br>";
        s6="<i><u>Address:</i></u>\tHig 19/1, Housing Board Clny,Chandrasekharpur, Chandrashekharpur, Bhubaneshwar - 751016.<br>";
        s7="<b>Dr K. N. Panda</b><br>";
        s8="<i><u>Address:</i></u>\tKalinga Hospital, Chandrasekharpur, Chandrasekharpur, Bhubaneshwar - 751016.<br>";
        s9="<b>Dr Brundaban Nahak</b><br>";
        s10="<i><u>Address:</i></u>\tC/O Kalinga Hospital Ltd, Chandrasekharpur, Bhubaneshwar - 751016, Nalco Nagar.<br>";
        textView.setText(Html.fromHtml(s1 + s2 + s3 + s4 + "\t6742301724<br><br>" + s1 + s5 + s6 + s4 + "\t6742440702<br><br>" + s1 + s7 + s8 + s4 + "\t9861035744<br><br>" + s1 + s9 + s10 + s4 + "\t6742300997\t/\t6742300570<br>"));
        Linkify.addLinks(textView, Linkify.PHONE_NUMBERS);
        textView.setLinkTextColor(Color.parseColor("#2f6699"));

        return view;
    }
}