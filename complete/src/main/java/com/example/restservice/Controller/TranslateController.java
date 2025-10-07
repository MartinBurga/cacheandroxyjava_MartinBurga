package com.example.restservice.Controller;

import Services.TranslatorServiceProxy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/translate")
public class TranslateController {

    private final TranslatorServiceProxy proxy = new TranslatorServiceProxy();

    @GetMapping
    public String translate(
            @RequestParam String word,
            @RequestParam(defaultValue = "es") String from,
            @RequestParam(defaultValue = "en") String to) {

        return "Traducción de '" + word + "': " + proxy.translate(word, from, to);
    }
}
