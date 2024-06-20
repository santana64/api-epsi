package org.example.controller;

import org.example.model.Article;
import org.example.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping
    public ResponseEntity<Article> ajouterArticle(@RequestBody Article article) {
        return ResponseEntity.ok(articleService.ajouterArticle(article));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerArticle(@PathVariable Long id) {
        articleService.supprimerArticle(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Article> modifierArticle(@RequestBody Article article) {
        return ResponseEntity.ok(articleService.modifierArticle(article));
    }

    @GetMapping
    public ResponseEntity<List<Article>> obtenirArticles() {
        return ResponseEntity.ok(articleService.obtenirArticles());
    }

    @GetMapping("/categorie/{categorie}")
    public ResponseEntity<List<Article>> obtenirArticlesParCategorie(@PathVariable String categorie) {
        return ResponseEntity.ok(articleService.obtenirArticlesParCategorie(categorie));
    }

    @GetMapping("/vendu/{vendu}")
    public ResponseEntity<List<Article>> obtenirArticlesVendus(@PathVariable boolean vendu) {
        return ResponseEntity.ok(articleService.obtenirArticlesVendus(vendu));
    }
}
