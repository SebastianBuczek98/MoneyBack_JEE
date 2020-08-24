package pck1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "Data",urlPatterns = {"/Data"})
public class Data extends HttpServlet {
    ArrayList<Person> list = new ArrayList();
    float sum;
    //action="#{Data.doGet()}"
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        for(int i=0;i<4;i++){
            String nameTemp = "name" + Integer.toString(i);
            String moneySpentTemp = "moneySpent" + Integer.toString(i);

            String name = request.getParameter(nameTemp);
            String moneySpent = request.getParameter(moneySpentTemp);
            try{
                list.add(new Person(name, Float.parseFloat(moneySpent)));
            }
            catch(Exception e){
                System.out.println("Empty String");
            }
        }

        Calculations.foo(list);
        for(int i=0;i<list.size();i++){
            out.println(list.get(i).name);
            out.println(list.get(i).moneySpent);
            out.println("    Diff: " + list.get(i).diff);
            out.println();
            //System.out.println(list.get(i).name);
            //System.out.println(list.get(i).moneySpent);
        }
        out.println();
        Calculations.f0(list);
        out.println(Calculations.f1(list));

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public float sum(ArrayList<Person> list){
        for(int i=0;i<list.size();i++){
            sum+=list.get(i).moneySpent;
        }
        return sum;
    }

}
