package ru.stqa.pft.sandbox;

/**
 * Created by Zakhidat on 07.03.2017.
 */
public class Primes {
  public static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  /* public static boolean isPrimeWhile(int n) {
    int i=2;
    while (i<n) {
      if (n % i == 0) {
        return false;
      }
      i++;
     } return true;
    }
    */
  public static boolean isPrimeWhile(int n) {
    int i = 2;
    while (i < n && n % i != 0) {
      i++;
    }
    return i == n;
  }
  public static boolean isPrime(long n) {
    int i = 2;
    while (i < n && n % i != 0) {
      i++;
    }
    return i == n;
  }
  public static boolean isPrimeFast(int n) { //деление на половину чисел! до n пополам
    int m = (int) Math.sqrt(n);
    for (int i = 2; i < m; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

