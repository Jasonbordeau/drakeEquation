package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        drakeEquation();

    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */

int N;
int rStar;
double f_p;
int numberOfExoplanets;
double f_l;
double f_i;
double f_c;
int L;
Scanner user;

user = new Scanner(System.in);

System.out.println("The number of intelligent species that are out there \n" +
                "that can communicate with us is:");
    System.out.println("1 yr=1 sr (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)");
    rStar = user.nextInt();
    System.out.println("0.2 to 0.5 (one fifth to one half of all stars formed will have planets)");
    f_p = user.nextDouble();
    System.out.println("1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)");
    numberOfExoplanets = user.nextInt();
    System.out.println("1 (100% of these planets will develop life)");
    f_l = user.nextDouble();
    System.out.println("1 (100% of which will develop intelligent life)");
    f_i = user.nextDouble();
    System.out.println("0.1 to 0.2 (10–20% of which will be able to communicate)");
    f_c = user.nextDouble();
    System.out.println("1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)");
    L = user.nextInt();



    }

}