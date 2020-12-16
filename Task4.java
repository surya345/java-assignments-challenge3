import java.util.Scanner;
public class Task4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float cels;
        float fahr;
        char ch;
        do{
        System.out.println("Enter the temperature in degree celsius");
        cels=sc.nextInt();
        fahr=(cels*9/5)+32;
        System.out.println("Temperature(celsius)="+cels +"\t\tTemperature(Fahrenheit)="+fahr);
        System.out.println("Do you want to continue(y/n)");
        ch=sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');
    }
}
