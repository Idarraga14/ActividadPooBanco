public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String numeroCuenta, String titular, double saldo, String fechaApertura) {
        super(numeroCuenta, titular, saldo, fechaApertura);
    }

    @Override
    public void retirar(double monto) {
        if (estado.equals("Activa") && saldo+500 >= monto) {
            double verificar = saldo-monto;
            if(verificar>-500){
                saldo-=monto;
            }else{
                System.out.println("El sobregiro no debe ser superior a 500");
            }
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
    @Override
    public void comision(double comision) {
        saldo-=15;
    }

}
