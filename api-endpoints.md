# API endpoints

These endpoints allow you to get frequency and similar words of a word from the notebook.

## GET
[/v1/search/{param}](#get-/v1/search/{param}) <br/>

## PUT
[/v1/notes](#put-/v1/notes) <br/>

___

### GET /v1/search/{param}
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
