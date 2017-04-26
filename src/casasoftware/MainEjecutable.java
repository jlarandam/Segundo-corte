/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casasoftware;

import java.util.logging.Level;
import java.util.logging.Logger;
import dao.Archivo;
import dao.CasaSoftwareDB;

/**
 *
 * @author Estudiante
 */
public class MainEjecutable {
    public static void main(String[] args) {
        CasaSoftware casa = new CasaSoftware();
        
        Contrato c2 = null;
        Contrato c3 = null;
        Contrato c4 = null;
        try {
            Contrato c1 = new Consultor(1, "Ing456789");
            cs.adicionarContrato(c1);
            c2 = new Admon(2, "F123456789", 1000000);
            cs.adicionarContrato(c2);
            c3 = new Programador(3, "I123456789", 2000000, "Java");
            c4 = new Lider(4, "v123456789", 20000000, "c");
            c4.adicionarProgramador(c3);
        } catch (NombreExcepcion ex) {
            ex.printStackTrace();
        } catch (SalarioExcepcion ex) {
            ex.printStackTrace();
        } catch (LenguajeExcepcion ex){
            ex.printStackTrace();
        }
    }
}
