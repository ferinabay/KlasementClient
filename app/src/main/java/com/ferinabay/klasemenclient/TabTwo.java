package com.ferinabay.klasemenclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class TabTwo extends Fragment {

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_sample, menu);
        super.onCreateOptionsMenu(menu,inflater);
        TableLayout tablelayoutid = (TableLayout)getActivity().findViewById(R.id.tablelayoutid);
        // Inflate your row "template" and fill out the fields.



        for(int i=0;i<3;i++){
            TableRow row = (TableRow)getLayoutInflater().inflate(R.layout.layout_row, null);

            TextView TextView   =(TextView)row.findViewById(R.id.idnotabel);
            TextView clubname   =(TextView)row.findViewById(R.id.clubname);
            TextView p   =(TextView)row.findViewById(R.id.p);
            TextView w   =(TextView)row.findViewById(R.id.w);
            TextView d   =(TextView)row.findViewById(R.id.d);
            TextView l   =(TextView)row.findViewById(R.id.l);
            TextView f   =(TextView)row.findViewById(R.id.f);
            TextView a   =(TextView)row.findViewById(R.id.a);
            TextView gd   =(TextView)row.findViewById(R.id.gd);
            TextView pts   =(TextView)row.findViewById(R.id.pts);
            TextView.setText("1");
            clubname.setText("Chealsea");
            p.setText("8");
            w.setText("8");
            d.setText("0");
            l.setText("0");
            f.setText("20");
            a.setText("6");
            gd.setText("14");
            pts.setText("24");
            tablelayoutid.addView(row);

            row.setClickable(true);
            row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    view.setBackgroundColor(Color.GRAY);
                    System.out.println("Row clicked: " + view.getId());
                }
            });
        }

    }

}
