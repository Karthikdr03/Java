package JavaTraining;

import java.util.ArrayList;

import java.util.List;



public class ArrayListExample {
    static void arrayFunction()
    {
        List<String> li = new ArrayList<String>();
        li.add("Karthik");
        li.add("Sachin");
        li.add(2, "Charan");

        for (String s : li) {
            System.out.println("S ==" + s);

        }
        for (int i = 0;i<li.size();i++)
    {
        System.out.println("li.get(i)=" + li.get(i));

    }

    public static void main(String[] args)
        {
             arrayFunction();
    }
}