/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;

/**
 *
 * @author itshr
 */
public class ArrayListTest {

    public static void main(String[] args) {
        int MAX = 5;
        int nums[] = new int[MAX];
        nums[0] = 43;
        nums[1] = 45;
        nums[2] = 32;
        nums[3] = 22;
        nums[4] = 26;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "");
        }
        System.out.println("");

        //Arraylist
        ArrayList arrList = new ArrayList();
        ArrayList arrList2 = new ArrayList();
        ArrayList arrList3 = new ArrayList();
        System.out.println(arrList.size());
        arrList.add(90);
        arrList.add(2);
        arrList.add(930);
        arrList.add(3);
        arrList.add(30);
        printValues(arrList);

        arrList.add(1, 100);
        printValues(arrList);

        arrList.set(2, 34);
        printValues(arrList);
//        arrList.remove(34);// value
        arrList.remove(1);// index
//        arrList.clear();

        arrList2 = arrList;
        printValues(arrList2);

        arrList2.set(0, 85);
        printValues(arrList);

        arrList3 = (ArrayList) arrList.clone();
        printValues(arrList3);
        arrList3.add(0, 99);
        printValues(arrList3);
        printValues(arrList);

        ArrayList arrList4 = new ArrayList();

        arrList4.add(0, true);
        arrList4.add(1, "kath");
        arrList4.add(2, "1");
        printValues(arrList4);

        ArrayList arrList5 = new ArrayList();
        arrList5.add(new Person(1, "name1"));
        arrList5.add(new Student("b", "fdf"));
        printValues(arrList5);
        Person p = new Person(2, "ram");
        arrList.set(0, p);
        printValues(arrList5);
         printValues1(arrList5);

    }

    public static void printValues(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println("");
    }

    public static void printValues1(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            Object obj=list.get(i);
            if((Person)obj  instanceof Person)
            {
            Person p=(Person) obj;
            p.print();
            }
            else  if ((Student)obj  instanceof Student)
                    {
                     Student s=(Student ) obj;
                      s.PrintStudent();
                    }
             
            
        }
        System.out.println("");
    }
}
