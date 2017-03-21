
package com.iescomercio.tema7.cuentas_bancarias;

public class NumeroDeCuenta {
    
    private int banco;
    private int sucursal;
    private int digitoDeControl;
    private long numeroDeCuenta;

    public NumeroDeCuenta(int banco, int sucursal, int digitoDeControl, long numeroDeCuenta) {
        setBanco(banco);
        setSucursal(sucursal);
        setDigitoDeControl(digitoDeControl);
        setNumeroDeCuenta(numeroDeCuenta);
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        if(banco > 9999){
            System.out.println("ERROR: el numero de banco no puede tener mas de 4 digitos");
            this.banco = -1;
        } else if (banco < 0){
            System.out.println("ERROR: el numero debe ser positivo");
            this.banco = -1;
        } else {
            this.banco = banco;
        }
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        if(sucursal > 9999){
            System.out.println("ERROR: el numero de sucursal no puede tener mas de 4 digitos");
            this.sucursal = -1;
        } else if (sucursal < 0){
            System.out.println("ERROR: el numero debe ser positivo");
            this.sucursal = -1;
        } else {
            this.sucursal = sucursal;
        }
    }

    public int getDigitoDeControl() {
        return digitoDeControl;
    }

    public void setDigitoDeControl(int digitoDeControl) {
        if(digitoDeControl > 99){
            System.out.println("ERROR: el numero de control no puede tener mas de 2 digitos");
            this.digitoDeControl = -1;
        } else if (digitoDeControl < 0){
            System.out.println("ERROR: el numero debe ser positivo");
            this.digitoDeControl = -1;
        } else {
            this.digitoDeControl = digitoDeControl;
        }
    }

    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(long numeroDeCuenta) {
        if(numeroDeCuenta > 999999999){
            System.out.println("ERROR: el numero de cuenta no puede tener mas de 10 digitos");
            this.numeroDeCuenta = -1;
        } else if (numeroDeCuenta < 0){
            System.out.println("ERROR: el numero debe ser positivo");
            this.numeroDeCuenta = -1;
        } else {
            this.numeroDeCuenta = numeroDeCuenta;
        }
    }

    @Override
    public String toString() {
        return "Banco = " + banco + ", Sucursal = " + sucursal + ", DigitoDeControl = " + digitoDeControl + ", NumeroDeCuenta = " + numeroDeCuenta;
    }
    
    @Override
    public boolean equals(Object obj) {
        NumeroDeCuenta num = (NumeroDeCuenta)obj;
        if(num.getBanco() == getBanco()){
            if(num.getDigitoDeControl() == getDigitoDeControl()){
                if(num.getNumeroDeCuenta() == getNumeroDeCuenta()){
                    if(num.getSucursal() == getSucursal()){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
}
