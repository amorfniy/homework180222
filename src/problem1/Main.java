package problem1;

public class Main {

    public static void main(String[] args) {
        int[] haystack = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};


        int haystack1 = binarySearch(haystack,15);
        int haystack2 = binarySearch(haystack, 5);

        if (haystack1 == -1) {
            System.out.println("searched value not found");
        }

        else {
            System.out.println("index of searched value is: " + haystack1);
        }

        if (haystack2 == -1) {
            System.out.println("value not found");
        }

        else {
            System.out.println("index of searched value is " + haystack2);
        }
    }

    public static int binarySearch(int[] arr, int x) {
        int lowest = 0;
        int highest = arr.length - 1;
        while(lowest <= highest) {
            int middle = lowest + (highest - lowest) / 2;

            if(arr[middle] == x) {
                return middle;
            }

            if(x > arr[middle]) {
                lowest = middle + 1;
            }

            else {
                highest = middle - 1;
            }
        }
        return -1;
    }
}
