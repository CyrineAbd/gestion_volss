/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class Vol {
     public Integer id;
   public String numeroVol;
   public Aeroport aeroportDepart;
   public Aeroport aeroportArrivee;
   private String dateDepart;
   private String heureDepart;
   private String dateArrivee;
   private String heureArrivee;
   private Integer nbrEscales;
   private boolean reservationOpen;

    public Vol(Integer id, String numeroVol, Aeroport aeroportDepart, Aeroport aeroportArrivee, String dateDepart, String heureDepart, String dateArrivee, String heureArrivee, Integer nbrEscales, boolean reservationOpen) {
        this.id = id;
        this.numeroVol = numeroVol;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.dateArrivee = dateArrivee;
        this.heureArrivee = heureArrivee;
        this.nbrEscales = nbrEscales;
        this.reservationOpen = reservationOpen;
    }

    public Vol() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(String numeroVol) {
        this.numeroVol = numeroVol;
    }

    public Aeroport getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(Aeroport aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public Aeroport getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(Aeroport aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public Integer getNbrEscales() {
        return nbrEscales;
    }

    public void setNbrEscales(Integer nbrEscales) {
        this.nbrEscales = nbrEscales;
    }

    public boolean isReservationOpen() {
        return reservationOpen;
    }

    public void setReservationOpen(boolean reservationOpen) {
        this.reservationOpen = reservationOpen;
    }

    
}
