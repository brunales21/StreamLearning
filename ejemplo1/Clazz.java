package ejemplo1;

public class Clazz {
    public String s;

    public static boolean tieneVocal(String t) {
        String v = "aeiou";
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < v.length(); j++) {
                if (t.charAt(i) == v.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
