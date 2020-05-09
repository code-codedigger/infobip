Build and run the app.Access below urls.
SUM: http://localhost:9091/api/add
Diff: http://localhost:9091/api/diff

Exceptions:
------------------------------
404 bad request
request: 
{
	"x":"",
	"y":"23"
}
response: 
{
    "message": "Validation Failed",
    "details": "Invalid value x : "
}
--------------------------------


