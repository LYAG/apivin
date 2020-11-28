package com.vin.demo;

import com.vin.demo.Model.Produit;
import com.vin.demo.Repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PRD0002", "Long Champs", 14, 20, 200, 40, "LE VIGNERON", 290,1,1,"ce vin est le vin le plus doux au monde","image",true,false);
		produitRepository.save(prod);
	}

	@Test
	public void testFindProduit(){
		Produit p= produitRepository.findById(1).get();
		System.out.println(p);
	}
	@Test
	public void testUpdateProduit(){
		Produit p= produitRepository.findById(1).get();
		p.setImg("empty");
		produitRepository.save(p);
		System.out.println(p);
	}

	@Test
	public void testDeleteProduit(){
		produitRepository.deleteById(1);
	}

	@Test
	public void testFindAllProduit(){
		List<Produit> p=produitRepository.findAll();
		for (Produit produit:p)
		System.out.println(p);


	}

}
