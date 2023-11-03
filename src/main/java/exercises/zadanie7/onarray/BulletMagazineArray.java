package exercises.zadanie7.onarray;

import java.util.Optional;
import java.util.Stack;

public class BulletMagazineArray {
    private final String[] capacity;

    BulletMagazineArray(int magazineSize) {
        this.capacity = new String[magazineSize];
    }

    public Optional<String> loadBullet(String bullet) {
        String result = null;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] == null) {
                capacity[i] = bullet;
                result = bullet + " is loaded to magazine.";
                break;
            } else {
                result = "Magazine is full.";
            }
        }
        return Optional.of(result);
    }

    public String isLoaded() {
        int count=0;
        for(String c : capacity){
            if(c != null){
                count++;
            }
        }
        return ("Magazine status: " + count + "/" + capacity.length);
    }

    public Optional<String> shot() {
        String result = null;
        for (int i = capacity.length - 1; i >= 0; i--) {
            if (capacity[i] != null) {
                result = capacity[i];
                capacity[i] = null;
                break;
            } else {
                result = "Magazine is empty!";
            }
        }
        return Optional.of(result);
    }

}
