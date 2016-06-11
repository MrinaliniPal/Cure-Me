package com.example.mrinalinigalle.cureme;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] names;


    public CustomList(Activity context, String[] name) {
        super(context, R.layout.listview, name);
        this.context = context;
        this.names = name;

        //firebase.setAndroidContext(context);
        //firebase = new Firebase("https://relationalmanac1.firebaseio.com/");
    }
    @Override
    public View getView(final int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.listview, null, true);

        final TextView txtTitle1 = (TextView) rowView.findViewById(R.id.txt);
        //final ImageView imageView = (ImageView) rowView.findViewById(R.id.img);


        txtTitle1.setText(names[position]);

        /*firebase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                txtTitle1.setText(String.valueOf(dataSnapshot.child(String.valueOf(position)).child("Name").getValue()));
                txtTitle2.setText(String.valueOf(dataSnapshot.child(String.valueOf(position)).child("Relation").getValue()));
                Picasso.with(getContext()).load(String.valueOf(dataSnapshot.child(String.valueOf(position)).child("ImageUrl").getValue())).into(imageView);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });*/

        return rowView;
    }
}
