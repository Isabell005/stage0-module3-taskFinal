package lang.print.gaps.finalModuleTask;

import java.util.Scanner;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
       while (number!=0){
           sum= sum+number%10;
           number=number/10;
       }
        System.out.println(sum);
    }
}
