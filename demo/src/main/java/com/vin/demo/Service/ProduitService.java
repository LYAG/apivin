package com.vin.demo.Service;

import com.vin.demo.Model.Produit;

import java.util.List;

public interface ProduitService {

    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Integer id);
    Produit getProduitById(Integer id);
    List<Produit> getAllProduits();


}
