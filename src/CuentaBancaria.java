public abstract class CuentaBancaria {

    private String numeroCuenta;
    protected String titular;
    protected double saldo;
    private String fechaApertura;
    protected String estado;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo, String fechaApertura) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.estado = "Activa";
    }

    protected void depositar(double monto){
        if (estado=="Activa"){
            saldo+=monto;
        }else{
            System.out.println("cuenta desactivada");
        }
    }

    protected abstract void retirar(double monto);

    protected double getSaldo(){
        if (estado=="Activa"){
            return saldo;
        }else{
            System.out.println("cuenta desactivada");
            return 0;
        }

    }

    protected void bloquear(){
        estado="Bloqueada";
    }

    protected void activar(){
        estado="Activada";
    }

    protected void getInfo(){
        System.out.println("NUMERO: "+numeroCuenta);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
        System.out.println("estado: "+estado);
    }

    protected abstract void comision(double comision);

}