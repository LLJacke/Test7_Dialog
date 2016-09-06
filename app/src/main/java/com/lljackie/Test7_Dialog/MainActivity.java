package com.lljackie.Test7_Dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bt_1;
    private Button bt_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_1 = (Button) findViewById(R.id.bt_1);
        bt_2 = (Button) findViewById(R.id.bt_2);

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("在这停顿！！").setTitle("!?");
                builder.show();
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                final LinearLayout login = (LinearLayout) inflater.inflate(R.layout.login,null);
                final EditText et_id = (EditText) login.findViewById(R.id.et_id);
                final EditText et_password = (EditText) login.findViewById(R.id.et_password);

                builder.setView(login)
                        .setTitle("Login")
                        .setPositiveButton("login", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                if (et_id == null)
                                    Log.e("tag","!!!");

                                Log.e("tag",et_id.getText().toString());
                                String id = et_id.getText().toString();
                                String password = et_password.getText().toString();
                                if (!id.equals("") && !password.equals("")) {
                                    if (id.trim().equals("abc") && password.trim().equals("123")) {
                                        Toast.makeText(MainActivity.this, "login successful",
                                                Toast.LENGTH_LONG).show();
                                    } else {
                                        Toast.makeText(MainActivity.this, "error",
                                                Toast.LENGTH_SHORT).show();
                                    }
                                } else {
                                    Toast.makeText(MainActivity.this, "null",
                                            Toast.LENGTH_SHORT).show();
                                }

                            }
                        })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.show();
            }
        });
    }
}
