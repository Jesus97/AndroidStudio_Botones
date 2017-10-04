package com.iesvirgendelcarmen.dam.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    private int numero = 0;
    private TextView tn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tn = (TextView) findViewById(R.id.numero);
        tn.setText(numero+"");

        Button btnIcn = (Button) findViewById(R.id.inc);
        Button btnDec = (Button) findViewById(R.id.dec);
        ToggleButton tBtn = (ToggleButton) findViewById(R.id.tBtn);
        Switch tSwitch = (Switch) findViewById(R.id.tSwitch);






        btnIcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero++;
                tn.setText(numero+"");
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numero > 0)
                numero--;
                tn.setText(numero+"");
            }
        });

        btnIcn.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                numero = numero + 10;
                tn.setText(numero+"");
                return true;
            }
        });

        btnDec.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                numero = numero - 10;
                tn.setText(numero+"");
                return true;
            }
        });
        tBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
                if (isChecked){
                    mainLayout.setBackgroundColor(getResources().getColor(R.color.colorOn));
                }else{
                    mainLayout.setBackgroundColor(getResources().getColor(R.color.colorOff));
                }

            }
        });

        tSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
                if (isChecked){
                    mainLayout.setBackgroundColor(getResources().getColor(R.color.colorOn));
                }else{
                    mainLayout.setBackgroundColor(getResources().getColor(R.color.colorOff));
                }

            }
        });

    }
}
