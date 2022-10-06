package day_53_Map;

import day_33_Encapsulation.Person;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
    //   List<Integer> list=new ArrayList<>();
//list.add(5);
//list.add(10);


     // map.forEach((k,v)-> System.out.println(k+" --> "+v));

    // System.out.println(map.get(995));
      //  System.out.println(map.size());
     // System.out.println(map.toString().toUpperCase());
     // map.remove(895);

      //  System.out.println(map.containsKey(896));
       // System.out.println(map.containsValue("ayşe"));


       // map.replace(895,"ayşe");

      //  System.out.println(map);

       // System.out.println(map.keySet());
       // System.out.println(map.values());

        Map<Integer,String> fenA=new LinkedHashMap<>();
        fenA.put(671,"Harun");
        fenA.put(995,"mehmet");
        fenA.put(895,"ahmet");
        fenA.put(423,"ayşe");

        Map<Integer,String> fenB=new LinkedHashMap<>();
        fenB.put(888,"enes");
        fenB.put(9225,"beytullah");
        fenB.put(8295,"bahar");
        fenB.put(4223,"umut arslan");

       /* for (Integer num: map.keySet()) {
            System.out.println(map.get(num));
        }
        */
        List<   Map<Integer,String>   >  okul=new ArrayList<>();
        okul.add(fenA);
        okul.add(fenB);
      //  System.out.println(okul.size());
       // System.out.println(okul.toString());

       // System.out.println(fenB.get(4223));
        // System.out.println(okul.get(1).get(4223));

     /*   for (Map<Integer,String> sinif:okul){
            for(Integer key:sinif.keySet()){
                System.out.println(sinif.get(key));
            }
        }
*/

        for (int i = 0; i < okul.size() ; i++) {
            for (Integer key: okul.get(i).keySet()) {
                System.out.println(okul.get(i).get(key));
            }


        }





    }




}
