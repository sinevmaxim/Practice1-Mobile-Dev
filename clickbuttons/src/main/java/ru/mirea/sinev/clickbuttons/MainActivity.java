package ru.mirea.sinev.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button btnOk;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = v -> tvOut.setText("OK is pressed");
        btnOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = v -> tvOut.setText("Cancel is pressed");
        btnCancel.setOnClickListener(oclBtnCancel);


    }
}