package com.example.home.guessnumber;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {
    int soluc=(int)(Math.random() * (100 - 0) + 1) + 0;
    String result="";
    String response="";
    TextView textInfo;
    TextView textRes;
    int numbMemo=0;
    ArrayList<Double> listresult = new ArrayList<Double>();
    final int listeBouton[] = {
            R.id.imageButton0,R.id.imageButton1,R.id.imageButton2,R.id.imageButton3,R.id.imageButton4,
            R.id.imageButton5,R.id.imageButton6,R.id.imageButton7,R.id.imageButton8,R.id.imageButton9
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInfo = findViewById(R.id.textViewTry);
        textRes = findViewById(R.id.textViewRes);
        textInfo.setText("");
        textRes.setText("?");
        for(int b : listeBouton){
            findViewById(b).setOnClickListener(this);
        }
    }
    public String checkNumber(String result){
        if(numbMemo<soluc){
            response="+"+ textInfo.getText();
        }else if(numbMemo>soluc){
            response="-"+ textInfo.getText();
        }else{
            response="BRAVO";
        }
        return response;
    }
    public void onClick(View view) {
        Log.d("TEST", "Bouton" + view.getId());

        if(textInfo.length()<2) {
            switch (view.getId()) {
                case R.id.imageButton0:
                    textInfo.setText(textInfo.getText() + "0");
                    break;
                case R.id.imageButton1:
                    textInfo.setText(textInfo.getText() + "1");
                    break;
                case R.id.imageButton2:
                    textInfo.setText(textInfo.getText() + "2");
                    break;
                case R.id.imageButton3:
                    textInfo.setText(textInfo.getText() + "3");
                    break;
                case R.id.imageButton4:
                    textInfo.setText(textInfo.getText() + "4");
                    break;
                case R.id.imageButton5:
                    textInfo.setText(textInfo.getText() + "5");
                    break;
                case R.id.imageButton6:
                    textInfo.setText(textInfo.getText() + "6");
                    break;
                case R.id.imageButton7:
                    textInfo.setText(textInfo.getText() + "7");
                    break;
                case R.id.imageButton8:
                    textInfo.setText(textInfo.getText() + "8");
                    break;
                case R.id.imageButton9:
                    textInfo.setText(textInfo.getText() + "9");
                    break;
                default:
            }
            textRes.setText(checkNumber((String) textInfo.getText()));
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
