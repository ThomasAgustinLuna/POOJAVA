/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para crear el 
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método 
para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package entidades;

public class Rectangulo {

    private int base;
    private int altura;
    private double superficie;
    private double perimetro;
    

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }
    public double perim(int base, int altura){
        perimetro=base*2+altura*2;
        
        return perimetro;
    }
    public double superfi(int base, int altura){
        superficie=(base+altura)*2;
        
        return superficie;
    }
    
    public void mostrar(int base,int altura){
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {

                if (i == 1 || i == altura || j == 1 || j == base) { //
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }
            }
            System.out.println("");
        }
    }

   
    
    
    
    
}
