package com.example.a2marchexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    int count=0;
    private ImageButton img;
    private Switch swt;
    private ImageView iv;
    private ImageView imgone;
    private ImageView imgtwo;
    private RadioButton rb_en;
    private RadioButton rb_ds;
    private CheckBox img_cb;
    public int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img_btn);
        swt = findViewById(R.id.img_switch);
        imgone=findViewById(R.id.imgone);
        imgtwo=findViewById(R.id.imgtwo);
        rb_en=findViewById(R.id.en_rb);
        rb_ds=findViewById(R.id.ds_rb);
        img_cb=findViewById(R.id.imageshowcheck);
        img_cb.setChecked(true);
        rb_en.setChecked(true);
        flag=0;
    }
        public void onReplace (View view){

               count++;
               if (count % 2 == 1)
                   img.setImageResource(R.drawable.download);
                   else
                   img.setImageResource(R.drawable.images);


        }
        public void onRefresh (View view) {
            flag = 0;
            boolean state = swt.isChecked();
            if (state) {
                imgone.setVisibility(View.INVISIBLE);
                imgtwo.setVisibility(View.INVISIBLE);
            } else {
                imgone.setVisibility(View.VISIBLE);
                imgtwo.setVisibility(View.VISIBLE);
            }

            boolean state_ds = rb_ds.isChecked();
            if (state_ds) img.setClickable(false);
            else   img.setClickable(true);

             state_ds = rb_ds.isChecked();
            if (state_ds) img.setClickable(false);
            else   img.setClickable(true);

            state = img_cb.isChecked();
                if (!state) img.setVisibility(View.INVISIBLE);
                else img.setVisibility(View.VISIBLE);

        }

    }

