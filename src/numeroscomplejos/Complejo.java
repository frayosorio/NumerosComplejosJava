package numeroscomplejos;

public class Complejo {

    private double real;
    private double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginario(double imaginario) {
        this.real = imaginario;
    }

    public Complejo sumar(Complejo c) {
        return new Complejo(this.real + c.real, this.imaginario + c.imaginario);
    }

    @Override
    public String toString() {
        return String.valueOf(real) + (imaginario >= 0 ? " + " : " ") + String.valueOf(imaginario) + " i";
    }

    @Override
    public boolean equals(Object objComplejo) {
        if (objComplejo == null) {
            return false;
        }

        //ambas clases de objetos deben ser iguales
        if (!this.getClass().equals(objComplejo.getClass())) {
            return false;
        }

        Complejo c = (Complejo) objComplejo;

        //verificar que los 2 reales sean iguales
        if (this.real != c.real) {
            return false;
        }
        
        //verificar que los 2 imaginarios sean iguales
        if (this.imaginario != c.imaginario) {
            return false;
        }

        return true;
    }

}
