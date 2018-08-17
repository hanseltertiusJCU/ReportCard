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

    public void setFinalMathGrade(int finalMathGrade) {
        this.finalMathGrade = finalMathGrade;
    }

    public int getFinalEnglishGrade() {
        return finalEnglishGrade;
    }

    public void setFinalEnglishGrade(int finalEnglishGrade) {
        this.finalEnglishGrade = finalEnglishGrade;
    }

    public int getFinalSportsGrade() {
        return finalSportsGrade;
    }

    public void setFinalSportsGrade(int finalSportsGrade) {
        this.finalSportsGrade = finalSportsGrade;
    }

    public int getFinalHistoryGrade() {
        return finalHistoryGrade;
    }

    public void setFinalHistoryGrade(int finalHistoryGrade) {
        this.finalHistoryGrade = finalHistoryGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "Student name='" + studentName + '\'' +
                ", Math grade=" + finalMathGrade +
                ", English grade=" + finalEnglishGrade +
                ", Sports grade=" + finalSportsGrade +
                ", History grade=" + finalHistoryGrade +
                '}';
    }
}
