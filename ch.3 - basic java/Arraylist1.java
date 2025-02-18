// ex 3.8; arrayList

import java.util.*;

class ArrayList1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int i, j;
    for(i = 0;i < 4;i++){
      list.add(i);
    }
    System.out.println("total elements of ArrayList list is: " + list.size());
    System.out.println(list);

    System.out.println("second element is: ");
    System.out.println(list.get(1));
    System.out.println("now remove second element:");
    list.remove(1);
    System.out.println(list);
  }
}

