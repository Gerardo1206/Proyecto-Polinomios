package proyecto.polinomios;

import java.util.ArrayList;

public class Polinomio {

    private ArrayList<Monomio> monomio;

    public Polinomio(Polinomio polinomio) {
        this.monomio = polinomio.monomio;
    }

    public Polinomio() {
    }

    public ArrayList<Monomio> sumarPolinomios(Polinomio polinomio0, Polinomio polinomio2) {
        Polinomio pp1 = new Polinomio(polinomio0);
        Polinomio pp2 = new Polinomio(polinomio2);
        ArrayList<Monomio> resultado = new ArrayList<>();
        resultado.addAll(pp1.getMonomio());
        resultado.addAll(pp2.getMonomio());
        simplificar s1=new simplificar();
        return s1.simplificar(resultado);
    }

    public ArrayList<Monomio> limpiar(ArrayList<Monomio> p1) {
        ArrayList<Monomio> resultado = new ArrayList<>();
        resultado = p1;
        int i = 0;
        while (i < p1.size()) {
            if (p1.get(i).getCoeficiente() == 0) {
                p1.remove(i);
            } else {
                i++;
            }
        }
        return resultado;
    }

    public ArrayList<Monomio> restar(Polinomio p1, Polinomio p2) {
        ArrayList<Monomio> resultado = new ArrayList<>();
        int i = 0;
        while (i < p1.getMonomio().size()) {
            resultado.add(p1.getMonomio().get(i));
            i++;
        }
        i = 0;
        while (i < p2.getMonomio().size()) {
            Double a = p2.getMonomio().get(i).getCoeficiente() * -1;
            Monomio p3 = new Monomio(a, p2.getMonomio().get(i).getExponente());
            resultado.add(p3);
            i++;
        }
        resultado = (resultado);
        resultado = limpiar(resultado);
        simplificar s1=new simplificar();
        return s1.simplificar(resultado);
    }

    public ArrayList<Monomio> multiplicar(Polinomio p1, Polinomio p2) {
    ArrayList<Monomio> resultado = new ArrayList<>();
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < p1.getMonomio().size()) {
        j = 0;
        while (j < p2.getMonomio().size()) {
            Double a=p1.getMonomio().get(i).getCoeficiente()*p2.getMonomio().get(j).getCoeficiente();
            Double b=p2.getMonomio().get(i).getExponente()*p2.getMonomio().get(j).getExponente();
            Monomio e=new Monomio(a,b); 
            resultado.add(e);
            k++;
            j++;
        }
        i++;
    }
        simplificar s1=new simplificar();
        return s1.simplificar(resultado);
}
    
    public ArrayList<Monomio> dividir(Polinomio p1, Polinomio p2) {
        ArrayList<Monomio> regresar=new ArrayList<>();
        ArrayList<Monomio> arestar=new ArrayList<>();;
        return p1.monomio;
    }

    
    public ArrayList<Monomio> getMonomio() {
        return this.monomio;
    }

    public void setMonomio(ArrayList<Monomio> monomio) {
        this.monomio = monomio;
    }

    @Override
    public String toString() {
        return "Polinomio:" + monomio.toString();
    }

}
