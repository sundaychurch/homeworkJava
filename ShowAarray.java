import java.util.Scanner;
class ShowAarray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 3 zad
        /*
        int[] ar = new int[10];
        float sum = 0;
        for(int i=0;i<ar.length;i++)
        {
            ar[i] = scanner.nextInt();
            sum += ar[i];
        }
            System.out.println(sum/10);
            System.out.println(sum);
            */
        // 4 zad
        /*
        int[] ar = new int[10];
        int summ = 0;
        int i = 0;
        int max = 0;
        int min = 9999999;
        do
        {
            ar[i] = scanner.nextInt();
            summ += ar[i];
            if( ar[i] > max)
                max = ar[i];
            else if(ar[i] < min)
                min = ar[i];
            i++;
        }
        while(i < 10);
        System.out.println(summ + " " + max + " " + min);
        */
        // 5 zad
        /*
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i+1) + ": " + args[i]);
        }
        */
        // 6 zad
        /*
        for(float i=1;i<11;i++)
        {
            System.out.printf("%.2f\n", 1/i);
        }
        */

        // 7 zad
        /*
        int num = scanner.nextInt();
        long res = 1;
        if(num < 0 || num > 25)
            System.out.println("Error");
        else
        {
            for (long i = 0; i < num; i++)
                res *= (i + 1);
            System.out.println(res);
        }
         */
    }
}