## API
1- use the default port and /hello will main page or home page appear 
2-  use the default port and /capitalize/{string} you will get same string but in capital
3- use the default port and /albums  you will get array it contain many album.


## Project structure 

I use 17 JDK and  i build my app in this way :
![](https://user-images.githubusercontent.com/97642724/158468103-7078f18d-e76b-4d7b-8920-756bab2efdbc.png)

# Update for lab 12
## API
### you can use  
`http://localhost:port/album`  to get all album in table and add new album from form .
### you can use also defualt end point 
`http://localhost:port/` to see all album and add new album .
### i use /addalbum end point to add new album to data base .
### i RedirectView to update the table.
### you can see the album html inside resources folder it has a table and a form
### Just change database url in application properties and run the server .
### all method inside songr controller class.
