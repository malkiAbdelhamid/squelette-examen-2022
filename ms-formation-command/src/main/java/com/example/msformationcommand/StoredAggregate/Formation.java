package com.example.msformationcommand.StoredAggregate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Formation {

    @Id
    private Long idFormation;
    private String nom;
    private int duree;

 /* @CommandHandler
    public  Formation(AddFormationCommand cmd){
        // check integrity

       // propagate the event
    }
*/
  /*  @EventSourcingHandler
    public void on(FormationAddedEvent event)
    {
       //complete the code
    }*/
}
