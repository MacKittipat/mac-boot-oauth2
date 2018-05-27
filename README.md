# macoauth2

## Get token

```curl
curl -X POST \
  http://localhost:9000/oauth/token \
  -H 'Authorization: Basic bWFjOnNlY3JldA==' \
  -H 'Cache-Control: no-cache' \
  -H 'Postman-Token: eb3aea48-f88d-4e9d-abb8-6f3594376eb8' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F grant_type=password \
  -F username=mac \
  -F password=password
```

## Get resource 
```curl
curl -X GET \
  http://localhost:9001/api/products \
  -H 'Authorization: Bearer b16b13c3-d4ac-4ccc-8145-bf5977f80101' \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: 935b060c-0f4a-461c-862a-4129debe2621'
```

## Get new token by refresh token
```curl
curl -X POST \
  http://localhost:9000/oauth/token \
  -H 'Authorization: Basic bWFjOnNlY3JldA==' \
  -H 'Cache-Control: no-cache' \
  -H 'Postman-Token: c688f1d0-92cf-48b9-b158-4fbcaac70776' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F grant_type=refresh_token \
  -F refresh_token=7676065a-2e3e-4762-a964-1b1ac878b524
```
