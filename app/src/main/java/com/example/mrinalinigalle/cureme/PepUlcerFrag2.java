package com.example.mrinalinigalle.cureme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mrinalini galle on 21-03-2016.
 */
public class PepUlcerFrag2 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.pep_ulcer_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s11="\u2022\t\t";
        s1="<b>"+"Banana:"+"</b>"+"\tBanana is the most effective natural home cure for peptic ulcer. Banana fruit neutralizes the excess acidity in the gastric juices and reduces the irritation by coating or forming a layer over the inner walls of the stomach. The diet of a chronic patient of peptic ulcer should consist of only two bananas with a glass of milk two or three times a day.<br><br>";
        s2="<b>"+"Castor Oil:"+"</b>"+"\tCastor Oil is also a very good medicine for peptic ulcer. 2-3 drops of castor oil should be mixed in one glass of warm milk.<br><br>";
        s3="<b>"+"Wood Apple:"+"</b>"+"\tThe leaves of wood apple are an excellent home cure for peptic ulcer. Fifteen grams of leaves of wood apple soaked overnight in 250ml of water strained and should be taken as a drink in the morning. When taken for a few weeks the pain and discomfort due to the ulcer is relieved.<br><br>";
        s4="<b>"+"Indian Gooseberry or Amla:"+"</b>"+"\t25ml of Indian gooseberry juice taken early in the morning is a very good peptic ulcer.<br><br>";
        s5="<b>"+"Aloe Vera:"+"</b>"+"\tAloe Vera juice helps in relieving the pain and also helps in speedy recovery making it an excellent natural cure for peptic ulcer.<br><br>";
        s6="<b>"+"Lime:"+"</b>"+"\tLime is a very effective natural cure for peptic ulcer. The juice of lime has citric acid and mineral salts which helps in better digestion.<br><br>";
        s7="<b>"+"Cabbage:"+"</b>"+"\tCabbage is the most useful natural cure for peptic ulcer. 250ml of cabbage boiled in 500ml of water till it reduces to half .This decoction should be taken twice daily. Juice of raw cabbage is very effective medicine for peptic ulcer. This juice can also be consumed along with carrot juice.<br><br>";
        s8="<b>"+"Fenugreek Seeds:"+"</b>"+"\tA tea made of fenugreek seeds is also very useful natural cure for peptic ulcer. It helps in healing the ulcers by forming a protective shell in stomach and intestine to prevent ulcers.<br><br>";
        s9="<b>"+"Drumstick:"+"</b>"+"\tThe leaves of drumstick have also found to be an effective natural remedy for peptic ulcers. Ten grams of leaves must be ground to a paste and mixed with half a cup of yoghurt, this should be taken daily.<br><br>";
        s10="<b>"+"Almond milk:"+"</b>"+"\tBlanched almonds blended with a glass of milk is an excellent natural cure for peptic ulcer, as it binds excess acid in the stomach and provides high protein content.<br><br>";
        textView.setText(Html.fromHtml(s11+s1+s11+s2+s11+s3+s11+s4+s11+s5+s11+s6+s11+s7+s11+s8+s11+s9+s11+s10));

        return view;
    }
}