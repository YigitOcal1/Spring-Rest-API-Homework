package com.example.CRUDApp;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	// Get operation for the list all users 
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return UserService.getAllUser();
	}
	
	// Post operation for add user if any property of user is null, user gets an error
	@PostMapping("/addUser")
	public ResponseEntity<Object> adddUser(@RequestBody User user)
	{
		if(user.getName()==null||user.getSurname()==null||UserService.isExist(user.getId())==true) {
			return new ResponseEntity<>("Cannot add this user ",HttpStatus.BAD_REQUEST);
		}
		user=UserService.addUser(user);		
		return new ResponseEntity<>(
				"User Succesfully Created With name "+user.getName()+" surname: "+user.getSurname()+" id: "+user.getId(),HttpStatus.CREATED);
	}
	
	// Put operation to update properties of user with using id
	@PutMapping("/updateUser/{userId}")
	public ResponseEntity<Object> updateUser(@PathVariable int userId,@RequestBody User user){
		if(user.getId()!=userId) {
			throw new NotFoundException("User is not found with this id: "+userId);
		}
		UserService.updateUser(userId, user);
		return new ResponseEntity<>(
				
				"User Succesfully Updated With "+" id: "+user.getId(),HttpStatus.OK);
		 
	}
        
	// Delete operation to delete user with using the user id
	@DeleteMapping("/deleteUser/{userId}")
	 public ResponseEntity<Object> deleteUser(@PathVariable int userId) {
		if(UserService.isExist(userId)==false)
		{
			throw new NotFoundException("User is not found with this id: "+userId);

		}
		UserService.deleteUser(userId);		
		return new ResponseEntity<>(
				"User Succesfully Deleted With id: "+userId,HttpStatus.OK);
	}
	
}
