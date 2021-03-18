package com.example.CRUDApp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class UserService {

	 static Map<Integer,User> users=new HashMap<>();
	
	static {
	User user1=(new User(1,"James","Brison"));
	User user2=(new User(2,"Michael","Tonny"));
	
	users.put(user1.getId(), user1);
	users.put(user2.getId(), user2);

	}

	
	public static List<User> getAllUser(){
		return new ArrayList<>(users.values());
	}

   public static User addUser(User user) {
	   //index +=1;
	   user.setId(user.getId());
	   users.put(user.getId(), user);
	   return user;
	  
   }

 public static User updateUser(int id,User user) {

	 user.setId(id);
	 users.put(id, user);
	 return user;
 }

public static User deleteUser(int id) {
	return users.remove(id);
}

public static boolean isExist(int id) {
	if(!users.containsKey(id)) {
		return false;
		
	}
    return true;
}






}
