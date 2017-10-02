package com.ulascan.adresdefteri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ulascan.adresdefteri.dao.KisilerDAO;
import com.ulascan.adresdefteri.entity.Kisiler;

@Controller
public class KisilerController {
	
	@Autowired
	private KisilerDAO kisilerDAO;
	
	@GetMapping("/")
	public String kisileriListele(Model theModel) {
		
		List<Kisiler> kisiler = kisilerDAO.kisileriAl();
		
		theModel.addAttribute("kisiler", kisiler);
		
		return "kisi-listesi";
	}
	
	@GetMapping("/kisiEklemeFormu")
	public String kisiEklemeFormu(Model theModel) {
		
		Kisiler kisiler = new Kisiler();
		
		theModel.addAttribute("kisiler", kisiler);
		
		return "kisi-form";
	}
	
	@PostMapping("/kisiKaydet")
	public String kisiKaydet(@ModelAttribute("kisiler") Kisiler kisiler) {
				
		kisilerDAO.kisiKaydet(kisiler);
		
		return "redirect:/";
		
	}
	
	@GetMapping("/guncellemeFormuGoster")
	public String guncellemeFormuGoster(@RequestParam("kisiId") int id, Model model) {
		
		Kisiler kisiler = kisilerDAO.kisiAl(id);
		
		model.addAttribute("kisiler", kisiler);
		
		return "kisi-form";
	}
	
	@GetMapping("/sil")
	public String kisiSil(@RequestParam("kisiId") int id) {
		
		kisilerDAO.kisiSil(id);
		
		return "redirect:/";
	}

}
