# API endpoints

These endpoints allow you to get frequency and similar words of a word from the notebook.

## GET
[/v1/notes/{param}](#get-/v1/notes/{param}) <br/>

## GET
[/v1/notes](#get-/v1/notes) <br/>

## PUT
[/v1/notes](#put-/v1/notes) <br/>

___

### GET /v1/notes/{param}
Gets frequency of the given words and list of similar words from the notes.

**Response**

```
// for the search `Word`
{
  "frequency": 1,
  "words: [Words, word]

}
```
___

### GET /v1/notes
Gets saved notes from the database.

**Response**

```
{
  "id": 1,
  "text: "A world map is a map of most or all of the surface of Earth. World maps, because of their scale, must deal with the problem of projection. Maps rendered in two dimensions by necessity distort the display of the three-dimensional surface of the earth"

}
```
___

### POST /v1/notes
To Updates the existing notes from the notebook

**Parameters**

|          Name | Required |  Type   | Description                                                                                                                                                           |
| -------------:|:--------:|:-------:| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|     `text` | required | string  | Text for the notebook        |

**Response**

```
{
    "id": 1,
    "text": "Text for the notebook"
}
```
