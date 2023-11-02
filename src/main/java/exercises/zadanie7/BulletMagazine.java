package exercises.zadanie7;

import java.util.Optional;
import java.util.Stack;

public class BulletMagazine {
    private Stack<String> capacity;
    private final int magazineSize;

    BulletMagazine(int magazineSize){
        this.capacity = new Stack<String>();
        this.magazineSize = magazineSize;
    }
    public Optional<String> loadBullet(String bullet){
        String result;
        if(capacity.size()<magazineSize) {
            capacity.add(bullet);
            result = bullet+" is loaded to magazine.";
        } else{
            result = "Magazine is full.";
        }
        return Optional.of(result);
    }
    public String isLoaded(){
        return ("Magazine status: "+capacity.size()+"/"+magazineSize);
    }
    public Optional<String> shot(){
        String result;
        if(!capacity.isEmpty()) {
            result = capacity.lastElement();
            capacity.remove(capacity.lastElement());
        }else{
            result = "Magazine is empty!";
        }
        return Optional.of(result);
    }

}
