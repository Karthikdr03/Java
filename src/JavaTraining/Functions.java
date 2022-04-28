package JavaTraining;

public class Functions {
    public static void main(String[]args){
        Functions obj = new Functions();
        obj.test();
       int l =  obj.pqr();
        System.out.println(l);

//Non static methods
}
public void test() {
    System.out.println("test method");

}
    public  int pqr()
    {
        System.out.println("non void");
        int a = 1;
        int b = 2;
        int c=a+b;
        return c;


    }
}