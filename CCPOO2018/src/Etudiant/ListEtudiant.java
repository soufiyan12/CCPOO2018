/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etudiant;

import static Etudiant.Element.numero_Element;

/**
 *
 * @author soufiyan
 */
public class ListEtudiant {
    
    private Element premier;
    private int nb_Etudiant;
    
    /*
    public void ajouter(String lastname,String firstname,int num,double note){
        Etudiant valeur=new Etudiant(lastname, firstname, num, note);
        
        premier =new Element(valeur,premier);
        
        
    }*/
    
    
    public void ajouter(String lastname,String firstname,int num,double note){
        Element temp = premier;
        Element temp2=null;
        Element Nouveau= new Element(new Etudiant(lastname, firstname,num,note), null);
        
        if (temp==null) {premier = Nouveau; 
        
        } else {
            while((temp!=null)&&(temp.getValeur().getNumero()<=num) ){
                    temp2=temp;
                    temp = temp.getSuivant();
            
            }
            if(temp!=null){
            Nouveau.setSuivant(temp);
            if(temp==premier) premier=Nouveau;
           if(temp2!=null) temp2.setSuivant(Nouveau);
            } else {
                 temp2.setSuivant(Nouveau);
            }
        }
        
      
        
        
    }
    
    public double moyenne(){
        double res=0.0;
        Element temp =premier;
        while(temp!=null){
            res=(res+temp.getValeur().getNote());
            temp=temp.getSuivant();
        }
        res=res/ numero_Element;
        
        
        return res;
    }

    public int getNb_Etudiant() {
        return    numero_Element;
    }
    
    
    public String toString(){
        String res="";
        Element temp =premier;
        while(temp!=null){
            res=res+temp.getValeur()+"\n";
            temp=temp.getSuivant();
        }
         return res;
    }
   
}
