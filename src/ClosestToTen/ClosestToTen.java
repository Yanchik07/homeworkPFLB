package ClosestToTen;

public class ClosestToTen {
    public static int findClosest(int[] arr) {
        int closest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - 10) <= Math.abs(closest - 10)) {
                // Если текущий элемент массива ближе к 10, обновляем значение closest
                closest = arr[i];
            }
        }

        return closest;
    }

}
