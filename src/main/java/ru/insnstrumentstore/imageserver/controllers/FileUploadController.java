package ru.insnstrumentstore.imageserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.insnstrumentstore.imageserver.repo.StorageService;


@Controller
public class FileUploadController {

    private final StorageService storageService;

    @Autowired
    public FileUploadController(StorageService storageService) {
        this.storageService = storageService;
    }


    @PostMapping("/{brand}/{art}.{ext}")
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes,@PathVariable("brand") String brand, @PathVariable("art") String art, @PathVariable("ext") String ext) {

//        storageService.store(file);
        storageService.storebynameandbrand(file,brand,art,ext);
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + art+"."+ext + "!");

        return "redirect:/{brand}/{art}.{ext}";
    }
}