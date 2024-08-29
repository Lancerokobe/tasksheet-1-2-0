import java.util.Scanner;

public class Tasksheet120 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the parameters:" );
        String params = scan.nextLine();
        String[] inputArray = params.split(" ");
        int[] params1 = new int [inputArray.length];

        for (int i = 0; i < inputArray.length; i++){
            params1[i] = Integer.parseInt(inputArray[i]);
        }

        int total = allcumulativetotal(params1);
        System.out.println("Total sum of Cumulative sums is: "+ total);
    }

    public static int allcumulativetotal(int... numbers) {
        int sum = 0;
        for (int number : numbers){
            int cumulativesum = 0;
            for (int i = 1; i <= number; i++){
                cumulativesum += i;
            }
            System.out.println("The Cumulative sum for "+number+" is: "+cumulativesum);
            sum += cumulativesum;
        }
        return sum;
    }
}
