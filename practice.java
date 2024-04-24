package src;
public class practice
{
    public static void main(String[] args) {
        int a=20;
        Integer i= Integer.valueOf(a);//converting explicitly
        Integer j=a;//autoboxing,
        int c =i.intValue();
        int d=j;
        System.out.println(a+" "+i+" "+j);
    }
}