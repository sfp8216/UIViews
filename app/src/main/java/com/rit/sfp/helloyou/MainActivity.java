package com.rit.sfp.helloyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnWelcome = (Button) findViewById(R.id.btnWelcome);
        final EditText editName = (EditText) findViewById(R.id.editName);

        btnWelcome.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            editName.setText("Hello " + editName.getText());
        }
    });

        editName.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editName.setText("");
            }
        });
    }
}
