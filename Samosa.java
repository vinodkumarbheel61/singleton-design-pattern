public class Samosa {
    // Lazy way of creating singleton object
    private static Samosa samosa;

    private Samosa() {
    }

    public static Samosa getSamosa() {
        if (samosa == null) {
            synchronized (Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }
}