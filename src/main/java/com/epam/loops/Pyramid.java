package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = cathetusLength; j >= 1; j--) {
                line.append(j > i ? " " : j);
            }
            for (int j = 2; j <= i; j++) {
                line.append(j);
            }
            System.out.println(line);
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
