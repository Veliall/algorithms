package leetCode.canPlaceFlowers;

public class Solution {
    public static void main(String[] args) {
//        int[] fl = {1,0,0,0,1} ; //1
//        int[] fl = {1,0,0,0,1}; //2
        int[] fl = {1,0,0,0,0,1};
        boolean b = canPlaceFlowers(fl, 2);
        System.out.println(b);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int possible = 0;
        boolean next = false;
        boolean previous = false;
        for (int plot : flowerbed) {
            if (plot == 1) {
                if (previous) possible--;
                next = true;
                continue;
            }

            if (next) {
                next = false;
                previous = false;
                continue;
            }

            possible++;
            previous = true;
            next = true;
        }
        return possible >= n;
    }
}
