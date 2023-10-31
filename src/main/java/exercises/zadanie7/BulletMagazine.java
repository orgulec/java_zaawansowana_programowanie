package exercises.zadanie7;

import java.util.Stack;

public class BulletMagazine {
    private Stack<String> capacity;
    private int magazineSize;

    BulletMagazine(int magazineSize){
        this.capacity = new Stack<String>();
        this.magazineSize = magazineSize;
    }
    public void loadBullet(String bullet){
        if(capacity.size()<magazineSize) {
            capacity.add(bullet);
            System.out.println(bullet+" is loaded to magazine.");
        } else{
            System.out.println("Magazine is full.");
        }
    }
    public void isLoaded(){
        System.out.println("Magazine status: "+capacity.size()+"/"+magazineSize);
    }
    public void shot(){
        if(capacity.size()>0) {
            System.out.println(capacity.lastElement());
            capacity.remove(capacity.lastElement());
        }else{
            System.out.println("Magazine is empty!");
        }
    }

}
