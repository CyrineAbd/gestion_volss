/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class Escale {
    private int  numeroEscale ;
    private Aeroport aeroport;
    private String heureArrive;
    private String heureDepart;

    public Escale(int numeroEscale, Aeroport aeroport, String heureArrive, String heureDepart) {
        this.numeroEscale = numeroEscale;
        this.aeroport = aeroport;
        this.heureArrive = heureArrive;
        this.heureDepart = heureDepart;
    }

    public int getNumeroEscale() {
        return numeroEscale;
    }

    public void setNumeroEscale(int numeroEscale) {
        this.numeroEscale = numeroEscale;
    }

    public Aeroport getAeroport() {
        return aeroport;
    }

    public void setAeroport(Aeroport aeroport) {
        this.aeroport = aeroport;
    }

    public String getHeureArrive() {
        return heureArrive;
    }

    public void setHeureArrive(String heureArrive) {
        this.heureArrive = heureArrive;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }
    
    
}
