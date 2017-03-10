package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Zakhidat on 10.03.2017.
 */
public class Collections {
  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Python", "PHP"};

    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

    for (String l: languages){
      System.out.println("Я хочу выучить " + l);
    }
  }

}
