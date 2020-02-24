package proyecto.polinomios;

public class Monomio {
    private Double exponente;
    private Double coeficiente;

    public Monomio(Double coeficiente, Double exponente) {
        this.exponente = exponente;
        this.coeficiente = coeficiente;
    }

    
    
    public Double getExponente() {
        return exponente;
    }

    public void setExponente(Double exponente) {
        this.exponente = exponente;
    }

    public Double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Double coeficiente) {
        this.coeficiente = coeficiente;
    }

    @Override
    public String toString() {
        String output=String.format("%+.0fx^%.0f",coeficiente,exponente);
        return output;

//coeficiente + "x^"+exponente;
    }
    
    
    
}
