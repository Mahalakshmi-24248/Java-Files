import java.util.Scanner;
class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle: ");
        float p = input.nextFloat(); 
        System.out.print("Enter time: ");
        float t = input.nextFloat(); 
        System.out.print("Enter rate: ");
        float r = input.nextFloat(); 
        input.close();
        float SI = (p*t*r)/100; 
        System.out.println("Simple Interest : " +SI );
    }
}
