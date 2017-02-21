import java.util.Collection;
import java.util.HashMap;

class demoHashMaps{

public static void main(String[] args) {
  
HashMap<String, Integer> demoHash = new HashMap<String, Integer>(5);

demoHash.put("Alastair", new Integer(31));
demoHash.put("Barry", new Integer(12));
demoHash.put("Charlene", new Integer(34));
demoHash.put("Deborah", new Integer(67));
demoHash.put("Edwin", new Integer(25));

System.out.println(demoHash.size());
System.out.println(demoHash.containsKey("Alastair"));
System.out.println(demoHash.values());
}



}