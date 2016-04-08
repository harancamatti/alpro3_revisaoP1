package revisaop1;
public class ListaInteiros {
    int [] listaInteiros;
    int aux=0;
    
    
    public int getMaiorNumero(int [] listaInteiros, int index){
        if (index == listaInteiros.length-1){
            return listaInteiros[aux];
        }
        else{
            if (listaInteiros[index] > listaInteiros[aux]){
                aux = index;
                return getMaiorNumero(listaInteiros, index+1);
            }
            else{
                return getMaiorNumero(listaInteiros, index +1);
            }
        }
    }
}
