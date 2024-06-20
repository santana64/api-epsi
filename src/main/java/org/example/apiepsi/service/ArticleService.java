package org.example.service;

import org.example.model.Article;
import org.example.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public Article ajouterArticle(Article article) {
        return articleRepository.save(article);
    }

    public void supprimerArticle(Long id) {
        articleRepository.deleteById(id);
    }

    public Article modifierArticle(Article article) {
        return articleRepository.save(article);
    }

    public List<Article> obtenirArticles() {
        return articleRepository.findAll();
    }

    public List<Article> obtenirArticlesParCategorie(String categorie) {
        return articleRepository.findByCategorie(categorie);
    }

    public List<Article> obtenirArticlesVendus(boolean vendu) {
        return articleRepository.findByVendu(vendu);
    }
}
