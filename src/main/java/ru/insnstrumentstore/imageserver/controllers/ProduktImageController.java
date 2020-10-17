package ru.insnstrumentstore.imageserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.ServletContextResource;
import ru.insnstrumentstore.imageserver.entity.ProduktImage;
import ru.insnstrumentstore.imageserver.repo.Produktimagerepo;

import javax.servlet.ServletContext;
import java.util.List;

@RestController
public class ProduktImageController {
    private final Produktimagerepo produktimagerepo;
    ProduktImageController(Produktimagerepo produktimagerepo)
    {this.produktimagerepo=produktimagerepo;}

    @GetMapping("/image-lists.php")
    List<ProduktImage> all() {
        return produktimagerepo.findAll();
    }

    @GetMapping("/image-list.php")
    ProduktImage findProduktImageByArtAndBrand(@RequestParam("brand") String brand, @RequestParam("art") String art){

        return produktimagerepo.findProduktImageByArtAndBrand(art,brand);    };


    @GetMapping("/multifinderbrands.php")
    ProduktImage findProduktImageByListArtAndBrand(@RequestParam("brand") String brand, @RequestParam("art") String art){

        return produktimagerepo.findProduktImageByArtAndBrand(art,brand);    };



}
