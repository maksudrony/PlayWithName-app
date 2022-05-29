package com.example.playwithname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        textView= findViewById(R.id.textView);
        editText= findViewById(R.id.editText);
    }
    public void calculate(View view) {
        String s= editText.getText().toString();

        textView.setText("Fuck you " + s);
        Toast.makeText(this, "Thanks for using this app! "+ s, Toast.LENGTH_SHORT).show();
    }
}