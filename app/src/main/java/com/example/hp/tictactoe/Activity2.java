package com.example.hp.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends MainActivity {

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
            }
            else if((x13==x22)&&(x13==x31)){
                if(x13 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }
            }
            else if((x11==x12)&&(x11==x13)){
                if(x11 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }
            }
            else if((x11==x21)&&(x11==x31)){
                if(x11 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }
            }
            else if((x31==x32)&&(x31==x33)){
                if(x31 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }
            }
            else if((x13==x23)&&(x13==x33)){
                if(x13 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }
            }
            else if((x22==x21)&&(x22==x23)){
                if(x22 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }
            }
            else if((x12==x22)&&(x12==x32)){
                if(x12 == 1){
                    win.setText(String.valueOf(player1.getText())+" wins...");
                }
                else{
                    win.setText(String.valueOf(player2.getText())+" wins...");
                }
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

      /*  win.setText("");
        player1.setText("");
        player2.setText("");
        R1C1.setEnabled(true);
        R1C2.setEnabled(true);
        R1C3.setEnabled(true);
        R2C1.setEnabled(true);
        R2C2.setEnabled(true);
        R2C3.setEnabled(true);
        R3C1.setEnabled(true);
        R3C2.setEnabled(true);
        R3C3.setEnabled(true);
        R1C1.setText("2");
        R1C2.setText("2");
        R1C3.setText("3");
        R2C1.setText("4");
        R2C2.setText("5");
        R2C3.setText("6");
        R3C1.setText("7");
        R3C2.setText("8");
        R3C3.setText("9");
        // RestartButton.setEnabled(true);
        x11=10;x12=2;x13=3;x21=4;x22=5;x23=6;x31=7;x32=8;x33=9;
        count = 0;*/
        Intent i=new Intent(Activity2.this,Activity2.class);
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
        setContentView(R.layout.content_2);
        win = (TextView) findViewById(R.id.winner2);
        player1= (EditText) findViewById(R.id.player12);
        player2= (EditText) findViewById(R.id.player22);
        RestartButton = (Button) findViewById(R.id.restart2);
        //RestartButton.setEnabled(true);
        R1C1=(Button) findViewById(R.id.b211);
        R1C2=(Button) findViewById(R.id.b212);
        R1C3=(Button) findViewById(R.id.b213);
        R2C1=(Button) findViewById(R.id.b221);
        R2C2=(Button) findViewById(R.id.b222);
        R2C3=(Button) findViewById(R.id.b223);
        R3C1=(Button) findViewById(R.id.b231);
        R3C2=(Button) findViewById(R.id.b232);
        R3C3=(Button) findViewById(R.id.b233);
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
