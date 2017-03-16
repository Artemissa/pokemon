
package pokemon;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Arte
 */
public class Pokemon {
        String nombre;
        String tipo;
        double peso;
        double altura;
        int vida;
        int puntosCombate;
        String apodo;
        String ruta;
        
        public Pokemon() {
        this.nombre = "";
        this.tipo = "";
        this.peso = 0.0;
        this.altura = 0.0;
        this.vida = 0;
        this.puntosCombate = 0;
        this.apodo = "";
        this.ruta = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getVida() {
        return vida;
    }

    public int getPuntosCombate() {
        return puntosCombate;
    }

    public String getApodo() {
        return apodo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setPuntosCombate(int puntosCombate) {
        this.puntosCombate = puntosCombate;
    }

    public void setApodo(String alias) {
        this.apodo = apodo;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
        
    
    
    public static void main(String[] args) {
      
      
    }
    
}
