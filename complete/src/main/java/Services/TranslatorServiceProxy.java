package Services;

public class TranslatorServiceProxy {

    private final TranslatorService translatorService = TranslatorService.getInstance();
    private final Cache cache = Cache.getInstance();

    public String translate(String word, String from, String to) {
        String key = word + "_" + from + "_" + to;

        String cached = cache.get(key);
        if (cached != null) {
            return "(desde caché) " + cached;
        }

        String result = translatorService.translate(word, from, to);
        cache.put(key, result);
        return result;
    }
}
