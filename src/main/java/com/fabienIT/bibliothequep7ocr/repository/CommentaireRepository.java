package com.fabienIT.bibliothequep7ocr.repository;

import com.fabienIT.bibliothequep7ocr.model.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

    Optional<Commentaire> findById (Long id);
    Commentaire findCommentaireById (Long id);
}
