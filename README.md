# NoteBook_Search
BackEnd Service for NoteBook

## Instructions:
* Take NoteBook-1.0.0.jar from the target folder.
* Execute `java -jar NoteBook-1.0.0.jar` 
* Service will start running on 8888 port.

## Technologies
* SpringBoot
* Java 11
* Maven
* H2 Database
* Junit

### About
This NoteBook_Search back end service allows you to save the notes in the Database. For the test purpose, we have only one default notebook. When searching for a word in the notes, we are calculating LevenshteinDistance between the words, and in response will get only the words which have distance as 1.

### Note
1. Service contains H2 In-Memory database. The data given in the notes will be saved in note_book table.
2. Refer [api-endpoints.md](https://github.com/SudheerKumarKancharla/NoteBook_Search/blob/main/api-endpoints.md) for detailed information on end points.
3. Front end code for this application can be found [here](https://github.com/SudheerKumarKancharla/NoteBook)

