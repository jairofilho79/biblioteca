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
public class Revista {
        private int codigo=0;
        private String título;
        private String editora;
        private Artigo artigo;
        private Boolean status2 = false;

    public Revista(String título, String editora) {
        this.título = título;
        this.editora = editora;
    }
    public Revista() {
        this(" "," ");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }
        
        
        
        public static void main(String[] args){
            
        }
}
