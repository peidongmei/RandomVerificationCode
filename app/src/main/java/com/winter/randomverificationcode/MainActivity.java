package com.winter.randomverificationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.winter.randomverificationcode.view.VerificationView;

public class MainActivity extends AppCompatActivity
{
    private VerificationView vvMain;
    private Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnReset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                vvMain.reset();
            }
        });
    }

    private void initViews() {
        vvMain = (VerificationView) findViewById(R.id.vv_main);
        btnReset = (Button) findViewById(R.id.btn_reset);
    }

}
