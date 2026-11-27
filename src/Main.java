//the first task
//public class Main{
//    public static void main(String[] args){
//        int[] index = {1, 4, 5, 6, 9, 10, 100, -3};
//
//        System.out.println("The number at index 0 is: " + index[0]);
//        System.out.println("The number at index 2 is: " + index[2]);
//        System.out.println("The number at index 2 is: " + index[4]);
//        System.out.println("The number at index 2 is: " + index[6]);
//    }
//}

//the second task
//public class Main{
//    public static void main(String[] args){
//
//        int[] summer = {1, 4, 5, 6, 7, 90, -100, 2, 75, 50};
//        int sum = 0;
//        System.out.print("Array: ");
//        for(int i = 0; i < summer.length; i++){
//            System.out.print(summer[i] + " ");
//            if(summer[i] > 0){
//                sum += summer[i];
//            }
//        }
//        System.out.println("\nThe sum is: " + sum);
//
//    }
//}




//the third task
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        int[] numbers = new int[8];
//        System.out.println("Type 8 numbers: ");
//        for(int i = 0; i < numbers.length; i++){
//            numbers[i] = sc.nextInt();
//        }
//        for(int i = 0; i < numbers.length; i++){
//            if(numbers[i] >= 10 && numbers[i] <= 20){
//                count++;
//            }
//        }
//        System.out.println("Count: " + count);
//    }
//}


//the forth task
//public class Main{
//    public static void main(String[] args) {
//
//        int[] smallest = {1, 2, 4, -7, 5, -3, 56};
//        int minIndex = 0;
//        for(int i = 0; i < smallest.length; i++){
//            if(smallest[minIndex] > smallest[i]){
//                smallest[minIndex] = smallest[i];
//                minIndex = i;
//            }
//        }
//        System.out.println("Min: " + smallest[minIndex] + ", index: " + minIndex);
//
//    }
//}

//the fifth task
//public class Main{
//    public static void main(String[] args){
//        int adder1 = 5;
//        int[] adder = {5, 6, -5, 100, 34, 56};
//        for(int i = 0; i < adder.length; i++){
//            adder[i] += 5;
//            System.out.print(adder[i] + " ");
//        }
//    }
//}

//the sixth task
//public class Main {
//    public static void main(String[] args){
//        int[] element = {1, 3, 5, 6, 90, 123, -45, 9};
//        int firstElement = element[0];
//        int count = 0;
//        for(int i = 1; i < element.length; i++){
//            if(firstElement < element[i]){
//             count++;
//            }
//        }
//        System.out.println("Count -> " + count);
//    }
//}

//the seventh task
//public class Main {
//    public static void main(String[] args){
//        int[] a = {1, 3, 4, 5, 2, 12, 90, -45};
//        int[] even = new int[a.length];
//        int count = 0;
//
//        for(int i = 0; i < a.length; i++){
//            if(a[i] % 2 == 0){
//                even[count] = a[i];
//                count++;
//            };
//        }
//        for(int i = 0; i < count; i++){
//            System.out.print(even[i] + " ");
//        }
//    }
//}



//the 8th task
//public class Main {
//    public static void main(String[] args) {
//
//    int[] temp = {18, 20, 22, 19, 21, 24, 16};
//    int total = 0;
//    double average = 0;
//    int above = 0;
//    for(int i = 0; i < temp.length; i++){
//        total += temp[i];
//        }
//    average = (double) total / temp.length;
//        System.out.println("Average: " + average);
//
//        for(int i = 0; i < temp.length; i++){
//            if(temp[i] > average){
//                above++;
//            }
//        }
//        System.out.println("Above-> " + above);
//    }
//}


//the ninth task
//public class Main {
//    public static void main(String[] args){
//        int[][] array = {
//                {1, 3, 4},
//                {5, 6, -4}
//        };
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}



//teh tenth task
public class Main {
    public static void main(String[] args){
        int[][] zero = {
                {1, 4, 5},
                {0, 3, 1},
                {89, 0, 9}
        };
        int counter = 0;
        for(int i = 0; i < zero.length; i++){
            for(int j = 0; j < zero[i].length; j++){
                if(zero[i][j] == 0){
                    counter++;
                }
            }
        }
        System.out.println("Zeros -> " + counter);
    }
}