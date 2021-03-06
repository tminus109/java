URL Aliaser

We are going to create something like a URL-shortening application.
We are not going to struggle with random strings,
rather we will create a "URL aliasing application".
Read the whole description in order to understand the application.

https://en.wikipedia.org/wiki/URL_shortening

GET /:

The main page has 3 scenarios.

Default:

- The main page should be rendered.
- It should contain a form with two input fields and a submit button.
- The form should be submitted to `POST /save_link`.

Success:

- It should show the message "Your URL is aliased to {urlAlias}
  and your secret code is {secret code}."
- It should clear the input fields.

Error:

- It should show the default view.
- It should show the message "Your alias is already in use!".
- It should not clear the input fields.

POST /save_link:

- If the alias is already in use redirect to the main page with the error scenario.
- Else:
    - Generate a secret code which is just a random 4-digit string consisting of numbers.
    - Store the entry in the database.
    - Redirect to the main page with the success scenario.

GET /a/{alias}:

- If the urlAlias exists it should increment the hit count and redirect to the URL,
  otherwise respond with 404 status code.

GET /api/links:

- It should respond with the stored entries in the following JSON format
  (note that the secret code is not included!):

  [
  {
  "id": 0,
  "url": "http://reddit.com",
  "urlAlias": "bye-bye-time",
  "hitCount": 0
  },
  {
  "id": 1,
  "url": "http://youtube.com",
  "urlAlias": "watch-videos",
  "hitCount": 4
  }
  ]

DELETE /api/links/{id}:

- The secret code should be in the request's body in JSON format:

  {
  "secretCode": "0483"
  }

- If it doesn't exist respond with 404 status code.
- If it exists but the provided secret code doesn't match respond with 403 status code.
- If it exists and the provided secret code matches delete the entry from the database
  and respond with 204 status code.

Question:

Given the following table named `applicants`:

| id | name               | country        | age |
|:---|:-------------------|:---------------|:----|
| 0  | Bo??ivoj Sou??ek     | Czech Republic | 24  |
| 1  | Papp Patr??cia      | Hungary        | 33  |
| 2  | Kocsis Ivett       | Hungary        | 37  |
| 3  | Slavom??r Vykukal   | Czech Republic | 20  |
| 4  | Bruno Mal??k        | Czech Republic | 31  |
| 5  | Veronika Luke??ov??  | Czech Republic | 18  |
| 6  | Sz??kely Mikl??s     | Hungary        | 29  |
| 7  | Heged??s Benj??min   | Hungary        | 37  |
| 8  | Nela Machov??       | Czech Republic | 20  |
| 9  | Balog Rajmund      | Hungary        | 39  |
| 10 | Major Borb??la      | Hungary        | 35  |
| 11 | Evel??na Horv??thov?? | Czech Republic | 23  |
| 12 | V??szoly Vivien     | Hungary        | 40  |
| 13 | Lada St??skalov??    | Czech Republic | 27  |
| 14 | Dagmar Bene??ov??    | Czech Republic | 33  |

- Write an SQL query to select the name of the 5 youngest applicants
  from the Czech Republic.

SELECT name FROM applicants WHERE country = "Czech Republic" ORDER BY age ASC LIMIT 5;
