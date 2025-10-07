package Services;

import org.springframework.web.bind.annotation.*;
import Services.TranslatorServiceProxy;

@RestController
@RequestMapping("/api/translate")
public class TranslateController {

    private final Services.TranslatorServiceProxy proxy = new Services.TranslatorServiceProxy();

    @GetMapping
    public String translate(
            @RequestParam String word,
            @RequestParam(defaultValue = "es") String from,
            @RequestParam(defaultValue = "en") String to) {

        return proxy.translate(word, from, to);
    }
}
