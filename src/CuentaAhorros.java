public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(String numeroCuenta, String titular, double saldo, String fechaApertura) {
        super(numeroCuenta, titular, saldo, fechaApertura);
    }

    @Override
    public void retirar(double monto) {
        if (estado.equals("Activa") && saldo >= monto) {
            double verificar = saldo-monto;
            if(verificar<100){
                System.out.println("debe mantener un minimo de 100");
            }else{
                saldo-=monto;
            }
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
    @Override
    public void comision(double comision) {
        //anual
        saldo-=saldo*0.036;
    }

}