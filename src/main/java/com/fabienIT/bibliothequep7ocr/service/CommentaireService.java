package com.fabienIT.bibliothequep7ocr.service;

import com.fabienIT.bibliothequep7ocr.model.Commentaire;
import com.fabienIT.bibliothequep7ocr.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentaireService {

    @Autowired
    CommentaireRepository commentaireRepository;

    public void ajouterCom (Commentaire commentaire){
        commentaireRepository.save(commentaire);
    }

    public Commentaire findById(Long id) { return  commentaireRepository.findCommentaireById(id);    }

    public void effacer(Long id) {
        commentaireRepository.deleteById(id);
    }

    public Commentaire findCommentaireById(Long id) {
        return commentaireRepository.findCommentaireById(id);
    }

    public void updateCommentaire(Commentaire commentaire) {
        //recuparation du commentaire en base via l'id
        Long id = commentaire.getId();
        Commentaire dbCommentaire = commentaireRepository.findById(id).get();
        //mise à jour (récupération) du nom depuis le formulaire d'edition
        dbCommentaire.setCom(commentaire.getCom());
        //mise à jour dans la bdd (sauvegarde)
        commentaireRepository.save(dbCommentaire);
    }
}