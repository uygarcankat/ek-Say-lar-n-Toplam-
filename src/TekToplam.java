import java.util.Scanner;



public class TekToplam {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        boolean isTrue = true;
        int sum=0;
        int number;
        int k = 0 ;



        do {
            System.out.println("Lütfen bir sayı giriniz");
            number = input.nextInt();
            k++;
            if (number < 0) {
                isTrue = false;}

            else {
                System.out.println(number);

                sum +=number;


            }
        }
            while (isTrue) ;

        System.out.println("sum:"+sum);
        double avarage= sum/2;
        System.out.println("avarage:"+avarage);


        System.out.println("...........................................");
*/

        Scanner input = new Scanner(System.in);
        boolean isTrue = true;
        int sum=0;
        int number;
        int k = 0 ;

        do {
            System.out.println("Lütfen bir sayı giriniz");
            number = input.nextInt();
            k++;
            if (number % 2 == 1 ) {
                isTrue = false;}

            else if((number % 2==0) || (number % 4==0) ) {
                System.out.println(number);

                sum +=number;


            }
        }
        while (isTrue) ;

        System.out.println("sum:"+sum);
        double avarage= sum/2;
        System.out.println("avarage:"+avarage);


    }
}

