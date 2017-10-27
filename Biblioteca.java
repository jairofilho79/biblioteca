/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author 201604940016
 */
public class Biblioteca {
    Revista[] revista = new Revista[10];
    Usuario[] user    = new Usuario[10];
    Emprestimo[] reg = new Emprestimo[10];

    public Biblioteca() {
        for (int i = 0; i < revista.length; i++) {
            revista[i] = new Revista();
            reg[i] = new Emprestimo(); 
            user[i] = new Usuario();
        }
    }
    public void emprestar(Usuario[] user, Revista[] revista){
        
    }
}
