package com.company;
//  while ; do while ;
//Консольдон бир сан бериниз.
//        Ал санга чейинки сандардын суммасын табыныз.
//        Мисалы:
//        10
//        Жооп: 55 -> себеби 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55

import java.util.Scanner;

public class Main {
static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        int san = 1;
        int counter = 0;
        System.out.println("San beriniz: ");
        int number = scanner.nextInt();
        while( counter < number ){
            san = san + counter;
            counter++;
            System.out.print(counter+"+");
        }
        System.out.print( "="+san);
    }
}
