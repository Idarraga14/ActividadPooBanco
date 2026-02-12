//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        CuentaAhorros maria = new CuentaAhorros(
                "001",
                "Maria",
                500,
                "12/02/2026"
        );

        maria.getInfo();

        System.out.println("\nIntentando retirar 450000...\n");

        maria.retirar(450);

        System.out.println("\nEstado final de la cuenta:\n");
        maria.getInfo();

        CuentaCorriente juan = new CuentaCorriente(
                "002",
                "Juan",
                50,
                "12/02/2026"
        );

        juan.getInfo();

        System.out.println("\nJuan intenta retirar 400000...\n");

        juan.retirar(400);

        System.out.println("\nEstado final de la cuenta:\n");
        juan.getInfo();

        CuentaNomina pedro = new CuentaNomina(
                "003",
                "Pedro",
                100000,
                "12/02/2026"
        );

        System.out.println("Mes 1: recibe salario");
        pedro.registrarSalario(true);

        System.out.println("Mes 2: no recibe salario");
        pedro.registrarSalario(false);

        System.out.println("Mes 3: no recibe salario");
        pedro.registrarSalario(false);

        System.out.println("Mes 4: no recibe salario");
        pedro.registrarSalario(false);

        pedro.getInfo();
    }



}
