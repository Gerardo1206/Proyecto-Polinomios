package proyecto.polinomios;

import java.io.IOException;
import java.util.ArrayList;

public class ProyectoPolinomios {
    public static void main(String[] args) throws IOException {
        Polinomio p1=new Polinomio();
        Polinomio p2=new Polinomio();
        Polinomio p4=new Polinomio();
        Polinomio p5=new Polinomio();       
        Monomio m1=new Monomio(5.0,2.0);
        Monomio m2=new Monomio(3.0,2.0);
        Monomio m3=new Monomio(8.0,2.0);
        Monomio m4=new Monomio(2.0,2.0);
        ArrayList<Monomio> alm1=new ArrayList<>();
        ArrayList<Monomio> alm2=new ArrayList<>();
        alm1.add(m1);
        alm1.add(m2);
        alm2.add(m3);
        alm2.add(m4);
        p1.setMonomio(alm1);
        p2.setMonomio(alm2);
        Polinomio p3=new Polinomio();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        ArrayList<Monomio> alm3=p3.sumarPolinomios(p1, p2);
        p3.setMonomio(alm3);   
        System.out.println(p3.toString());
        alm3=p3.restar(p1, p2);
        p3.setMonomio(alm3);
        System.out.println(p3.toString());
        alm3=p3.multiplicar(p1, p2);
        p3.setMonomio(alm3);
        System.out.println(p3.toString());
        
    }
    
}



















