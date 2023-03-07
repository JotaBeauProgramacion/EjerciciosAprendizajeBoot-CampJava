public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroif;
        int numeroWhile;
        int numerodoWhile;
        int numerofor=0;
        int estacion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el valor de la variable para el if: ");
        numeroif=sc.nextInt();
        if (numeroif>0) {
            System.out.println("El numero es positivo");
        } else if(numeroif==0){
             System.out.println("El numero es 0");
        } else if (numeroif<0){
            System.out.println("El numero es negativo");
        }
        
        System.out.println("-----------------------");
        System.out.print("Dime el valor de la variable para el while: ");
        numeroWhile=sc.nextInt();
        while (numeroWhile<3) {            
            System.out.println("El numero ahora es: "+numeroWhile++);
        }
        
        System.out.println("-----------------------");
        System.out.print("Dime el valor de la variable para el do while: ");
        numerodoWhile=sc.nextInt();
        do {
            numerodoWhile++;
            
        } while (numerodoWhile<3);
        System.out.println("El numero final es: "+numerodoWhile);
        
        System.out.println("--------------------------");
        System.out.println("El numero para el for es 0");
        for (int i = 0; i <= 3; i++) {
            System.out.println("El numero actual del for es: "+(numerofor+i));
        }
        
        System.out.println("-----------------------------");
        System.out.println("1) Primavera");
        System.out.println("2) Verano");
        System.out.println("3) Otono");
        System.out.println("4) Invierno");
        System.out.print("Dime en que estacion estamos: ");
        estacion=sc.nextInt();
       
        
        switch (estacion) {
            case 1:
                System.out.println("Es Primavera");
                break;
            case 2:
                System.out.println("Es Verano");
                break;
            case 3:
                System.out.println("Es Otono");
                break;
            case 4:
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estacion valida");
        }
        
        
    }
    
}
