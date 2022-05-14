package Professor;

import java.util.ArrayList;
import java.util.Iterator;

public class Comissao{

    private  ArrayList <Membro> membros;
    private int numero_portaria;

    public Comissao() {
        membros = new ArrayList<>();
    }

    public  void  adicionarMembro( Membro  membro ) {
        membros.add(membro);
        System.out.println("Membro adicionado.");
    }

    public  void  imprimirMembros (){
        Iterator iterator = membros.iterator();
        Membro membro;
        while(iterator.hasNext()){
            membro = (Membro) iterator.next();
            System.out.println("\nNome do membro: "+membro.getNome()+".\nProntuário do membro: "+membro.getProntuário()+".");
            System.out.println("Método toString: "+membro.toString());
        }
    }

    public  void  verificarMembro (String nome){
        Iterator iterator = membros.iterator();
        boolean existe = false;
        while(iterator.hasNext()){
            Membro membro1 = (Membro) iterator.next();
            if(membro1.getNome() == nome){
                existe = true;
            }
        }
        if(existe == true){
            System.out.println(nome+" faz parte da comissão.");
        }else{
            System.out.println(nome+" não faz parte da comissão.");
        }
    }    

    public ArrayList<Membro> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<Membro> membros) {
        this.membros = membros;
    }

}