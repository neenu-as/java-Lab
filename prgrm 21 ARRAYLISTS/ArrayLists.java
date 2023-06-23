import java.util.*;
class ArrayLists{
public static void main(String args[]){
//create a array list object.
ArrayList<String> al=new ArrayList<String>();
System.out.println("initial size of al:"+al.size());
// add elements to the array lists.
al.add("a");
al.add("b");
al.add("c");
al.add("d");
al.add("e");
al.add("f");
al.add(1,"a2");
System.out.println("size of al after additions:"+al.size());
//display the array conntents.
System.out.println("contents of al:"+al);
//the indexed get and set methods
String str=al.get(2);
al.set(2,str+"updated");
System.out.println("contents of al after updation:"+al);
//remove elements from the array list.
al.remove("d");
al.remove(2);
System.out.println("size of al after deletions:"+al.size());
System.out.println("contents of al:"+al);
}
}

