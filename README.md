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

------------------------------------------------------------------------------

## I REFACTOR ALL OF THING for task 13.
### future used:
1- bootstrap with thymeleaf.

2- postgres database manager

### pages
1- Home page to show every thing .

2- edite album page to edite album .

3- edite song page to edite song.

4-view songs page to show all songs for album.

### How to run my application
1- replace your port and database url and username and password in application proprtis.

2- create dataBase` albumdb`

2- go to web and put the path `http://localhost:{your port}/`

you get this page :
![image](https://user-images.githubusercontent.com/97642724/160245958-d8270b32-46b0-49ba-8e3f-3e1151e7c1d6.png)

to add song or album 

![image](https://user-images.githubusercontent.com/97642724/160245988-6564bfd1-b73c-4201-8f18-02413463f1b5.png)

## for test :
the test made in `index` view .
![image](https://user-images.githubusercontent.com/97642724/160246072-efa56ca4-0c0d-4e9c-831d-afa5cb4808f7.png)


### project structures :
![image](https://user-images.githubusercontent.com/97642724/160246333-e3a7d062-d985-447b-80ad-f9c7c698a9fd.png)

### End points
`http://localhost:8080/` Home page to get all album and songs and add them in table.

`http://localhost:8080/addalbum` it takes album in @ModelAttribute and add it to database

`http://localhost:8080/songAdd` it takes song in @ModelAttribute and add it to database

`http://localhost:8080/getAllSong` get all song in json format you can test it in postman

`http://localhost:8080//getAllAlbum}` get all album in json format you can test it in postman

`http://localhost:8080/deleteSong/{id}` delete the song it takes an id as path variable

`http://localhost:8080/editSong` edite singe it take song in @ModelAttribute

`http://localhost:8080/editSong` edite song it takes song in @ModelAttribute

`http://localhost:8080/editAlbum` edite album it takes song in @ModelAttribute


### note :

1- i knew the best eay to this project to use angular js or react js or any framework but i didn't have time in future i will refactor it.






