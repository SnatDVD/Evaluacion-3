
package com.iescomercio.tema7.cuentas_bancarias;

public class CuentaAhorro extends CuentaCorriente{
    
    private double interes;

    public CuentaAhorro(double interes, Titular titular, NumeroDeCuenta numCuenta, double saldo) {
        super(titular, numCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(double interes, Titular titular, NumeroDeCuenta numCuenta) {
        super(titular, numCuenta);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, NumeroDeCuenta numCuenta) {
        super(titular, numCuenta);
        this.interes = 2.5;
    }

    public double getInteres() {
        return interes;
    }
    
    public void calcularInteres(){
        ingresar(saldo * (interes / 100));
    }
}
