import java.util.Scanner;

public class Tasksheet120 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the parameters:" );

        int param1 = scan.nextInt();
        int param2 = scan.nextInt();
        int param3 = scan.nextInt();

        int sum1 = allcumulativetotal(param1);
        int sum2 = allcumulativetotal(param2);
        int sum3 = allcumulativetotal(param3);
        System.out.println("Cumulative sum of"+ param1 +"is: "+sum1);
        System.out.println("Cumulative sum of"+ param2 +"is: "+sum2);
        System.out.println("Cumulative sum of"+ param3 +"is: "+sum3);

        int sums = sum1 + sum2 + sum3;
        System.out.println("The of all Cumulative is: "+sums);
    }

    public static int allcumulativetotal(int... numbers) {
        int sum = 0;
        for (int i = 1; i <= numbers[0]; i++){
            sum += i;
        }
        return sum;
    }
}
