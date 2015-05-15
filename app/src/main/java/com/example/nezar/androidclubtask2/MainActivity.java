package com.example.nezar.androidclubtask2;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {

    int i =0;

    String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
            "Linux", "OS/2" };
    int [] images =  new int [] {R.drawable.ic_launcher,R.drawable.ic_launcher,
            R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,
            R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,
            R.drawable.ic_launcher,R.drawable.ic_launcher
    };



    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        MyArrayAdapter1 adapter = new MyArrayAdapter1(this, values,images);
        setListAdapter(adapter);





    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);


        TextView textView = (TextView) findViewById(R.id.label);
        ImageView imageView = (ImageView) findViewById(R.id.icon);



        //Toast.makeText(this,values[position],Toast.LENGTH_SHORT).show()
        String s = values[position];

        if (s.startsWith("Android")) {
                    if (i==0) {
                        images[0]=R.drawable.right;
                        i=1;
                        v.refreshDrawableState();
                    }else if (i==1){
                        images[0]=R.drawable.wrong;
                        i=0;
                        v.refreshDrawableState();

         }
                                        }
        v.refreshDrawableState();

        if (s.startsWith("iPhone")) {
            if (i==0) {
                images[position]=R.drawable.right;
                i=1;
            }else if (i==1){
                images[position]=R.drawable.wrong;
                i=0;

            }
        }





            }

    }
