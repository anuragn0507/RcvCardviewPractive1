package com.example.rcvcardviewpractive1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv1;
    NewsRVadapter newsRVadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv1 = (RecyclerView) findViewById(R.id.RelMain);
        rcv1.setLayoutManager(new LinearLayoutManager(this));

        NewsRVadapter newsRVadapter = new NewsRVadapter(dataqueue());
        rcv1.setAdapter(newsRVadapter);
    }

    public ArrayList<Model> dataqueue(){
        ArrayList<Model> holder = new ArrayList<>();

        Model ob1= new Model();
        ob1.setVheading("C Programming");
        ob1.setVdescription("This desktop programming language");
        ob1.setVimgname(R.drawable.c);
        holder.add(ob1);

        Model ob2= new Model();
        ob2.setVheading("C++ Programming");
        ob2.setVdescription("This desktop programming language");
        ob2.setVimgname(R.drawable.cplus);
        holder.add(ob2);

        Model ob3= new Model();
        ob3.setVheading("Java Programming");
        ob3.setVdescription("This desktop programming language");
        ob3.setVimgname(R.drawable.java);
        holder.add(ob3);

        Model ob4= new Model();
        ob4.setVheading(".Net Programming");
        ob4.setVdescription("This desktop programming language");
        ob4.setVimgname(R.drawable.net);
        holder.add(ob4);

        Model ob5= new Model();
        ob5.setVheading("Node.js Programming");
        ob5.setVdescription("This desktop programming language");
        ob5.setVimgname(R.drawable.node);
        holder.add(ob5);

        Model ob6= new Model();
        ob6.setVheading("Php  Programming");
        ob6.setVdescription("This desktop programming language");
        ob6.setVimgname(R.drawable.php);
        holder.add(ob6);

        Model ob7= new Model();
        ob7.setVheading("Python Programming");
        ob7.setVdescription("This desktop programming language");
        ob7.setVimgname(R.drawable.python);
        holder.add(ob1);

        Model ob8= new Model();
        ob8.setVheading("Shopify Programming");
        ob8.setVdescription("This is E-com Webiste making Framework");
        ob8.setVimgname(R.drawable.shopify);
        holder.add(ob8);

        Model ob9= new Model();
        ob9.setVheading("Wordpress Programming");
        ob9.setVdescription("This is Web/Blog Devlopment framework");
        ob9.setVimgname(R.drawable.wordpress);
        holder.add(ob9);

        Model ob10= new Model();
        ob10.setVheading("C Programming");
        ob10.setVdescription("This desktop programming language");
        ob10.setVimgname(R.drawable.c);
        holder.add(ob10);


        return holder;


    }
}