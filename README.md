# Dunlap-Restaurants

*Some useful links:

`https://guides.codepath.com/android/Using-OkHttp`
`https://www.yelp.com/developers/documentation/v3/authentication`

To get access token, make a POST call via Postman to the following url:
`https://api.yelp.com/oauth2/token`

with these three keys:values in the BODY:

`grant_type: client_credentials`
`client_id ` Found in Yelp profile
`client_secret ` Found in Yelp profile

This access token will go in the gradle.properties file that will need to be found (or created) at the top level of the directory
 
```
YelpAccessToken = "YOUR_YELP_ACCESS_TOKEN";
YelpTokenType = "Bearer ";

```
