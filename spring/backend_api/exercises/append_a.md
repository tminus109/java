This is the continuation of the previous Frontend exercise,
you should extend that with a new endpoint.

You should create a logic that can receive a string and append an A letter to it.

Create a dynamic GET /appenda/{appendable} endpoint
that responds with the appended a:

e.g.: /appenda/kuty

responds with:

{
"appended": "kutya"
}

if no appendable is provided, that's a different endpoint ->
so the server should respond with 404.
Check your application in the browser and click on the "Try appenda" endpoint button.
