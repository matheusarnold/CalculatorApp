package com.example.calculatorku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button but0, but1, but2, but3, but4, but5, but6, but7, but8, but9;
    Button buteq, butpt, butadd, butsub, butmul, butdiv;
    Button butac;
    TextView viewCal;

    public static double valueNow = 0;
    public static String opNow = "";
    public static double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init(){
        viewCal = (TextView) findViewById(R.id.viewCal);
        but0 = (Button) findViewById(R.id.but0);
        but0.setOnClickListener(this);
        but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(this);
        but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(this);
        but3 = (Button) findViewById(R.id.but3);
        but3.setOnClickListener(this);
        but4 = (Button) findViewById(R.id.but4);
        but4.setOnClickListener(this);
        but5 = (Button) findViewById(R.id.but5);
        but5.setOnClickListener(this);
        but6 = (Button) findViewById(R.id.but6);
        but6.setOnClickListener(this);
        but7 = (Button) findViewById(R.id.but7);
        but7.setOnClickListener(this);
        but8 = (Button) findViewById(R.id.but8);
        but8.setOnClickListener(this);
        but9 = (Button) findViewById(R.id.but9);
        but9.setOnClickListener(this);

        butac = (Button) findViewById(R.id.butac);
        butac.setOnClickListener(this);

        buteq = (Button) findViewById(R.id.buteq);
        buteq.setOnClickListener(this);

        butpt = (Button) findViewById(R.id.butpt);
        butpt.setOnClickListener(this);

        butadd = (Button) findViewById(R.id.butadd);
        butadd.setOnClickListener(this);
        butsub = (Button) findViewById(R.id.butsub);
        butsub.setOnClickListener(this);
        butmul = (Button) findViewById(R.id.butmul);
        butmul.setOnClickListener(this);
        butdiv = (Button) findViewById(R.id.butdiv);
        butdiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but0:
                viewCal.setText(viewCal.getText().toString() + "0");
                break;
            case R.id.but1:
                viewCal.setText(viewCal.getText().toString() + "1");
                break;
            case R.id.but2:
                viewCal.setText(viewCal.getText().toString() + "2");
                break;
            case R.id.but3:
                viewCal.setText(viewCal.getText().toString() + "3");
                break;
            case R.id.but4:
                viewCal.setText(viewCal.getText().toString() + "4");
                break;
            case R.id.but5:
                viewCal.setText(viewCal.getText().toString() + "5");
                break;
            case R.id.but6:
                viewCal.setText(viewCal.getText().toString() + "6");
                break;
            case R.id.but7:
                viewCal.setText(viewCal.getText().toString() + "7");
                break;
            case R.id.but8:
                viewCal.setText(viewCal.getText().toString() + "8");
                break;
            case R.id.but9:
                viewCal.setText(viewCal.getText().toString() + "9");
                break;

            case R.id.butadd:
                if (viewCal.getText().toString().equals("")) {
                    return;
                }
                opNow = "add";
                valueNow = Double.parseDouble(viewCal.getText().toString());
                viewCal.setText("");
                break;
            case R.id.butsub:
                if (viewCal.getText().toString().equals("")) {
                    return;
                }
                opNow = "min";
                valueNow = Double.parseDouble(viewCal.getText().toString());
                viewCal.setText("");
                break;
            case R.id.butmul:
                if (viewCal.getText().toString().equals("")) {
                    return;
                }
                opNow = "mul";
                valueNow = Double.parseDouble(viewCal.getText().toString());
                viewCal.setText("");
                break;
            case R.id.butdiv:
                if (viewCal.getText().toString().equals("")) {
                    return;
                }
                opNow = "div";
                valueNow = Double.parseDouble(viewCal.getText().toString());
                viewCal.setText("");
                break;

            case R.id.buteq:

                if (opNow.equals("add")){
                    result = valueNow + Double.parseDouble(viewCal.getText().toString());
                }
                if (opNow.equals("min")){
                    result = valueNow - Double.parseDouble(viewCal.getText().toString());
                }
                if (opNow.equals("mul")){
                    result = valueNow * Double.parseDouble(viewCal.getText().toString());
                }
                if (opNow.equals("div")){
                    result = valueNow / Double.parseDouble(viewCal.getText().toString());
                }

                int tempVal = (int)result;

                if (tempVal == result) {
                    viewCal.setText(String.valueOf((int)result));
                }
                else {
                    viewCal.setText(String.valueOf(result));
                }

                break;

            case R.id.butpt:
                viewCal.setText(viewCal.getText().toString() + ".");
                break;

            case R.id.butac:
                valueNow = 0;
                viewCal.setText("");
                break;
        }
    }
}
