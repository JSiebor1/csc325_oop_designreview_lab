package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int credits;

    public Senior(String name, short age, int credits) {
        super(name, age);
        if(credits >= 85) {
            this.credits = credits;
        }
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return String.format("Senior\n %s\n credits: %d", super.toString(), getCredits());
    }
}
