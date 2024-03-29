import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio;
        double n= 3.14159;
        double area;
        Scanner entrada = new Scanner(System.in);
        raio = entrada.nextDouble();

        area =  n*(Math.pow(raio,2));

        System.out.printf("A=%.4f\n",area);



    }
}
