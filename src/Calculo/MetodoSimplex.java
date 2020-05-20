/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seventh
 */
public class MetodoSimplex {
    private ArrayList<DefaultTableModel> tablas;
    private ArrayList<String[][]> datosTablas;
    private String[] nombColumTabla;
    private String[][] datosTabla;
    private int nVariables;
    private int nRestric;
    public DefaultTableModel tablaInicial;
    
    public MetodoSimplex(String[] nombColumTabla,String[][] datosTabla,DefaultTableModel tablaInicial,int nVariables,int nRestric) {
        this.tablas=new ArrayList<>();
        this.datosTablas=new ArrayList<>();
        this.nombColumTabla=nombColumTabla;
        this.tablaInicial=tablaInicial;
        this.tablas.add(tablaInicial);
        this.nVariables=nVariables;
        this.nRestric=nRestric;
        this.datosTabla=datosTabla;
        this.datosTablas.add(datosTabla);
        
        for (String[] strings : datosTabla) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.print("\n");
        }
        
    }
    
    private int indiceColMin(String tabla[][]){//sacar el menos negativo de z
        int indice=1;
        float aux=-10000;
        for (int j = 1; j <= nVariables; j++) {
            if(Float.parseFloat(tabla[0][j])<0 && Float.parseFloat(tabla[0][j])>aux ){
                aux=Float.parseFloat(tabla[0][j]);
                indice=j;
            }
        }
    return indice;
    }
    
    private int indiceColMax(String tabla[][]){//sacar el mas negativo de z
        int indice=1;
        float aux=Float.parseFloat(tabla[0][1]);
        for (int j = 1; j <= nVariables; j++) {
            if(Float.parseFloat(tabla[0][j])<0 && Float.parseFloat(tabla[0][j])<aux){
                aux=Float.parseFloat(tabla[0][j]);
                indice=j;
            }
        }
    return indice;
    }
    
    private int indiceFil(int indiceColPivote){
    int indiceFil=0;
    float aux=Float.parseFloat(datosTabla[1][datosTabla[0].length-1])/Float.parseFloat(datosTabla[1][indiceColPivote]);
    float temp=0;
        for (int i = 1; i <= nRestric; i++) {
            temp=Float.parseFloat(datosTabla[i][datosTabla[0].length-1])/Float.parseFloat(datosTabla[i][indiceColPivote]);
            
            if(temp>0 && temp<=aux){
                indiceFil=i;
                aux=temp;
                
            }
            
        }
            
    return indiceFil;
    }
    
    private void ecPivote(int indiceColPivote,int indiceFilPivote){
        float elmPivote=Float.parseFloat(this.datosTabla[indiceFilPivote][indiceColPivote]);
        for (int i = 1; i <= this.nRestric+this.nVariables+1; i++) {
            System.out.println(datosTabla[indiceFilPivote][i]+" / "+elmPivote+" = ");
            this.datosTabla[indiceFilPivote][i] =String.valueOf(Float.parseFloat(this.datosTabla[indiceFilPivote][i])
                        /elmPivote );
            this.datosTabla[indiceFilPivote][0]=this.nombColumTabla[indiceColPivote];
            System.out.println(datosTabla[indiceFilPivote][i]);
        }
    }
    
    private float[] ecParaSumar(int indiceColPivote,int indiceFilPivote,float elemntoAHacerCero){
    float [] ecSum=new float[datosTabla[0].length];
        for (int i = 1; i  < datosTabla[0].length ; i++) {
            ecSum[i]=Float.parseFloat(datosTabla[indiceFilPivote][i])*elemntoAHacerCero;
        }
    return ecSum;
    }
    
    private void reduccionGaus(int indiceColPivote,int indiceFilPivote){
        for (int i = 0; i <= this.nRestric; i++) {
            if(i!=indiceFilPivote){
                float[] ecSum=ecParaSumar(indiceColPivote, indiceFilPivote, Float.parseFloat(datosTabla[i][indiceColPivote]));
                for (int j = 1; j < this.datosTabla[0].length; j++) {
                    datosTabla[i][j]=String.valueOf( Float.parseFloat(datosTabla[i][j])-ecSum[j] );
                }
            }
        }
    }
    
    public void Minimizacion(){
        int indiceColPiv;
        int indiceFilPiv;
        int seguir=0;
       do{
            for (int i = 1; i <= nVariables; i++) {
                if(Float.parseFloat(datosTabla[0][i])==0){seguir++;}
            }
            indiceColPiv=this.indiceColMin(this.datosTabla);
            indiceFilPiv=this.indiceFil(indiceColPiv);
            this.ecPivote(indiceColPiv, indiceFilPiv);
            this.reduccionGaus(indiceColPiv, indiceFilPiv);
            this.datosTablas.add(datosTabla);
            this.tablas.add(this.crearModelo(nombColumTabla, datosTabla));   
        } while(seguir<nVariables-1);
        
    }
    public void Maximizacion(){
        int indiceColPiv;
        int indiceFilPiv;
        int seguir=0;
        while(seguir<nVariables-1){
            for (int i = 1; i <= nVariables; i++) {
                if(Float.parseFloat(datosTabla[0][i])==0){seguir++;}
            }
            indiceColPiv=this.indiceColMax(this.datosTabla);
            indiceFilPiv=this.indiceFil(indiceColPiv);
            this.ecPivote(indiceColPiv, indiceFilPiv);
            this.reduccionGaus(indiceColPiv, indiceFilPiv);
            this.datosTablas.add(datosTabla);
            this.tablas.add(this.crearModelo(nombColumTabla, datosTabla));
            
        }
        
    }
    
    public void pruebaMin(){
        System.out.println("nVariabl: "+nVariables+"  NRest: "+nRestric);
        System.out.println("ColPiv: "+this.indiceColMin(datosTabla));
        System.out.println("filaPiv: "+indiceFil(this.indiceColMin(datosTabla)));
    }
    public void pruebaMax(){
         System.out.println("nVariabl: "+nVariables+"  NRest: "+nRestric);
        System.out.println("ColPiv: "+this.indiceColMax(datosTabla));
        System.out.println("filaPiv: "+indiceFil(this.indiceColMax(datosTabla)));
   
    }

    public ArrayList<DefaultTableModel> getTablas() {
        return tablas;
    }

    public ArrayList<String[][]> getDatosTablas() {
        return datosTablas;
    }

    public String[] getNombColumTabla() {
        return nombColumTabla;
    }

    public String[][] getDatosTabla() {
        return datosTabla;
    }

    public int getnVariables() {
        return nVariables;
    }

    public int getnRestric() {
        return nRestric;
    }
    
     public DefaultTableModel crearModelo(String[] nomColums,String[][] datos){
        DefaultTableModel modelo= new DefaultTableModel(datos, nomColums);
        return modelo;
    }

    public DefaultTableModel getTablaInicial() {
        return tablaInicial;
    }
 
     
}
