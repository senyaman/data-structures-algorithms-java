package misc.interview1;

public class Main {
    //finding out if two arrays have a common item. Not the efficient solution.
    public static boolean itemInCommon(int[] array1, int[] array2) {
        for(int i : array1) {
            for(int j : array2) {
                if(i == j) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));

    }

}
