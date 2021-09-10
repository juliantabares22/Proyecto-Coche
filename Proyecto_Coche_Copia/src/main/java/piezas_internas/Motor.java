package piezas_internas;

public class Motor {

    private int velocidad_de_rotacion_del_motor = 0;
    private final int capacidad_maxima_en_mililitros_de_gasolina_para_un_piston = 30;
    public Motor (int mililitros_de_gasolina){
        velocidad_de_rotacion_del_motor = un_piston (mililitros_de_gasolina, 2);
        
    }

    private int un_piston(int mililitros_de_gasolina, int mililitros_de_oxigeno) {
        int fuerza_del_piston = 0;

        if (mililitros_de_gasolina < capacidad_maxima_en_mililitros_de_gasolina_para_un_piston) {
            fuerza_del_piston = mililitros_de_gasolina * mililitros_de_oxigeno;
        } else {
            System.out.println("El piston ha sido demasiado cargado de gasolina y ha explotado");

        }
        return fuerza_del_piston;
    }
        public int get_velocidad_de_rotacion_del_motor() {
            return velocidad_de_rotacion_del_motor;
        }
    }
        
        
        


