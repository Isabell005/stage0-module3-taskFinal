package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {

        boolean t = number >= 0;
        boolean f = number <= 0;
        System.out.println(t || f);
    }
}