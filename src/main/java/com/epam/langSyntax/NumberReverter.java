package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        //
        int first = number%10;
        int second = (number/10)%10;
        int third = number/100;
        System.out.println(first*100+second*10+third);
    }

}
