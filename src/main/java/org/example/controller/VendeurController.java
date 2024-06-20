package org.example.controller;

import org.example.model.Vendeur;
import org.example.repository.VendeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendeurs")
public class VendeurController {
    @Autowired
    private VendeurRepository vendeurRepository;

    @PostMapping
    public ResponseEntity<Vendeur> ajouterVendeur(@RequestBody Vendeur vendeur) {
        return ResponseEntity.ok(vendeurRepository.save(vendeur));
    }

    @GetMapping
    public ResponseEntity<List<Vendeur>> obtenirVendeurs() {
        return ResponseEntity.ok(vendeurRepository.findAll());
    }
}
