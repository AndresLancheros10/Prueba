package calculadoraa;

import java.util.Scanner;

public class Calculadoraa {
//Atributos Encapsulados 
    private int Suma;
    private int Resta;
    private int Multiplicacion;
    private double Division;
    private int numeroX;
    private int numeroY;
    
    
    public Calculadoraa() {}
    
    //Constructores
    public Calculadoraa(int Suma, int Resta, int Multiplicacion,int numeroX, int numeroY, double Division ) {
        this.Suma = Suma;
        this.Resta = Resta;
        this.Multiplicacion = Multiplicacion;
        this.Division = Division;
        this.numeroX = numeroX;
        this.numeroY = numeroY;
       
    }

    public int getNumeroX() {
        return numeroX;
    }

    public void setNumeroX(int numeroX) {
        this.numeroX = numeroX;
    }

    public int getNumeroY() {
        return numeroY;
    }

    public void setNumeroY(int numeroY) {
        this.numeroY = numeroY;
    }
//Setter And Getter
    public int getSuma() {
        return Suma;
    }

    public void setSuma(int Suma) {
        this.Suma = Suma;
    }

    public int getResta() {
        return Resta;
    }

    public void setResta(int Resta) {
        this.Resta = Resta;
    }

    public int getMultiplicacion() {
        return Multiplicacion;
    }

    public void setMultiplicacion(int Multiplicacion) {
        this.Multiplicacion = Multiplicacion;
    }

    public double getDivision() {
        return Division;
    }

    public void setDivision(double Division) {
        this.Division = Division;
    }

    }
    
        
        
        
        
    
    

