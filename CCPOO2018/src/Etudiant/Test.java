/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etudiant;

/**
 *
 * @author soufiyan
 */
public class Test {
    
    public static void main(String[] args){
        Etudiant etu=new Etudiant("soufiyan","melhouf",139,20);
        System.out.println(etu+"\n\n");
        
        
       ListEtudiant gstr1=new ListEtudiant();
        gstr1.ajouter("mouad", "boukir", 42, 19);
        gstr1.ajouter("abdou", "esserar", 101, 19.5);
        gstr1.ajouter("yassin", "yassin", 50, 19.8);
        gstr1.ajouter("fatima", "bouheria", 30, 19.9);
        System.out.println("affichage des etudiants existant \n\n");
        System.out.println(gstr1);
        System.out.println("le nombres des etudiants de la listetudiant est "+gstr1.getNb_Etudiant());
        
        System.out.println("la moyenne general des etudiants est "+gstr1.moyenne());
  
    }
    
}
