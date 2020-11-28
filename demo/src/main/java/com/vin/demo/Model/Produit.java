package com.vin.demo.Model;


import javax.persistence.*;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idprduit;
    private String sku;
    private String marque;
    private Integer volume;
    private Integer unite;
    private double poid;
    private double prix;
    private String nomproduit;
    private int qteproduit;
    private int idsouscat;
    private int idcat;
    private String description;
    private String img;
    private boolean best;
    private boolean statut=false;

    public Produit() {

    }

    public Integer getIdprduit() {
        return idprduit;
    }

    public void setIdprduit(Integer idprduit) {
        this.idprduit = idprduit;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }


    public Integer getUnite() {
        return unite;
    }

    public void setUnite(Integer unite) {
        this.unite = unite;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(Float poid) {
        this.poid = poid;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getNomproduit() {
        return nomproduit;
    }

    public void setNomproduit(String nomproduit) {
        this.nomproduit = nomproduit;
    }

    public int getQteproduit() {
        return qteproduit;
    }

    public void setQteproduit(int qteproduit) {
        this.qteproduit = qteproduit;
    }

    public int getIdsouscat() {
        return idsouscat;
    }

    public void setIdsouscat(int idsouscat) {
        this.idsouscat = idsouscat;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isBest() {
        return best;
    }

    public void setBest(boolean best) {
        this.best = best;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public Produit(String sku, String marque, Integer volume, Integer unite, double poid, double prix, String nomproduit, int qteproduit, int idsouscat, int idcat, String description, String img, boolean best, boolean statut) {
        this.idprduit = idprduit;
        this.sku = sku;
        this.marque = marque;
        this.volume = volume;
        this.unite = unite;
        this.poid = poid;
        this.prix = prix;
        this.nomproduit = nomproduit;
        this.qteproduit = qteproduit;
        this.idsouscat = idsouscat;
        this.idcat = idcat;
        this.description = description;
        this.img = img;
        this.best = best;
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idprduit=" + idprduit +
                ", sku='" + sku + '\'' +
                ", marque='" + marque + '\'' +
                ", unite=" + unite +
                ", poid=" + poid +
                ", prix=" + prix +
                ", nomproduit='" + nomproduit + '\'' +
                ", qteproduit=" + qteproduit +
                ", idsouscat=" + idsouscat +
                ", idcat=" + idcat +
                ", description='" + description + '\'' +
                ", img='" + img + '\'' +
                ", best=" + best +
                ", statut=" + statut +
                '}';
    }
}
