/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author PC-Volpi
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Fabio";
        String nome2 = "Fabio";
        String nome3 = new String("Fabio");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?n1:n2;
        System.out.println(r);
        System.out.println(res);
    }
    
}
