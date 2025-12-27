package pce;

public class test{
    public static void main(String[] args) {
        int x =13,y=0,z;
        try{
        z=x/y;
        }
        catch(ArithmeticException e){
                System.out.println(e+"divide by zero isnt allowed");
            }

        
        System.out.println("z");
        System.out.println("End");
        
    }
}