package geekbrains.homework.collections.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringSearcher {

    Set <String> findListUniWord(String [] strSource){
        return new LinkedHashSet<>(Arrays.asList(strSource));
    }

    HashMap <String,Integer> findDuplicateString(String[] strSource){

        HashMap <String,Integer> hashMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < strSource.length; i++) {
            for(int k = 0;k < strSource.length;k++){
                if(strSource[i].equalsIgnoreCase(strSource[k])){
                    count++;
                }
            }
            hashMap.putIfAbsent(strSource[i],count);
            count = 0;
        }
        return hashMap;
    }
}
