
package com.alexandre.avisutilisateur.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.alexandre.avisutilisateur.entities.Avis;
import com.alexandre.avisutilisateur.services.AvisService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@CrossOrigin(allowedHeaders = "*", origins = "*")

@RequestMapping("/api/avis")

public class AvisController {
    private final AvisService avisService;

    /*
     * @param
     */
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Avis avis) {
        this.avisService.create(avis);
    }

    @GetMapping("/get")
    public String getAvis() {
        return "Hello, World!"; // Ceci est un exemple, ajustez selon vos besoins.
    }

}
