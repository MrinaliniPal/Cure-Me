package com.example.mrinalinigalle.cureme;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.io.File;
import java.util.ArrayList;

public class PossibleDisease extends AppCompatActivity {

    ListView listView;
    EditText editText;
    String symptom;
    int number,numb;
    ArrayList<String> name = new ArrayList<>();
    Intent active;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_possible_disease);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editText=(EditText)findViewById(R.id.editText12);
        listView=(ListView)findViewById(R.id.listView12);

        Firebase.setAndroidContext(getApplicationContext());

    }

    public void search(View view)
    {
        if (isNetworkAvailable()) {
            trimCache(PossibleDisease.this);
            run1();
        } else {
            Toast.makeText(PossibleDisease.this, "Internet not connected", Toast.LENGTH_SHORT).show();
            Toast.makeText(PossibleDisease.this, "Plz Connect And Try Again", Toast.LENGTH_SHORT).show();
        }
    }

    public void run1()
    {

        Toast.makeText(PossibleDisease.this,"Please wait Loading.",Toast.LENGTH_SHORT).show();
        Toast.makeText(PossibleDisease.this,"Please wait Loading..",Toast.LENGTH_SHORT).show();
        Toast.makeText(PossibleDisease.this,"Please wait Loading...",Toast.LENGTH_SHORT).show();
        symptom=editText.getText().toString();
        Firebase firebase = new Firebase("https://cureme.firebaseio.com/");
        firebase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                name.clear();
                number = Integer.parseInt(dataSnapshot.child("Number").getValue().toString());
                for (int i = 0; i < number; i++) {
                    numb = Integer.parseInt(dataSnapshot.child(String.valueOf(i)).child("Symptom").child("Number").getValue().toString());
                    for (int j = 0; j < numb; j++) {
                        if (dataSnapshot.child(String.valueOf(i)).child("Symptom").child(String.valueOf(j)).getValue().toString().equalsIgnoreCase(symptom)) {
                            name.add(dataSnapshot.child(String.valueOf(i)).child("Name").getValue().toString());
                            break;
                        }
                    }
                }
                ArrayAdapter<String> namelist=new ArrayAdapter<String>(PossibleDisease.this,android.R.layout.simple_list_item_1,name);
                listView.setAdapter(namelist);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String a = listView.getItemAtPosition(position).toString();
                        if(a.equalsIgnoreCase("Tension Headache"))
                        {
                            active=new Intent(PossibleDisease.this,Tension.class);
                            startActivity(active);
                        }
                        else if(a.equalsIgnoreCase("Sinus Headache"))
                        {
                            active=new Intent(PossibleDisease.this,Sinus.class);
                            startActivity(active);
                        }
                        else if(a.equalsIgnoreCase("Cold"))
                        {
                            active=new Intent(PossibleDisease.this,Cold.class);
                            startActivity(active);
                        }
                        else if(a.equalsIgnoreCase("Ear Infections"))
                        {
                            active=new Intent(PossibleDisease.this,EarInfect.class);
                            startActivity(active);
                        }
                        else if(a.equalsIgnoreCase("Peptic Ulcer"))
                        {
                            active=new Intent(PossibleDisease.this,PepUlcer.class);
                            startActivity(active);
                        }
                        else if(a.equalsIgnoreCase("Stomach Cramp"))
                        {
                            active=new Intent(PossibleDisease.this,StomCramp.class);
                            startActivity(active);
                        }
                    }
                });

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }


    public boolean isNetworkAvailable() {
        ConnectivityManager cm = (ConnectivityManager)PossibleDisease.this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        // if no network is available networkInfo will be null
        // otherwise check if we are connected
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    public static void trimCache(Context context) {
        try {
            File dir = context.getCacheDir();
            if (dir != null && dir.isDirectory()) {
                deleteDir(dir);
            }
        } catch (Exception e) {
        }
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        // The directory is now empty so delete it
        return dir.delete();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_possible_disease, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent activity;

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_privacy) {
            activity = new Intent(this,Privacy.class);
            startActivity(activity);
            return true;
        } else if(id == R.id.action_terms_cond){
            activity = new Intent(this,TermsCond.class);
            startActivity(activity);
            return true;
        } else if(id == R.id.action_about){
            activity = new Intent(this,About.class);
            startActivity(activity);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
