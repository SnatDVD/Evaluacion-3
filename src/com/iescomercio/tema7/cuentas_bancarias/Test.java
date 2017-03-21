
package com.iescomercio.tema7.cuentas_bancarias;

public class Test {

    public static void main(String[] args) {
        
        Titular t1 = new Titular("Paco", "Fernandez", 38);
        NumeroDeCuenta n1;
        n1 = new NumeroDeCuenta(1564, 4857, 13, 58476);
        
        Titular t2 = new Titular("Manuel", "Do While", 25);
        NumeroDeCuenta n2;
        n2 = new NumeroDeCuenta(1564, 4857, 13, 53126);
        
        CuentaCorriente cc1 = new CuentaCorriente(t2, n2, 1000);
        CuentaAhorro ca1 = new CuentaAhorro(10, t1, n1, 500);
        
        ca1.mostrarDatos();
        ca1.calcularInteres();
        ca1.reintegro(100);
        ca1.mostrarDatos();
        
        System.out.println(ca1.equals(cc1));
       
        cc1.mostrarDatos();
        cc1.ingresar(13574);
        cc1.mostrarDatos();
    }
    
}
