import java.util.ArrayList;
import java.lang.Math;

public class LuckGenerator {
    private ArrayList<String> luck = new ArrayList<String>();

    private void addluck(String luckValue){
        luck.add(luckValue);
    }

    public LuckGenerator() {
        this.addluck("very lucky");
        this.addluck("lucky");
        this.addluck("quite lucky");
        this.addluck("a little bit lucky");
        this.addluck("a little bit unlucky");
        this.addluck("quite unlucky");
        this.addluck("unlucky");
        this.addluck("very unlucky");
    }

    public String testMyLuck() {

        int luckNumber =  (int) (10 * Math.random());
        luckNumber = luckNumber > 7 ? 7 : luckNumber;
        return luck.get(luckNumber);
    }
}
