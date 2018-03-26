package com.example.hp.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.sax.EndTextElementListener;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button R1C1,R1C2,R1C3,R2C1,R2C2,R2C3,R3C1,R3C2,R3C3, RestartButton;
    TextView win;
    EditText player1,player2;
    int x11=10,x12=2,x13=3,x21=4,x22=5,x23=6,x31=7,x32=8,x33=9;
    int count=0;
    public void check()
    {
            if(
                        ((x11==x22)&&(x11==x33)) ||
                        ((x13==x22)&&(x13==x31)) ||
                        ((x11==x12)&&(x11==x13)) ||
                        ((x11==x21)&&(x11==x31)) ||
                        ((x31==x32)&&(x31==x33)) ||
                        ((x13==x23)&&(x13==x33)) ||
                        ((x22==x21)&&(x22==x23)) ||
                        ((x12==x22)&&(x12==x32))
                )
            {
            if((x11==x22)&&(x11==x33)){
                if(x33 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }

                R1C1.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R2C2.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R3C3.setBackgroundColor(Color.parseColor("#FFFF4081"));
            }
            else if((x13==x22)&&(x13==x31)){
                if(x13 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }

                R1C3.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R2C2.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R3C1.setBackgroundColor(Color.parseColor("#FFFF4081"));
            }
            else if((x11==x12)&&(x11==x13)){
                if(x11 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }

                R1C1.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R1C2.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R1C3.setBackgroundColor(Color.parseColor("#FFFF4081"));


            }
            else if((x11==x21)&&(x11==x31)){
                if(x11 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }
                R1C1.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R2C1.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R3C1.setBackgroundColor(Color.parseColor("#FFFF4081"));
            }
            else if((x31==x32)&&(x31==x33)){
                if(x31 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }

                R3C1.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R3C2.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R3C3.setBackgroundColor(Color.parseColor("#FFFF4081"));
            }
            else if((x13==x23)&&(x13==x33)){
                if(x13 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }

                R1C3.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R2C3.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R3C3.setBackgroundColor(Color.parseColor("#FFFF4081"));
            }
            else if((x22==x21)&&(x22==x23)){
                if(x22 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }

                R2C1.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R2C2.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R2C3.setBackgroundColor(Color.parseColor("#FFFF4081"));
            }
            else if((x12==x22)&&(x12==x32)){
                if(x12 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }

                R1C2.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R2C2.setBackgroundColor(Color.parseColor("#FFFF4081"));
                R3C2.setBackgroundColor(Color.parseColor("#FFFF4081"));
            }
            R1C1.setEnabled(false);
            R1C2.setEnabled(false);
            R1C3.setEnabled(false);
            R2C1.setEnabled(false);
            R2C2.setEnabled(false);
            R2C3.setEnabled(false);
            R3C1.setEnabled(false);
            R3C2.setEnabled(false);
            R3C3.setEnabled(false);
            RestartButton.setEnabled(true);

        }
        else if(count == 9){
            win.setText("Match Draw...");
            RestartButton.setEnabled(true);

        }
    }
    public void restart(){

        win.setText("");
        player1.setText("");
        player2.setText("");
        R1C1.setEnabled(true);
        //R1C1.setBackgroundColor("#d6d7d7");
        R1C2.setEnabled(true);
        R1C3.setEnabled(true);
        R2C1.setEnabled(true);
        R2C2.setEnabled(true);
        R2C3.setEnabled(true);
        R3C1.setEnabled(true);
        R3C2.setEnabled(true);
        R3C3.setEnabled(true);
        R1C1.setText("");
        R1C2.setText("");
        R1C3.setText("");
        R2C1.setText("");
        R2C2.setText("");
        R2C3.setText("");
        R3C1.setText("");
        R3C2.setText("");
        R3C3.setText("");
       // RestartButton.setEnabled(true);
        x11=10;x12=2;x13=3;x21=4;x22=5;x23=6;x31=7;x32=8;x33=9;
        count = 0;
        R1C1.setBackgroundColor(Color.parseColor("#d6d7d7"));
        R1C2.setBackgroundColor(Color.parseColor("#d6d7d7"));
        R1C3.setBackgroundColor(Color.parseColor("#d6d7d7"));
        R2C1.setBackgroundColor(Color.parseColor("#d6d7d7"));
        R2C2.setBackgroundColor(Color.parseColor("#d6d7d7"));
        R2C3.setBackgroundColor(Color.parseColor("#d6d7d7"));
        R3C1.setBackgroundColor(Color.parseColor("#d6d7d7"));
        R3C2.setBackgroundColor(Color.parseColor("#d6d7d7"));
        R3C3.setBackgroundColor(Color.parseColor("#d6d7d7"));

    }
  /*  public boolean check2()
    {
        if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
        {
            return false;
        }
        else
        {
            return true;
        }
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.content_main);
        win = (TextView) findViewById(R.id.winner);
        player1= (EditText) findViewById(R.id.player1);
        player2= (EditText) findViewById(R.id.player2);
        RestartButton = (Button) findViewById(R.id.restart);
        //RestartButton.setEnabled(true);
        R1C1=(Button) findViewById(R.id.b11);
        R1C2=(Button) findViewById(R.id.b12);
        R1C3=(Button) findViewById(R.id.b13);
        R2C1=(Button) findViewById(R.id.b21);
        R2C2=(Button) findViewById(R.id.b22);
        R2C3=(Button) findViewById(R.id.b23);
        R3C1=(Button) findViewById(R.id.b31);
        R3C2=(Button) findViewById(R.id.b32);
        R3C3=(Button) findViewById(R.id.b33);
//int x11, x12, x13, x21;int x22;int x23;int x31;int x32;int x33

   //     final String ply1 = player1.getText().toString();
     //   final String ply2 = player2.getText().toString();

        RestartButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                restart();
            }
        });

        R1C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count%2==0)
                {
                    R1C1.setText("O");
                    x11=0;
                }
                else
                {
                    R1C1.setText("X");
                    x11=1;
                }
                if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
                {
              //      Toast.makeText(MainActivity.this,"Please Enter Player Name",Toast.LENGTH_LONG).show();
                    player1.setText("First Player");
                    player2.setText("Second Player");
                }


                R1C1.setEnabled(false);
                check();
            }
        });
        R1C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count%2==0)
                {
                    R1C2.setText("O");
                    x12=0;
                }
                else
                {
                    R1C2.setText("X");
                    x12=1;
                }
                if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
                {
                    player1.setText("First Player");
                    player2.setText("Second Player");
                }
                R1C2.setEnabled(false);
                check();
            }
        });
        R1C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count%2==0)
                {
                    R1C3.setText("O");
                    x13=0;
                }
                else
                {
                    R1C3.setText("X");
                    x13=1;
                }
                if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
                {
                    player1.setText("First Player");
                    player2.setText("Second Player");
                }
                R1C3.setEnabled(false);
                check();

            }
        });
        R2C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count%2==0)
                {
                    R2C1.setText("O");
                    x21=0;
                }
                else
                {
                    R2C1.setText("X");
                    x21=1;
                }
                if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
                {
                    player1.setText("First Player");
                    player2.setText("Second Player");
                }
                R2C1.setEnabled(false);
                check();
            }
        });
        R2C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count%2==0)
                {
                    R2C2.setText("O");
                    x22=0;
                }
                else
                {
                    R2C2.setText("X");
                    x22=1;
                }
                if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
                {
                    player1.setText("First Player");
                    player2.setText("Second Player");
                }
                R2C2.setEnabled(false);
                check();
            }
        });
        R2C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count%2==0)
                {
                    R2C3.setText("O");
                    x23=0;
                }
                else
                {
                    R2C3.setText("X");
                    x23=1;
                }
                if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
                {
                    player1.setText("First Player");
                    player2.setText("Second Player");
                }
                R2C3.setEnabled(false);
                check();
            }
        });
        R3C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count%2==0)
                {
                    R3C1.setText("O");
                    x31=0;
                }
                else
                {
                    R3C1.setText("X");
                    x31=1;
                }
                if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
                {
                    player1.setText("First Player");
                    player2.setText("Second Player");
                }
                R3C1.setEnabled(false);
                check();
            }
        });
        R3C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count%2==0)
                {
                    R3C2.setText("O");
                    x32=0;
                }
                else
                {
                    R3C2.setText("X");
                    x32=1;
                }
                if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
                {
                    player1.setText("First Player");
                    player2.setText("Second Player");
                }
                R3C2.setEnabled(false);
                check();
            }
        });
        R3C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count%2==0)
                {
                    R3C3.setText("O");
                    x33=0;
                }
                else
                {
                    R3C3.setText("X");
                    x33=1;
                }
                if(player1.getText().toString().equals("") && player2.getText().toString().equals(""))
                {
                    player1.setText("First Player");
                    player2.setText("Second Player");
                }
                R3C3.setEnabled(false);
                check();
            }
        });




    }


}