package panel_del_conductor;

import piezas_internas.Motor;

public class arranque {
    public static void main (String args[]){
        Motor mi_motor = new Motor (20);
        int velocidad_coche = mi_motor.get_velocidad_de_rotacion_del_motor();
        System.out.println("La velocidad del coche es: " + velocidad_coche + "km/h");
        
        
    }

}
