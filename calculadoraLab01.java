import java.util.Scanner;

public class calculadoraLab01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1, num2, total;
        int opcion;

        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextFloat();
                    total  = num1 + num2;
                    System.out.println("El total de su suma es: "+total);
                    break;

                case 2:
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextFloat();
                    total  = num1 - num2;
                    System.out.println("El total de su resta es: "+total);
                    break;

                case 3: //multiplicacion
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextFloat();
                    total  = num1 * num2;
                    System.out.println("El total de su multiplicacion es: "+total);
                    break;

                case 4: // division
                    System.out.println("Ingrese el primer numero");
                    num1 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero");
                    num2 = sc.nextFloat();
                    total  = num1 / num2;
                    System.out.println("El total de su division es: "+total);
                    break;

            }
        }while(opcion != 5);

    }

    public static void menu(){
        System.out.println("Bienvenido a la calculadora, que deseas hacer?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }


}
