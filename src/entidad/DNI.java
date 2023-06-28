
package entidad;


public class DNI {
    
    //atributos
    private char serie;
    private int numero;
    
    //constructor vacio
    public DNI() {
    }
    
    //constructor con parametros
    public DNI(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }
    
    //setters y getters
    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", numero=" + numero + '}';
    }    
}
