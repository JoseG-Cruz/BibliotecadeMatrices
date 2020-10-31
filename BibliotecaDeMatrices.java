/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecadematrices;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author baru
 */
public class BibliotecaDeMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int menuB;
         
        
        String inicio = 
                " 1: Espiral/Caracol\n"+
                " 2: Mostrar elementos comunes de dos matrices\n"+
                " 3: Cuadro Magico\n"+
                " 4: Imprimir el contenido de la matriz en forma de espiral\n"+
                " 5: Matriz Cuadratica\n"+
                " 6: Suma Matriz\n"+
                " 7: Resta Matriz\n"+
                " 8: Multiplicar Matriz\n"+
                " 9: Suma de columnas y filas\n"+
                "10: Matriz simetrica o no\n"+
                "11: Matriz Inversa\n"+
                "12: Dada la matriz intercarbiar la primer columna con la ultima";
        
        menuB =  Integer.parseInt(JOptionPane.showInputDialog(inicio));
        
        switch(menuB){
            
            case 1:
                Procedimientos espiral = new  Procedimientos();
                espiral.main(args);
                
                break;
            case 2:
                Procedimientos comun = new  Procedimientos();
                comun.elementoComun();
                
                break;
            case 3:
                Procedimientos magico = new  Procedimientos();
                magico.cuadroMagico(args);
                
                break;
            case 4:
                Procedimientos formaE = new  Procedimientos();
                formaE.main(args);
                
                break;
            case 5:
                Procedimientos adjunta = new  Procedimientos();
                adjunta.datosMA(menuB);
                
                break;
            case 6:
                Procedimientos suma = new  Procedimientos();
                suma.llenarMatrices(menuB);
                
                break;
            case 7:
                Procedimientos resta = new  Procedimientos();
                resta.llenarMatrices(menuB);
                
                break;
            case 8:
                 Procedimientos multi = new  Procedimientos();
                 multi.llenarMatrices(menuB);
                 
                 break;
            case 9:
                Procedimientos sumaFC = new  Procedimientos();
                sumaFC.sumaCF(menuB);
            case 10:
                Procedimientos simetrica = new  Procedimientos();
                simetrica.MSimetrica(args);
                
                break;
            case 11:
                Procedimientos inversa = new  Procedimientos();
                inversa.MInversa(menuB);
                
                break;
            case 12:
                Procedimientos intercambiar = new  Procedimientos();
                intercambiar.intercambiar(menuB);
                
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
        }
    }
    
}

