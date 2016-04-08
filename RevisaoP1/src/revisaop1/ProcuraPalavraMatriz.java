/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaop1;

import java.util.ArrayList;

/**
2. Desenvolva e apresente um algoritmo que receba uma matriz de caracteres e um
texto. O programa deve encontrar a posição em que o texto aparece dentro da
matriz. O texto pode aparecer na vertical ou horizontal. Apresente a classe de
complexidade em notação O do seu algoritmo.
 */
public class ProcuraPalavraMatriz {
    
    public void getPalavraMatriz(char [][] lista, String texto, int indexL, int indexC, int indexP, ArrayList<String> aux){
        //ArrayList<String> aux = new ArrayList(); 
        //Se eu encontrar a primeira letra
        if (lista[indexL][indexC] == texto.charAt(indexP)){
            //se eu encontrar a ultima letra
            if(texto.length()-1 == indexP){
                aux.add(indexL + "." + indexC);
                //return ; //se der return acha apenas a primeira ocorrencia
            }
            else{
                getPalavraMatriz(lista, texto, indexL, indexC+1, indexP+1, aux);
                
            }
            //procura horizontal
             
            //procura vertical
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
