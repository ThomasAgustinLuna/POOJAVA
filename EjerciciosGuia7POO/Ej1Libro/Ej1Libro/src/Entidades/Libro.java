
package Entidades;


public class Libro {
    public String titulo;
    public String Autor;
    public int numPag;
    public int iSBN;//código Internacional normalizado para libros

    public Libro() {
    }

    public Libro(String titulo, String Autor, int numPag, int iSBN) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.numPag = numPag;
        this.iSBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public int getiSBN() {
        return iSBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + titulo + ", Autor=" + Autor + ", numPag=" + numPag + ", iSBN=" + iSBN + '}';
    }
    
    
    
}
