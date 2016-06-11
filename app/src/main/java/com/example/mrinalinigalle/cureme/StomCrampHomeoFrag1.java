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
public class StomCrampHomeoFrag1 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.stom_cramp_homeo_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="<b>Dr A. C. Pattanaik</b><br>";
        s3="Phone:\t";
        s4="<i><u>Address:</i></u>	18, Bhubaneshwar Gpo, Bhubaneshwar - 751001, Bhouma Nagar.<br>";
        s5="<b>Dr Kamalakanta Kar (MD)</b><br>";
        s6="<i><u>Address:</i></u>	Irc Village, Bhubaneshwar - 751015.<br>";
        s7="<b>Dr.Ashok Kr.Misra</b><br>";
        s8="<i><u>Address:</i></u>	Satya Nagar, Bhubaneshwar - 751003.<br>";
        s9="<b>Dr Narayan Rao</b><br>";
        s10="<i><u>Address:</i></u>	97, Sahid Nagar, Sahid Nagar, Bhubaneshwar - 751000.<br>";
        s11="<b>Dr MRS Sangeeta Dhal</b><br>";
        s12="<i><u>Address:</i></u>	Plot Number 28, Sai Krupa, Ekamra Villa, Jaydev Vihar, Irc Village, Bhubaneshwar - 751015, Near Sai Temple.<br>";
        s13="<b>Dr.Arun Ch.Sethy</b><br>";
        s14="<i><u>Address:</i></u>	Jaydev Vihar, Bhubaneshwar - 751013.<br>";
        textView.setText(Html.fromHtml(s1+s2+s4+s3+"\t6742402291<br><br>"+s1+s5+s6+s3+"\t6742554523\t/\t7742554523<br><br>"+s1+s7+s8+s3+"\t6742514789<br><br>"+s1+s9+s10+s3+"\t6742514449<br><br>"+s1+s11+s12+s3+"\t9861077789\t/\t9861036698<br><br>"+s1+s13+s14+s3+"\t6742361368<br>"));
        Linkify.addLinks(textView, Linkify.PHONE_NUMBERS);
        textView.setLinkTextColor(Color.parseColor("#2f6699"));

        return view;
    }
}