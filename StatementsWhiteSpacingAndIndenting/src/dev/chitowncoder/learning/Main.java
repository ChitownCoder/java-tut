package dev.chitowncoder.learning;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; // this is a statement
        if (myVariable == 50) {
            System.out.println("Printed");
        }
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("this is" +
                " another," +
                " Still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
    }
}
