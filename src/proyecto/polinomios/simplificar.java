package proyecto.polinomios;

import java.util.ArrayList;
import java.util.Objects;

public class simplificar {
     public ArrayList<Monomio> simplificar(ArrayList<Monomio> as) {
        ArrayList<Monomio> ad = new ArrayList<>();
        ad.addAll(as);
        ArrayList<Monomio> resultado = new ArrayList<>();
        int i;
        int j = 0;
        int flag;
        while (j < ad.size()) {
            i = 0;
            flag = 1;
            while (flag == 1 && i < resultado.size()) {
                if (Objects.equals(resultado.get(i).getExponente(), ad.get(j).getExponente())) {
                    flag = 0;
                } else {
                    flag = 1;
                }
                i++;
            }
            if (flag == 1) {
                resultado.add(ad.get(j));
            } else {
                int h=i-1;
                Double a1=resultado.get(h).getCoeficiente();
                Double a2=ad.get(j).getCoeficiente();
                Double a=a1+a2;
                Double b=as.get(j).getExponente();
                Monomio aux=new Monomio(a,b);
                resultado.remove(i-1);
                resultado.add(i-1,aux);
            }
            j++;
        }
        return resultado;

    }
    
}
