package com.smdev;

public class _Main {

    public static void main(String[] args) {

        Rover rover = new Rover(0, 0, "N", 5, 5);

        rover.rotateLeft();
        rover.rotateLeft();
        rover.move();
        rover.print();

        rover.rotateLeft();
        rover.rotateLeft();
        rover.move();
        rover.print();

        rover.rotateRight();
        rover.rotateRight();
        rover.move();
        rover.print();

        rover.rotateRight();
        rover.rotateRight();
        rover.move();
        rover.print();

        rover.rotateRight();
        rover.rotateLeft();
        rover.print();

        rover.move();
        rover.move();
        rover.move();
        rover.move();
        rover.move();
        rover.print();

        rover.move();
        rover.print();

        rover.rotateLeft();
        rover.move();
        rover.print();

        rover.rotateRight();
        rover.move();
        rover.print();

        rover.move();
        rover.print();

        rover.move();
        rover.print();

        rover.rotateRight();
        rover.print();

        rover.move();
        rover.print();

    }
}
