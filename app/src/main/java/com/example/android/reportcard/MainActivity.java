package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        ArrayList<ReportCard> studentsList = new ArrayList<ReportCard>();

        studentsList.add(new ReportCard("Jamie", 80, 60, 70, 65));
        studentsList.add(new ReportCard("Alicia", 90, 85, 65, 85));
        studentsList.add(new ReportCard("Roy", 50, 70, 90, 55));
        studentsList.add(new ReportCard("Pam", 75, 85, 65, 85));

        for (int i=0;i<studentsList.size();i++){
            TextView studentText = new TextView(this);

            ReportCard studentList = studentsList.get(i);

            studentText.setText(studentList.toString());

            rootView.addView(studentText);

        }
    }
}
