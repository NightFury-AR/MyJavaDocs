package day01.JavaBasics;

//arrays
public class JavaArrays {
    public static void main(String[] args) {
        //1.creating arrays
        int array1[] = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[]{1,2,3,4,5};
        int array4[];
        array4 = new int[5];
        //to know the array variable type
        System.out.println(array1.getClass().getSimpleName());

        // to know the array length
        System.out.println(array1.length);

        //manually initialize the array
        for (int i=0;i<array1.length;i++) {
            array1[i] = i;
        }

        //iterate and print the arrays
        for (int i=0;i<array1.length;i++) {
            System.out.println(array1[i]);
        }

    }
}

