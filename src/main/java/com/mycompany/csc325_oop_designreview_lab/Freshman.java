package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    private int credits;

    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    } // credits getter

    public void setCredits(int credits) {
        this.credits = credits;
    } // credits setter

    @Override
    public String toString() {
        return String.format("Freshman\n %s\n credits: %d", super.toString(), getCredits());
    }
}
