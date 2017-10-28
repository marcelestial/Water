package com.spaceside.water;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view){
        //is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        String datetime = sdf.format(c.getTime());

        if(checked)
            ((CheckBox) view).setText(datetime);
        else
            ((CheckBox) view).setText("");
    }
}
