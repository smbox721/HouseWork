package ch15.sec03.exam02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashsetTest {

  public static void main(String[] args) {
    HashSet<String> colors1 = new HashSet<String>(); // 타입 지정
    HashSet<String> colors2 = new HashSet<>(); // 타입 생략 가능
    HashSet<String> colors3 = new HashSet<>(10); // 초기 용량(Capacity) 설정
    HashSet<String> colors4 = new HashSet<>(colors1); // 다른 Collection값으로 초기화
    HashSet<String> colors5 = new HashSet<>(Arrays.asList("Blue", "Black", "White")); // Arrays.asList()
    HashSet<String> colors6 = new HashSet<>(){{
        add("Blue");
        add("Black");
        add("White");
    }};
    
    System.out.println(colors1);
    System.out.println(colors3);
    System.out.println(colors5);
    System.out.println(colors6);
    
//    HashSet<String> colors = new HashSet<>();
//    colors.add("Black");
//    colors.add("White");
//    colors.add("Green");
//    colors.add("Red");
//    colors.add(null);
//    colors.add(null);
//    colors.add("Red");
//
//    System.out.println(colors);
//    
//    HashSet<String> otherColors = new HashSet<>(Arrays.asList("Black", "Yellow", "Purple"));
//    colors.addAll(otherColors);
//    
//    System.out.println(colors);
//    System.out.println(otherColors);
    
    HashSet<String> colors = new HashSet<>();
    colors.add("Black");
    colors.add("White");
    colors.add("Green");
    colors.add("Blue");
    colors.add("Red");
    colors.add("Purple");

    if( colors.remove("Red") ) {
      System.out.println(colors); // [White, Blue, Purple, Black, Green]
    }
    
    System.out.println(colors);
    
//    colors.removeIf(color -> color.startsWith("B"));
//    System.out.println(colors); // [White, Purple, Green]
//
//    colors.removeAll(Arrays.asList("White", "Green"));
//    System.out.println(colors); // [Purple]
//
//    colors.clear();
//    System.out.println(colors); // []
    
    // for-each loop
    for (String color : colors) {
        System.out.print(color + "  ");
    }
    System.out.println();

    // using iterator
    Iterator<String> iterator = colors.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "  ");
    }
    System.out.println();
    
    
    System.out.println(colors.contains("Green")); // true
    System.out.println(colors.contains("Purple")); // false
    System.out.println(colors.contains("Red")); // false
}
}