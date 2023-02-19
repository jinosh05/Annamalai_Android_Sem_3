package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.SimplecalcBinding;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SimplecalcActivity extends AppCompatActivity {
    Button add,sub,mul,div;
    TextView txt;
    EditText t1,t2;
    float d;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplecalc);
        add=(Button)findViewById(R.id.bAdd);
        sub=(Button)findViewById(R.id.bSub);
        mul=(Button)findViewById(R.id.bMul);
        div=(Button)findViewById(R.id.bDiv);
        t1=(EditText)findViewById(R.id.text1);
        t2=(EditText)findViewById(R.id.text2);
        txt=(TextView)findViewById(R.id.tAns);
        add.setOnClickListener(new showmsg());
        sub.setOnClickListener(new showmsg());
        mul.setOnClickListener(new showmsg());
        div.setOnClickListener(new showmsg());
    }
    private class showmsg implements OnClickListener
    {
        public void onClick(View vw)
        {
            if (vw.getId()== R.id.bAdd)
                d= Integer.parseInt(t1.getText().toString())+
                        Integer.parseInt(t2.getText().toString());
            else if (vw.getId()== R.id.bSub)
            d= Integer.parseInt(t1.getText().toString()) -
                    Integer.parseInt(t2.getText().toString());
            else if (vw.getId()== R.id.bMul)
            d= Integer.parseInt(t1.getText().toString()) *
                    Integer.parseInt(t2.getText().toString());
else
            d= Float.parseFloat(t1.getText().toString()) /
                    Float.parseFloat(t2.getText().toString());
            txt.setText("Your Answer is " + d);
        }
    }
}