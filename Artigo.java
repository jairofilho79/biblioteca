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
public class Artigo {
    private String título;
    Autor[] autor = new Autor[3];
    

    public Artigo(String título) {
        this.título = título;
        for (int i = 0; i < autor.length; i++) {
            autor[i] = new Autor();            
        }
    }
    public Artigo() {
        this(" ");
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }
    
    
    
}
