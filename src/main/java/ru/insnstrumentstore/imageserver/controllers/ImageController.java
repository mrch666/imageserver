package ru.insnstrumentstore.imageserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.ServletContextResource;

import javax.servlet.ServletContext;

@Controller
public class ImageController {

    @Autowired
    private ServletContext servletContext;


    @RequestMapping(value = "/{brand}/{art}.{ext}",produces = MediaType.IMAGE_JPEG_VALUE, method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Resource> getImageAsResource(@PathVariable("brand") String brand, @PathVariable("art") String art, @PathVariable("ext") String ext) {
        final HttpHeaders headers = new HttpHeaders();
        Resource resource = new ServletContextResource(servletContext, "/WEB-INF/images/" +brand+"/"+art+"."+ext);
        return new ResponseEntity<>(resource, headers, HttpStatus.OK);
    }
}