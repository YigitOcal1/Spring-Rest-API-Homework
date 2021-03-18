# CMPE-328-Homework1
Yiğithan Öcal

# Restful Api CRUD Application with Spring and Heroku

Used https://start.spring.io/ website to create spring boot and java project. Imported downloaded files to eclipse the basics of the project have been formed.

Added some dependencies and created java classes to implement CRUD app.

User class for user objects

![userclass](https://user-images.githubusercontent.com/63492956/111708840-9ea3cf80-8857-11eb-9ee0-88c08deb6b7d.png)

User API to accomplish CRUD operations 
![image](https://user-images.githubusercontent.com/63492956/111709208-44efd500-8858-11eb-8a88-6e6af107cf10.png)

After completing the code writing phase firstly, I tested the CRUD application with using the localhost when I make sure there are no problem with code.
I opened a new private Github repository and uploded all files to Github with using Git Bash.
And I need to connect CRUD application with a cloud service I chose Heroku for this purpose and I linked Github and Heroku account wiht deploying Github repository to
Heroku I got this link: https://crudappp.herokuapp.com/ and I tried to /users function and I saw that program working correctly.
And I used Postman to test other functionalities of the program.

### Get operation
![get op](https://user-images.githubusercontent.com/63492956/111710283-65b92a00-885a-11eb-9e14-b08586a9c55f.png)

![get answer](https://user-images.githubusercontent.com/63492956/111710289-681b8400-885a-11eb-8e83-254e9608d804.png)


### Post operation
![post op](https://user-images.githubusercontent.com/63492956/111710335-897c7000-885a-11eb-995b-6fc7519a417b.png)

![post result](https://user-images.githubusercontent.com/63492956/111710342-8c776080-885a-11eb-98b6-70cd07430f8f.png)

Error if any property of user is null gets and bad request error

![post id error result](https://user-images.githubusercontent.com/63492956/111710356-9600c880-885a-11eb-9f02-4d688e0b94ed.png)

![image](https://user-images.githubusercontent.com/63492956/111710571-f98af600-885a-11eb-80ee-bfe3d03fe986.png)


### Delete operation

![delete succes](https://user-images.githubusercontent.com/63492956/111710625-17585b00-885b-11eb-8b0d-775ab785da2d.png)

If user is not exist it delete operation gets an error
![delete error](https://user-images.githubusercontent.com/63492956/111710635-1e7f6900-885b-11eb-82b5-831c58f4d39b.png)


### Put operation

![put succesful](https://user-images.githubusercontent.com/63492956/111710699-3951dd80-885b-11eb-86b8-c7dd1e02e545.png)

If user with that id is not found put operation gets and error

![put errorr](https://user-images.githubusercontent.com/63492956/111710747-4bcc1700-885b-11eb-8683-a035ecc33988.png)

Lastly, I controlled all functions of the system with using the postman and saw that there are no problem in the CRUD application.

### References
Used this website for the learn how to use and create RESTFUL api with using Spring: https://spring.io/guides/tutorials/rest/




