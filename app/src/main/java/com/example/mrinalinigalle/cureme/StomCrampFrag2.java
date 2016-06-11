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
public class StomCrampFrag2 extends Fragment {

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.stom_cramp_tab, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        s1="\u2022\t\t";
        s2="<b>"+"Garlic:"+"</b>"+"\tTo get relieve from gas, garlic is the best option. It is known for its pungent and heating qualities, which will help in reducing the gastric fire. For proper digestion, one should have fresh garlic soup. Boil some grinded garlic cloves in water. Add cumin seeds and black pepper in it. After boiling, strain it and let it cool down on room temperature. Drink the solution thrice a day for effective results.<br><br>";
        s3="<b>"+"Ginger:"+"</b>"+"\tGinger is the best medicine used for treatment of indigestion. It is considered to be a traditional cure for gastric trouble. To prevent gas and indigestion, one should regularly chew fresh garlic piece after having a meal.<br>If you do not want to chew it raw, add some dry pieces of garlic during the preparation of food. Drinking ginger tea is also effective in curing gas. Boil some ginger in hot water and strain it. Drink the tea twice or thrice a day.<br>Ginger oil is also used for getting relief from gas. Put 2-3 drops of ginger oil on the stomach and rub it thoroughly.<br><br>";
        s4="<b>"+"Black Pepper:"+"</b>"+"\tBlack pepper is considered to be best ayurvedic medicine for healing acidity and indigestion. Its properties help in increasing the hydrochloric acid release in the stomach. Take powdered pepper with jaggery to cure gastric irritation. Take black pepper, ginger powder, coriander seeds, and dried mint leaves in equal quantity. Prepare a mixture after grinding them. Have a teaspoon of the mixture two times in a day.<br>Pepper can also be used with buttermilk.<br><br>";
        s5="<b>"+"Caraway Seeds (Kala Jeera):"+"</b>"+"\tCaraway seeds tea is used for healing gastric disorder. To prepare tea, add one teaspoon of caraway seeds in one cup of boiling water. Steep it for a few minutes. After steeping, strain the tea and drink it before having lunch or dinner.<br>Else, chew roasted caraway seeds mixed with rock salt.<br><br>";
        s6="<b>"+"Buttermilk:"+"</b>"+"\tFreshly churned buttermilk is considered to best remedy for curing indigestion. It not only helps in healing gastric problem, but also keeps you fit and healthy. Add roasted powdered cumin seeds and a pinch of salt in buttermilk.<br><br>";
        s7="<b>"+"Cloves:"+"</b>"+"\tEat few pieces of cloves directly to get relief from gas pain. If chewing cloves tastes too pungent, use clove oil. It is one of the useful home remedy for bloating. It easily reduces gas pain in the stomach.<br><br>";
        s8="<b>"+"Fennel (Saunf):"+"</b>"+"\tFennel is one of the common ingredients available in the kitchen. Chew fennel seeds to get instant relief in gas pain. Alternatively, fennel tea can also be used. Boil some water. Add tea leaves and crushed fennel seeds in it. Let it steep for a few minutes. Add jaggery syrup and a quarter cup of milk in it. Drink after straining the tea.<br><br>";
        s9="<b>"+"Warm Water:"+"</b>"+"\tSometimes, due to gas, we feel severe stomach ache and are unable to eat anything. We should drink warm water at regular intervals. This helps in maintaining water levels in the body and getting rid of the gas.<br><br>";
        s10="<b>"+"Asafoetida (Hing):"+"</b>"+"\tAdd a pinch of asafoetida in a glass of warm water. Stir it well and drink the solution, three times in a day. Else, make a paste of asafoetida adding little water. Apply it directly on the stomach.<br>Take a wholly ripe banana, add a little quantity of asafoetida and eat it two times a day.<br><br>";
        s11="<b>"+"Apple Cider Vinegar:"+"</b>"+"\tAdd 2-3 tablespoon of apple cider vinegar in warm water. Allow it to cool down at room temperature. Drink the solution to soothe the stomach-ache, caused due to gas.<br><u><i>Note:</u></i> Normal vinegar can be used if the apple cider vinegar is not available.<br><br>";
        s12="<b>"+"Cardamom:"+"</b>"+"\tCardamom is a spice used to speed up the digestion process. While cooking vegetable or rice, add cardamom powder.<br>Chew pods of cardamom 2-3 times a day for removing gas trouble.<br>Prepare tea of fresh ginger, few pods of cardamom seeds, and a teaspoon of fennel seeds. Drink the warm tea, many times in a day.<br><br>";
        s13="<b>"+"Lemon And Baking Soda:"+"</b>"+"\tTake a glass and squeeze juice of one fresh lemon in it. Put some baking soda in it. After adding baking soda to lemon juice, bubbles will start formulating. Add one cup of water with some more baking soda. Stir the solution, until, the baking soda gets dissolved. Drink the solution to get relief.<br><br>";
        s14="<b>"+"Cinnamon:"+"</b>"+"\tCinnamon is one of the essential ingredients to make the food tasty and also useful for medicinal purpose. Add a teaspoon of cinnamon powder in a cup of warm milk. Add some honey and drink it after stirring well.<br>It can also be used in tea. Add cinnamon powder in boiling water. After steeping for some time, strain the tea. Drink it for healing gastric trouble.<br><br>";
        s15="<b>"+"Gooseberry (Amla):"+"</b>"+"\tGooseberry is one of the best treatments used for curing several problems related to hair, stomach, heart, skin, etc. Every morning, amla juice should be taken on an empty stomach. It is rich in fibres and Vitamin C, which help in curing the problem of acidity and constipation.<br><br>";
        s16="<b>"+"Carom Seeds (Ajwain):"+"</b>"+"\tCarom seeds are very helpful in curing indigestion, nausea, and gastric trouble. Take a half teaspoon of carom seeds. Crush it in your hand to remove the strong smell. Mix asafoetida and salt. Chew it or swallow it with water.<br><br>";
        s17="<b>"+"Turmeric Leaves:"+"</b>"+"\tTurmeric is known for its medicinal properties. Take some turmeric leaves and grind them. Mix them in a glass of milk. Then, drink it. It will alleviate the gastric trouble.<br><br>";
        s18="<b>"+"Potato Juice:"+"</b>"+"\tTake some potatoes and grind them. Take out the juice by squeezing the grinded potatoes. Drink the juice before having meals. For better results, drink the juice three times a day.<br><br>";
        s19="<b>"+"Onion:"+"</b>"+"\tExtract juice of some onions. Drink the extracted juice to get relief in gastric problems.<br><br>";
        s20="<b>"+"Herbal Tea:"+"</b>"+"\tPrepare tea of raspberry, mint, blackberry, and chamomile. Drink this herbal tea to improve the digestion process.<br><br>";
        s21="<b>"+"Coconut Water:"+"</b>"+"\tCoconut water possesses a lot of proteins. You should drink coconut water to get relief in gastric troubles. If coconut water is regularly consumed, body becomes rich in proteins.<br>";

        textView.setText(Html.fromHtml(s1+s2+s1+s3+s1+s4+s1+s5+s1+s6+s1+s7+s1+s8+s1+s9+s1+s10+s1+s11+s1+s12+s1+s13+s1+s14+s1+s15+s1+s16+s1+s17+s1+s18+s1+s19+s1+s20+s1+s21));

        return view;
    }
}