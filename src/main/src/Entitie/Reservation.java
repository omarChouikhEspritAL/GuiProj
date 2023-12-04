package Entitie;

import java.util.Date;

public class Reservation {
    private int id;
    private Date dateDebut,dateFin;
    private int nombrePassages;
    private int id_offre;
    private int id_membre;

    public Reservation(int id, Date dateDebut, Date dateFin, int nombrePassages, int id_offre, int id_membre) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nombrePassages = nombrePassages;
        this.id_offre = id_offre;
        this.id_membre = id_membre;
    }

    public Reservation(Date dateDebut, Date dateFin, int nombrePassages, int id_offre, int id_membre) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nombrePassages = nombrePassages;
        this.id_offre = id_offre;
        this.id_membre = id_membre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getNombrePassages() {
        return nombrePassages;
    }

    public void setNombrePassages(int nombrePassages) {
        this.nombrePassages = nombrePassages;
    }

    public int getId_offre() {
        return id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public int getId_membre() {
        return id_membre;
    }

    public void setId_membre(int id_membre) {
        this.id_membre = id_membre;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", dateDebut='" + dateDebut + '\'' +
                ", dateFin='" + dateFin + '\'' +
                ", nombrePassages=" + nombrePassages +
                ", offre='" + id_offre + '\'' +
                ", membre=" + id_membre +
                '}';
    }
}