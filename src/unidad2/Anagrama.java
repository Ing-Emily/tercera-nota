

public class Anagrama {
    public static boolean isIsogram(String str) {
        // Si el string está vacío, es un isograma
        if (str == null || str.isEmpty()) {
            return true;
        }

        // Convertir a minúsculas y remover acentos
        str = removeAccents(str.toLowerCase());

        // Si contiene espacios, no es un isograma
        if (str.contains(" ")) {
            return false;
        }

        // Limpiar el string (solo mantener letras)
        str = str.replaceAll("[^a-z]", "");

        // Verificar letras repetidas
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Si encontramos la mism__a letra en otra posición, no es un isograma
            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                return false;
            }
        }

        return true;
    }

    private static String removeAccents(String str) {
        return str.replaceAll("[áàäâã]", "a")
                 .replaceAll("[éèëê]", "e")
                 .replaceAll("[íìïî]", "i")
                 .replaceAll("[óòöôõ]", "o")
                 .replaceAll("[úùüû]", "u")
                 .replaceAll("[ý]", "y")
                 .replaceAll("[ñ]", "n");
    }



}
