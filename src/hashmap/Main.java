package hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex: (name,email),(username,userID),(country,capital)

        HashMap<String, String> countries = new HashMap<String, String>();

        //add a key value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        //удалить
        //System.out.println(countries);
      //  countries.remove("USA");
        //System.out.println(countries);

        //получить значение
//        countries.get("Russia");
//        System.out.println(countries);
        //System.out.println(countries.get("Russia"));

        //очистка
//        countries.clear();
//        System.out.println(countries);

       // System.out.println(countries.size());

        //замена
//        countries.replace("USA", "Detroit");
//        System.out.println(countries);

        //проверка
       // System.out.println(countries.containsKey("England")); //ключ
       // System.out.println(countries.containsValue("Beijing")); //значение

        for(String i : countries.keySet()){
            System.out.print(i+"\t"+" =");
            System.out.println(countries.get(i));
        }
    }
}
