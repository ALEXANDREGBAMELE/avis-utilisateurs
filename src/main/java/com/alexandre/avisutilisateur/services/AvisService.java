
package com.alexandre.avisutilisateur.services;

import org.springframework.stereotype.Service;

import com.alexandre.avisutilisateur.entities.Avis;
import com.alexandre.avisutilisateur.repository.AvisRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AvisService {

    private final AvisRepository avisRepository ;

    /**
     * @param Avis
     *
     */
    public void create(Avis avis){
        this.avisRepository.save(avis);
    }
    
}