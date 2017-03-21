
package com.iescomercio.tema7.cuentas_bancarias;

public class CuentaCorriente {
    
    protected Titular titular;
    protected NumeroDeCuenta numCuenta;
    protected double saldo;

    public CuentaCorriente(Titular titular, NumeroDeCuenta numCuenta, double saldo) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Titular titular, NumeroDeCuenta numCuenta) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        saldo = 15.3;
    }

    public Titular getTitular() {
        return titular;
    }

    public NumeroDeCuenta getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar(double cantidad){
        setSaldo(getSaldo() + cantidad);
    }
    
    public boolean reintegro(double cantidad){
        if(cantidad < getSaldo()){
            setSaldo(getSaldo() - cantidad);
            return true;
        }
        return false;
    }
    
    public void mostrarDatos(){
        System.out.println(numCuenta.toString());
        System.out.println("Saldo = " + saldo);
    }
    
    @Override
    public boolean equals(Object obj){
        CuentaCorriente cuenta = (CuentaCorriente)obj;
        return (this.getNumCuenta().equals(cuenta.getNumCuenta()));
    }
    
}
