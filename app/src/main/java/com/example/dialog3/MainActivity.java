package com.example.dialog3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button bgButton;
public ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

constraintLayout = findViewById(R.id.ConstraintLayout);
bgButton = findViewById(R.id.button_fon);

bgButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        final CharSequence[] items = {getText(R.string.red),
                getText(R.string.green), getText(R.string.yellow)};

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int color) {
                if (color == 0) {
                    constraintLayout.setBackgroundResource(R.color.redColor);
                    Toast.makeText(MainActivity.this, R.string.red, Toast.LENGTH_SHORT).show();
                }
                else if (color == 1) {
                    constraintLayout.setBackgroundResource(R.color.greenColor);
                    Toast.makeText(MainActivity.this, R.string.green, Toast.LENGTH_SHORT).show();
                }
                else if (color == 2) {
                    constraintLayout.setBackgroundResource(R.color.yellowColor);
                    Toast.makeText(MainActivity.this, R.string.yellow, Toast.LENGTH_SHORT).show();
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
});
    }
}