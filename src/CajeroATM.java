import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class CajeroATM {
    int clave, maxTransac, maxIntentos;
    double balance;
    Scanner sca = new Scanner(System.in);

    public CajeroATM() {
        clave = 1234;
        maxTransac = 0;
        balance = 10000.00;
        System.out.println("===============================" +
                            "\nBIENVENIDO AL BANCO PERUCITO" +
                            "\n===============================");
        System.out.println("Por favor ingrese su clave de acceso: ");
        int miClave = sca.nextInt();

        while (clave != miClave){
            maxIntentos++;
            System.out.println("Contraseña incorrecta, intente de nuevo...");
            miClave = sca.nextInt();
            if (maxIntentos == 2){
                System.out.println("Cantidad de intentos agotada" + "\n" +
                                    "Su usuario ha sido bloqueado" + "\n" +
                                    "Póngase en contacto con Soporte");
                System.exit(0);
            }
        }
    }

    public void menuOpciones(){
        int opciones, controlMenu = 0;

        while (maxTransac <= 2){
            System.out.println("Por favor elija una accion" + "\n" +
                                "1. Comsulta de Balance" + "\n" +
                                "2. Retiro de Efectivo" + "\n" +
                                "3. Deposito a Cuenta" + "\n" +
                                "4. Salir");
            opciones = sca.nextInt();

            switch (opciones){
                case 1:
                    consultar();
                    break;
                case 2:
                    retirar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    salir();
                    break;
                default:
                    System.out.println("Opcion no validad");
                    controlMenu++;
                    if (controlMenu == 3){
                        System.out.println("Cantidad de intentos agotada" + "\n" +
                                            "Su usuario ha sido bloqueado" + "\n" +
                                            "Póngase en contacto con Soporte");
                        System.exit(0);
                    }
            }
        }
        System.out.println("Ha excedido el max de transacciones permitidas");
        salir();
    }

    public void transacacciones(){
        int valor;
        System.out.println("Desea realizar otra transaccion?" + "\n" +
                            "1. SI" + "\n" +
                            "2. NO");
        valor = sca.nextInt();

        if (valor == 1) menuOpciones();
        else salir();
    }

    public void consultar(){
        System.out.println("Balance actual: " + balance);
        maxTransac++;
        transacacciones();
    }

    public void retirar(){
        System.out.println("Indique la cantidad a retirar: ");
        int retiro = sca.nextInt();

        while (retiro > balance){
            System.out.println("Balance  Insuficiente");
            System.out.println("Intente de nuevo...");
            retiro = sca.nextInt();
        }

        balance = balance - retiro;
        consultar();
        maxTransac++;
        transacacciones();
    }

    public void depositar(){
        System.out.println("Indique la cantidad a depositar: ");
        int deposito = sca.nextInt();

        balance = balance + deposito;

        consultar();
        maxTransac++;
        transacacciones();
    }

    public void salir(){
        System.out.println("Gracias por usar nuestros servicios");
        System.exit(0);
    }

    public static void main(String[] args) {
        CajeroATM actuar = new CajeroATM();
        actuar.menuOpciones();
    }
    //11-03
}
