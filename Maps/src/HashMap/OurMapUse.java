package HashMap;

public class OurMapUse {

    public static void main(String[] args) {
        
        Map<String, Integer> map = new Map<>();
        
       
        for (int i = 0; i <= 20; i++) {
                       map.insert("abc" + i, i + 1);
            
            
            System.out.println("i=" + i + " Load Factor=" + map.loadfactor());
            
           
            for (int i1 = 0; i1 <= i; i1++) {
                System.out.println("abc" + i1 + ":" + map.getValue("abc" + i1));
            }
        }
    }
}
