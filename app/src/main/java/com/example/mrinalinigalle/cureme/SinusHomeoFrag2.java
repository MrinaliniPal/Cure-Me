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
public class SinusHomeoFrag2 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.sinus_homeo_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s16="\u2022\t\t";
        s1="<b>Dynamic Homoeopathic Centre</b><br>";
        s2="<i><u>Address:</i></u>\tJanpath, Unit 3, Master Canteen, Bhubaneswar, Odisha 751001.<br>";
        s3="<i><u>Phone:</i></u>\t";
        s4="<b>Multicare Homeopathy Treatment Center</b><br>";
        s5="<i><u>Address:</i></u>\tHIG - 4/2, Housing Board Colony, Chandrasekharpur, Bhubaneswar, Odisha 751016.<br>";
        s6="<b>Lords Homeo Pharmacy</b><br>";
        s7="<i><u>Address:</i></u>\t25, 1st Road, Bapuji Nagar, Bhubaneswar, Odisha 751009.<br>";
        s8="<b>Pradhan Homeo Drugs</b><br>";
        s9="<i><u>Address:</i></u>\tPhase 2, Near Metro Gents Parlour, Sailashree Vihar Road, Chandrasekharpur, Bhubaneswar, Odisha 751016.<br>";
        s10="<b>Sebika Medicine Store</b><br>";
        s11="<i><u>Address:</i></u>\tNear Bridge, Acharya Vihar, Bhubaneswar, Odisha 751022.<br>";
        s12="<b>Rabindra Medical Hall</b><br>";
        s13="<i><u>Address:</i></u>\tBpj Nagar, Bhubaneswar, Odisha 751001.<br>";
        s14="<b>Balajee Medical Store</b><br>";
        s15="<i><u>Address:</i></u>\tRajmahal Building, Bapujinagar, Bapuji Nagar, Bapuji Nagar, Bhubaneswar, Odisha 751009.<br>";

        textView.setText(Html.fromHtml(s16 + s1 + s2 + s3 + "\t674 239 0631<br><br>" + s16 + s4 + s5 + s3 + "\t99374 12150<br><br>" + s16 + s6 + s7 + s3 + "\t97779 76740<br><br>" + s16 + s8 + s9 + s3 + "\t94371 71363<br><br>" + s16 + s10 + s11 + s3 + "\t94372 84801<br><br>" + s16 + s12 + s13 + s3 + "\t674 253 1028<br><br>" + s16 + s14 + s15 + s3 + "\t94371 32001<br>"));
        Linkify.addLinks(textView, Linkify.PHONE_NUMBERS);
        textView.setLinkTextColor(Color.parseColor("#2f6699"));

        return view;
    }
}