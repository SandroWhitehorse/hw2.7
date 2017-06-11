package com.trylabs;

public class Main {

    public static void main(String[] args) {
    int a=243;
	int pow2a=a*a;
	int a1=a/100;
	int a2=(a/10)%10;
	int a3=a%10;
	int sum_a_pow_3=a1*a1*a1+a2*a2*a2+a3*a3*a3;
	if (pow2a>sum_a_pow_3) System.out.println("квадрат числа больше суммы кубов его цыфр");
	else System.out.println("Сумма кубов чисел числа больше его квадрата");
    }
}
