# macoauth2

## Get token
```curl
curl -X POST \
  'http://localhost:9000/oauth/token?grant_type=password' \
  -H 'Authorization: Basic Y2xpZW50X2lkOmNsaWVudF9zZWNyZXQ=' \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Postman-Token: 95f36d3f-96ef-4ce8-87b6-1edbe380b68d' \
  -d 'username=mac&password=password'
```

## Check token
```curl
curl -X GET \
  'http://localhost:9000/oauth/check_token?token=045f6cad-1ea3-4eb7-94e3-d2254b45510f' \
  -H 'Authorization: Basic Y2xpZW50X2lkOmNsaWVudF9zZWNyZXQ=' \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Postman-Token: bbaa0849-38e1-498b-a7f7-81aaa41a7b38' \
  -d 'username=mac&password=password'
```

## Get new token by refresh token
```curl
curl -X POST \
  'http://localhost:9000/oauth/token?grant_type=refresh_token' \
  -H 'Authorization: Basic Y2xpZW50X2lkOmNsaWVudF9zZWNyZXQ=' \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Postman-Token: fdb6dea0-4917-451d-9fa2-31b128ff1ea1' \
  -d refresh_token=045f6cad-1ea3-4eb7-94e3-d2254b45510f
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

## Grant Types 
- https://auth0.com/docs/applications/application-grant-types
- https://alexbilbie.com/guide-to-oauth-2-grants/
