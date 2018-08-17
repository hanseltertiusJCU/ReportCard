package com.example.android.reportcard;

public class ReportCard {
    private String studentName;
    private int finalMathGrade;
    private int finalEnglishGrade;
    private int finalSportsGrade;
    private int finalHistoryGrade;

    public ReportCard(String name, int mathGrade, int englishGrade, int sportsGrade, int historyGrade){
        studentName = name;
        finalMathGrade = mathGrade;
        finalEnglishGrade = englishGrade;
        finalSportsGrade = sportsGrade;
        finalHistoryGrade = historyGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getFinalMathGrade() {
        return finalMathGrade;
    }

    public int getFinalEnglishGrade() {
        return finalEnglishGrade;
    }

    public int getFinalSportsGrade() {
        return finalSportsGrade;
    }

    public int getFinalHistoryGrade() {
        return finalHistoryGrade;
    }
}
