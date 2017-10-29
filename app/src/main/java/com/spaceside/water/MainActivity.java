package com.spaceside.water;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    CheckBox check1, check2, check3, check4, check5, check6, check7, check8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check1 = (CheckBox) findViewById(R.id.check_1);
        check2 = (CheckBox) findViewById(R.id.check_2);
        check3 = (CheckBox) findViewById(R.id.check_3);
        check4 = (CheckBox) findViewById(R.id.check_4);
        check5 = (CheckBox) findViewById(R.id.check_5);
        check6 = (CheckBox) findViewById(R.id.check_6);
        check7 = (CheckBox) findViewById(R.id.check_7);
        check8 = (CheckBox) findViewById(R.id.check_8);
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

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString("Time1", "" + check1.getText());
        savedInstanceState.putString("Time2", "" + check2.getText());
        savedInstanceState.putString("Time3", "" + check3.getText());
        savedInstanceState.putString("Time4", "" + check4.getText());
        savedInstanceState.putString("Time5", "" + check5.getText());
        savedInstanceState.putString("Time6", "" + check6.getText());
        savedInstanceState.putString("Time7", "" + check7.getText());
        savedInstanceState.putString("Time8", "" + check8.getText());
    }

    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        if(savedInstanceState != null){
            check1.setText(savedInstanceState.getString("Time1"));
            check2.setText(savedInstanceState.getString("Time2"));
            check3.setText(savedInstanceState.getString("Time3"));
            check4.setText(savedInstanceState.getString("Time4"));
            check5.setText(savedInstanceState.getString("Time5"));
            check6.setText(savedInstanceState.getString("Time6"));
            check7.setText(savedInstanceState.getString("Time7"));
            check8.setText(savedInstanceState.getString("Time8"));
        }
    }


}
