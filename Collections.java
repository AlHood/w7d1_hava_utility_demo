import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;


class demoCollections{


  public static void main(String[] args) {

    ArrayList<Integer> scores = new ArrayList<Integer>();
    scores.add(12);
    scores.add(32);
    scores.add(24);
    scores.add(24);
    scores.add(51);
    scores.add(26);

    System.out.println(Collections.frequency(scores, 24));
    System.out.println(Collections.max(scores));
    Collections.shuffle(scores);
    System.out.println(scores);


  }




}