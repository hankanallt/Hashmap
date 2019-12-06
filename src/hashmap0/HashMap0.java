
package hashmap0;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMap0 {

    
    public static void main(String[] args) {
        
        Map<String, String> phonebook = new HashMap<>();
         /*Key    Value*/
                   //HashMap allows only one null key ""
                   //if we put 2 null keys "Amarjot" then first will be removed.
         phonebook.put("Harkanwal", "   §10706242424");
         phonebook.put("Amarjot", "078537389");
         phonebook.put("Amarjot", "078537389");
         phonebook.put("Gogo", "0892777");
         phonebook.put("Popo", "07003388238");
         
         Set<String>Keys = phonebook.keySet();
         
         for (String Key : Keys) {
             System.out.println(Key + "" + phonebook.get(Key));
            
        }
         
//         System.out.println(phonebook);
//         System.out.println(phonebook.get("Gogo"));
//         System.out.println(phonebook.size());
//         System.out.println(phonebook.containsKey("H"));
     } 
    
}





/*HashMap is a part of Map interface that stores both “key/value” as a pairs.
They are not ordered in the sequence in which we are adding the
values. It’s because of using HashMap. The list is not ordered.
Each Key in HashMap must be Unique, If there are copies, then they will be removed when printed.

We cannot use For enhanceloop with Hashmap

insted We use keySet( ) method to be
able to use “for enhance loop”*/