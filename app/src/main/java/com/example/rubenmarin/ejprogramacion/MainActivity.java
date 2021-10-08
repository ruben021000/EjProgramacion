package com.example.rubenmarin.ejprogramacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.ArraySet;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Programa nuevo = new Programa();



        main();
        listaProg = creaProgramacion(prog,tipo);
        cuenta();
        masLargo();
    }

    Set<String> tiposPrograma = new ArraySet<>();
    List<Integer> prog = new ArrayList<>();
    List<String> tipo = new ArrayList<>();
    List<Programa> listaProg;

    static int PROGRAMACION[]={6, 10, 12, 15, 17, 20, 22, 24 };
    static String TIPO[] = {"NOTICIAS", "MAGAZINE", "MUSICA", "NOTICIAS",
            "MAGAZINE", "NOTICIAS", "MAGAZINE", "MUSICA"};

    Map<String,Integer> contador = new HashMap<>();
    Map<String,Integer> media = new HashMap<>();

    public void main() {



        for(int i = 0; i<PROGRAMACION.length; i++){
            prog.add(PROGRAMACION[i]);

        }

        for(int i = 0; i<TIPO.length; i++){
            tipo.add(TIPO[i]);

        }

        for(int i = 0; i<tipo.size(); i++){
            if(!tiposPrograma.contains(tipo.get(i))){
                tiposPrograma.add(tipo.get(i));
            }

        }

        Log.d("Programa", tiposPrograma.toString());

    }//main

    public List<Programa> creaProgramacion(List<Integer> prog, List<String> tipo ){
        List<Programa> Programas = new ArrayList<>();
        int k=0;
        for(int i = 0; i<8; i++){
            int j = i+1;
            if(k==3){
                k=0;
            }
            if(j==8){
                j=0;
            }
                Programas.add(new Programa(prog.get(i),prog.get(j),tipo.get(k)));
                k++;

        }

        Log.d("Programa", Programas.toString());


        return Programas;


    }

    public void cuenta(){
        for(int i = 0; i<tiposPrograma.size();i++){
            contador.put(tiposPrograma.toArray()[i].toString(),0);
        }
        for(int i = 0; i<listaProg.size();i++){
            if(contador.containsKey(listaProg.get(i).getTipoProg())){
                contador.put(listaProg.get(i).getTipoProg(), contador.get(listaProg.get(i).getTipoProg())+1);
            }
        }

            Log.d("Programa",contador.toString());
    }

    public void masLargo(){
        int mayor=0;
        int calculo=0;
        int posMayor = 0;
        for(int i=0; i<listaProg.size();i++){
            calculo = listaProg.get(i).horaFin - listaProg.get(i).horaIni;

            if(calculo<0){
               calculo = calculo + 24;
            }
            if(calculo > mayor){
                mayor = calculo;
                posMayor = i;
            }
        }

        Log.d("Programa", listaProg.get(posMayor).toString());


    }


}//MAIN