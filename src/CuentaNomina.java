public class CuentaNomina extends CuentaBancaria {

    public CuentaNomina(String numeroCuenta, String titular, double saldo, String fechaApertura) {
        super(numeroCuenta, titular, saldo, fechaApertura);
    }

    @Override
    public void retirar(double monto) {
        if (estado.equals("Activa") && saldo >= monto) {
            saldo-=monto;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public void comision(double comision) {
        //si no recibe salario en 3 meses
        saldo-=8000;
    }

    private int mesesSinSalario = 0;

    public void registrarSalario(boolean recibioSalario) {
        if (recibioSalario) {
            mesesSinSalario = 0;
        } else {
            mesesSinSalario++;
        }

        if (mesesSinSalario >= 3) {
            saldo -= 24000;
            System.out.println("Se cobraron 24.000 por no recibir salario.");
            System.out.println("La cuenta debe convertirse en Cuenta Corriente.");
        }
    }
}


