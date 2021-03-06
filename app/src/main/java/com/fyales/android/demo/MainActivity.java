package com.fyales.android.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fyales.android.demo.rx.RxMainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_lv)
    ListView mainLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        String[] functions = new String[]{
                "RxJava"
        };

        mainLv.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                functions));

        mainLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, RxMainActivity.class));
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                }
            }
        });


    }
}
