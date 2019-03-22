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
public class Etudiant {
    private String  nom,prenom;
    private int numero;
    private double note;

    public Etudiant(String nom, String prenom, int numero, double note) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.note = note;
    }

    public Etudiant(String nom, String prenom, int numero ) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Etudiant " +  " " + numero +" : " + nom + " " + prenom + "  " + note ;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    
    
    
}
