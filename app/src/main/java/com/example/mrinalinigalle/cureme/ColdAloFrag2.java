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
public class ColdAloFrag2 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.cold_alo_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s10="\u2022\t\t";
        s1="<b>Orissa Drug House</b><br>";
        s2="<i><u>\tAddress:</i></u>\tSurya Nagar, Bhubaneswar, Odisha 751003.<br>";
        s3="<i><u>\tPhone:</i></u>\t";
        s4="<b>Balajee Medical Store</b><br>";
        s5="<i><u>\tAddress:</i></u>\tRajmahal Building, Bapujinagar, Bapuji Nagar, Bapuji Nagar, Bhubaneswar, Odisha 751009.<br>";
        s6="<b>Rabindra Medical Hall</b><br>";
        s7="<i><u>\tAddress:</i></u>\tBpj Nagar, Bhubaneswar, Odisha 751001.<br>";
        s8="<b>Apollo Pharmacy</b><br>";
        s9="<i><u>\tAddress:</i></u>\tDamana Chhak, Near Bank Of India, Damana, C.S. Pur, Bhubaneswar, Odisha 751016.<br>";

        textView.setText(Html.fromHtml(s10+s1+s2+s3+"\t6746532804<br><br>"+s10+s4+s5+s3+"\t9437132001\t/\t9437132001<br><br>"+s10+s6+s7+s3+"\t6742531028<br><br>"+s10+s8+s9+s3+"\t7682816624<br>"));
        Linkify.addLinks(textView, Linkify.PHONE_NUMBERS);
        textView.setLinkTextColor(Color.parseColor("#2f6699"));

        return view;
    }
}
