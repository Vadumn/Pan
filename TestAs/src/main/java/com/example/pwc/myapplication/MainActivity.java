package com.example.pwc.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_show);
        TextView text = (TextView) findViewById(R.id.tv_as);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_show:

                Toast.makeText(MainActivity.this,"haha",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"lala",Toast.LENGTH_LONG).show();
                Log.i("lala", "log日志");
                Log.d("dddd","d..log日志");
                break;

        }
    }
}
