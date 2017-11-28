package com.example.dial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dial.view.TouchRoateImageView;

public class MainActivity extends AppCompatActivity {
    private TouchRoateImageView imageView;
    private TextView textNumber, textAngle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        imageView.setOnCurDegreeChangeListener(new TouchRoateImageView.OnCurDegreeChangeListener() {
            @Override
            public void onCurDegreeChange(float curDegree) {
                textAngle.setText(curDegree + "°");
                setTextNumberByCurDegree(curDegree);
            }
        });
    }

    private void setTextNumberByCurDegree(float curDegree) {
        if (curDegree >= 342 || curDegree < 18) {
            textNumber.setText("0");
        } else if (curDegree >= 18 && curDegree < 54) {
            textNumber.setText("9");
        } else if (curDegree >= 54 && curDegree < 90) {
            textNumber.setText("8");
        } else if (curDegree >= 90 && curDegree < 126) {
            textNumber.setText("7");
        } else if (curDegree >= 126 && curDegree < 162) {
            textNumber.setText("6");
        } else if (curDegree >= 162 && curDegree < 198) {
            textNumber.setText("5");
        } else if (curDegree >= 198 && curDegree < 234) {
            textNumber.setText("4");
        } else if (curDegree >= 234 && curDegree < 270) {
            textNumber.setText("3");
        } else if (curDegree >= 270 && curDegree < 306) {
            textNumber.setText("2");
        } else if (curDegree >= 306 && curDegree < 342) {
            textNumber.setText("1");
        }
    }


    private void initView() {
        imageView = (TouchRoateImageView) findViewById(R.id.imageview);
        textNumber = (TextView) findViewById(R.id.text_number);
        textAngle = (TextView) findViewById(R.id.text_angle);
    }
}
