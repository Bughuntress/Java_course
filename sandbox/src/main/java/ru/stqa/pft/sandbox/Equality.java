package ru.stqa.pft.sandbox;

/**
 * Created by Zakhidat on 02.03.2017.
 */
public class Equality {
  public static void main(String[] args){
    String s1="firwfox";
    //String s2 = s1; Новый объект не создавался, используется ссылка на объект
    String s2=new String(s1);//Создан новый объект, хранится в другом месте и имеет разные ссылки, хотя содержание одинаковое

    System.out.println(s1==s2);//результат - не равны. Сравнение ссылок
    System.out.println(s1.equals(s2));//результат - равны.Сравнение логического содержания
  }
}
