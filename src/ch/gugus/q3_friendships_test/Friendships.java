package ch.gugus.q3_friendships_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Friendships {
    private HashMap<String, List<String>> friendships = new HashMap<>();

    public List<String> getFriendsList(String name){
      return friendships.get(name);
    }

    public void makeFriends(String nameKey, String newFriend) {
        if(!friendships.containsKey(nameKey)){
            friendships.put(nameKey, new ArrayList<String>());
        }
        friendships.get(nameKey).add(newFriend);
    }

    public boolean areFriends(String nameKey, String friendName){
      return friendships.get(nameKey).contains(friendName);
    }
}
