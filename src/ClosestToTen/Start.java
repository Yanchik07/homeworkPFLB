package ClosestToTen;

public class Start {
    public static void main(String[] args) {
        int[] array = {8, 12, 5, 15};
        int closestValue = ClosestToTen.findClosest(array);
        System.out.println("Наиболее близкое значение к 10: " + closestValue);
    }
}