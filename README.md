# NoteBook_Search
BackEnd Search Service for NoteBook

## Instructions:
* Take Search-0.0.1.jar from the target folder.
* Execute `java -jar search-0.0.1.jar` 
* Service will start running on 8888 port.

## Technologies
* SpringBoot
* Java 11
* Maven
* H2 Database

## End Points
* To Search the Word -> **(Get) /v1/search/{param}**
* To Save the notes -> **(Put) /v1/notes**

### Note
Service contains H2 In-Memory database. The data given in the notes will be saved in note_book table.

