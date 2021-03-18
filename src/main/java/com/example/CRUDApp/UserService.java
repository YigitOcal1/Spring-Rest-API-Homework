package com.example.CRUDApp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class UserService {
  
	// Using hashmap to store user objects
	 static Map<Integer,User> users=new HashMap<>();
	
	// Sample user objects 
	static {
	User user1=(new User(1,"Bora","Bola"));
	User user2=(new User(2,"Michael","Odya"));
	
	users.put(user1.getId(), user1);
	users.put(user2.getId(), user2);
		
	}

	// Method for listing all users
	public static List<User> getAllUser(){
		return new ArrayList<>(users.values());
	}
        
	// Method for adding users
        public static User addUser(User user) {
	   
	   user.setId(user.getId());
	   users.put(user.getId(), user);
	   return user;
	  
        }
        
	// Method for update user properties
        public static User updateUser(int id,User user) {

	 user.setId(id);
	 users.put(id, user);
	 return user;
       }
       
	// Method for delete user with using id
        public static User deleteUser(int id) {
	return users.remove(id);
       }
        
	// Method for the is user in the system or not
        public static boolean isExist(int id) {
	if(!users.containsKey(id)) {
		return false;
		
	}
        return true;
     }


}
