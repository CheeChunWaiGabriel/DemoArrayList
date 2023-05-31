package com.example.demoarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.demoarraylist.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;


    String txt="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.Textbox);
        fruits=new ArrayList<String>();
        fruits.add(0,"apple");
        fruits.add(1,"banana");
        fruits.add(2,"cherry");
        fruits.add(3,"durian");
        fruits.remove(0);
        fruits.set(2,"dragonfruit");
        txt+="Fruits"+"\n";
        txt+="====="+"\n";
        for (int i=0; i<fruits.size(); i++){
            txt+=fruits.get(i)+"\n";
        }
        tv.setText(txt);


    }
}
