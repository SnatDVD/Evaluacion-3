
package com.iescomercio.tema7.recursividad;

public class Main {
    
    public static void main(String[] args) {
        
        //Recursivo.darVueltaRecursivo("1234");
        
        //Recursivo.darVueltaIterativo("1234");
        
        //System.out.println(Recursivo.sumaRecursivo("1234"));
        
        //System.out.println(Recursivo.sumaIterativo("1234"));
        
        //Recursivo.toBinaryRecursivo(19);
        
        //Recursivo.toBinaryIterativo(1);
        
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 0;
        nums[2] = -10;
        nums[3] = 1;
        nums[4] = 9;
        
        //System.out.println(Recursivo.sumaArrayRecursivo(nums));
        
        //System.out.println(Recursivo.sumaArrayIterativo(nums));
        
        System.out.println(Recursivo.maxValorArray(nums));
    }
}
