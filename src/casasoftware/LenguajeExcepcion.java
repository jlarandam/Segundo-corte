/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casasoftware;

/**
 *
 * @author Estudiante
 */
public class LenguajeExcepcion extends Exception{
    
    public LenguajeExcepcion(){
       super("El lenguaje debe ser diferente a GO");
    }
}
