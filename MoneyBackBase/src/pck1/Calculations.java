package pck1;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Calculations {
   static ArrayList<Person> overPaid=new ArrayList<Person>();
   static ArrayList<Person> lessPaid =new ArrayList<Person>();

    public static float sum(ArrayList<Person> list) {
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).moneySpent;
        }
        return sum;
    }

    //funkcja obliczająca o ile każdy wydał mniej/więcej od równej zrzutki
    public static void foo(ArrayList<Person> list) {
        float sum = sum(list);
        //System.out.println("SUM: " +sum);
        float balance = sum / (list.size());
        //System.out.println("list size: "+list.size());
        //System.out.println("BALANCE: " + balance);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).diff = list.get(i).moneySpent - balance;
        }
    }

    public static void f0(ArrayList<Person> list){
        for(int i=0;i<list.size();i++){
            Person temp = list.get(i);
            if(temp.diff>0) {
                overPaid.add(temp);
            }
            if(temp.diff<0) {
                lessPaid.add(temp);
            }
        }
        //sort(bubbleSort)
        for(int i=0;i<overPaid.size()-1;i++){
            for (int j=0;j<overPaid.size()-i-1;j++){
                if(overPaid.get(j).diff<overPaid.get(j+1).diff){
                    Person temp=overPaid.get(j);
                    overPaid.set(j, overPaid.get(j + 1));
                    overPaid.set(j+1,temp);
                }
            }
        }
        for(int i=0;i<lessPaid.size()-1;i++){
            for (int j=0;j<lessPaid.size()-i-1;j++){
                if(lessPaid.get(j).diff>lessPaid.get(j+1).diff){
                    Person temp=lessPaid.get(j);
                    lessPaid.set(j, lessPaid.get(j + 1));
                    lessPaid.set(j+1,temp);
                }
            }
        }
        printLists(overPaid);
        printLists(lessPaid);
    }
    public static void printLists(ArrayList<Person> list){
        String x="";
        for(int i=0;i<list.size();i++){
            x+=list.get(i).name + " " + list.get(i).diff+ " ";
        }
        System.out.println(x);
    }

    public static String f1(ArrayList<Person> list) {
        //najpierw sprawdzam czy ktoś ma tyle na minusie co drugi na plusie
        Person temp;
        String answear = "";
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    if ((temp.diff + list.get(j).diff) == 0 && temp.diff!=0 && list.get(j).diff!=0) {
                        if (temp.diff < list.get(j).diff) {
                            answear += temp.name + " musi oddac " + (-1) * temp.diff + " do " + list.get(j).name;
                            //  System.out.println(answear);
                        } else {
                            answear += list.get(j).name + " musi oddac " + (-1) * list.get(j).diff + " do " + temp.name;
                            // System.out.println(answear);
                        }
                        temp.diff=0;
                        list.get(j).diff=0;
                    }
                }
            }
        }
        return answear;
    }

    public static String f2(ArrayList<Person> list){
        String answear="";

        return answear;
    }

}
