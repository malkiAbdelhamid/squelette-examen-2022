package com.example.msscolaritecommand.StoredAggregate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Etudiant {

    @Id

    private Long idEtudiant;
    private String nom;
    private String promo;
    private Long idFormation;

    /*@CommandHandler
    public  Etudiant(AddEtudiantCommand cmd){
        // check integrity

       // propagate the event
    }*/

  /*  @EventSourcingHandler
    public void on(EtudiantAddedEvent event)
    {
        //complete the code
    }*/

}