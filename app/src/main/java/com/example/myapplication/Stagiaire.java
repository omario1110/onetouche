package com.example.myapplication;

public class Stagiaire {
     String Nom;
    String Prénom ;
    String Sexe ;
    int Image ;
    public Stagiaire(String nom, String prénom, String sexe, int image) {
        Nom = nom;
        Prénom = prénom;
        Sexe = sexe;
        Image = image;
    }


    public Stagiaire() {
    }



    public void setNom(String nom) {
        Nom = nom;
    }

    public void setPrénom(String prénom) {
        Prénom = prénom;
    }

    public void setSexe(String sexe) {
        Sexe = sexe;
    }

    public void setImage(int image) {
        Image = image;
    }



    public String getNom() {
        return Nom;
    }

    public String getPrénom() {
        return Prénom;
    }

    public String getSexe() {
        return Sexe;
    }

    public int getImage() {
        return Image;
    }



}
