import java.util.ArrayList;
import java.util.Collections;


public class arrayList {
    public static void main(String[] args) {
        //define an arrayList
        ArrayList<Integer>list=new ArrayList<>();
/*
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
*/
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        //get element
        int element=list.get(0);

        System.out.println(element);
        //add element in between
        list.add(1,2);
        System.out.println(list);
        //set element
        list.set(0,5);
        System.out.println(list);
        //delete element
        list.remove(0);
        System.out.println(list);
        //size of arraylist
        System.out.println(list.size());
        //Iterating arrayList
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
