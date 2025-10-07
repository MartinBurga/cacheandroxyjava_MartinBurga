package Services;

public class TranslatorService {

    private static TranslatorService instance;

    private TranslatorService() { }

    public static TranslatorService getInstance() {
        if (instance == null) {
            instance = new TranslatorService();
        }
        return instance;
    }

    public String translate(String word, String from, String to) {
        return switch (word.toLowerCase()) {
            case "hola" -> "hello";
            case "adios" -> "goodbye";
            case "gracias" -> "thank you";
            case "hola mundo" -> "Hello world";
            case "perro" -> "dog";
            case "gato" -> "cat";
            case "ingenieria" -> "engineering";
            default -> "[sin traducción]";
        };
    }
}
