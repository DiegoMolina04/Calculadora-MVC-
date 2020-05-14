/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import com.controlador.controlador;
import com.modelo.modelo;
import com.vista.vista;

public class Operaciones {

    public static void main(String[] args) {
        
        modelo objModelo = new modelo();
        vista objVista = new vista();
        
        controlador controlador = new controlador (objVista, objModelo);
        objVista.setVisible(true);
    }
    
}
