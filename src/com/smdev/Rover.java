package com.smdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rover {

    private static final List<String> DIRECTIONS = new ArrayList<>(Arrays.asList("N", "E", "S", "W"));

    private int posX;
    private int posY;
    private String direction;

    private int maxX;
    private int maxY;

    public Rover(int x, int y, String direction, int maxX, int maxY) {
        this.posX = x;
        this.posY = y;
        this.direction = direction;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void rotateLeft() {
        int index = DIRECTIONS.indexOf(this.direction);
        index = decrease(index, 0, 3);
        this.direction = DIRECTIONS.get(index);
    }

    public void rotateRight() {
        int index = DIRECTIONS.indexOf(this.direction);
        index = increase(index, 0, 3);
        this.direction = DIRECTIONS.get(index);
    }

    public void move() {
        switch (this.direction) {
            case "N":
                this.posY = increase(this.posY, 0, this.maxY);
                break;
            case "E":
                this.posX = increase(this.posX, 0, this.maxX);
                break;
            case "S":
                this.posY = decrease(this.posY, 0, this.maxY);
                break;
            case "W":
                this.posX = decrease(this.posX, 0, this.maxX);
                break;
            default:
                break;
        }
    }

    public void print() {
        System.out.println(this.posX + " " + this.posY + " " + this.direction);

        printField();
    }

    private void printField() {
        StringBuilder field = new StringBuilder();
        for (int y = this.maxY; y >= 0; y--) {
            for (int x = 0; x <= this.maxX; x++) {
                if (this.posX == x && this.posY == y) {
                    field.append(this.direction);
                } else {
                    field.append("_");
                }
                field.append("|");
            }
            field.append("\n");
        }
        System.out.println(field.toString());
    }

    private int increase(int idx, int min, int max) {
        idx++;
        if (idx > max) {
            idx = min;
        }
        return idx;
    }

    private int decrease(int idx, int min, int max) {
        idx--;
        if (idx < min) {
            idx = max;
        }
        return idx;
    }
}
