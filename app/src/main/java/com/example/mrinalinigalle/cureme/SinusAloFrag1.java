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
public class SinusAloFrag1 extends Fragment {

    String s1,s2,s3,s4,s5,s6;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.sinus_alo_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="<b>Dr. R.V.S Kumar</b><br>";
        s3="<i><u>Address:</i></u>\tAMRI Hospital Bhuwaneswar, Plot No. 1, Beside Satyasai Enclave Khandagiri, Bhubaneswar-751030.<br>";
        s4="<i><u>Phone:</i></u>	";
        s5="<b>Dr. Sanjeev Gupta - MBBS, MS, DNB</b><br>";
        s6="<i><u>Address:</i></u>\tApollo Hospitals Bhubaneswar, Plot No: 251, Old Sainik School Road,Unit-15 Bhubaneswar-751005.<br>";
        textView.setText(Html.fromHtml(s1 + s2 + s3 + s4 + "\t6746666600<br><br>" + s1 + s5 + s6 + s4 + "\t6746661016\t/\t6746661066<br>"));
        Linkify.addLinks(textView, Linkify.PHONE_NUMBERS);
        textView.setLinkTextColor(Color.parseColor("#2f6699"));

        return view;
    }
}
