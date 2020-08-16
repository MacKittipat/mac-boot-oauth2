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

```
{
    "access_token": "d57a69d3-28a6-47f3-90ee-677d4ee95f31",
    "token_type": "bearer",
    "refresh_token": "2e1d76ca-147a-4ae1-b30c-42ad3724304a",
    "expires_in": 299,
    "scope": "read write"
}
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

```
{
    "exp": 1544238454,
    "user_name": "mac",
    "client_id": "client_id",
    "scope": ["read", "write"]
}
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
- https://auth0.com/docs/api-auth/which-oauth-flow-to-use
- https://alexbilbie.com/guide-to-oauth-2-grants/

## Reference 
- https://docs.spring.io/spring-security-oauth2-boot/docs/current-SNAPSHOT/reference/htmlsingle/
- https://vimeo.com/138774235
- https://www.youtube.com/watch?v=GyCL8AJUhww
- https://www.youtube.com/watch?v=zEysfgIbqlg&list=PLKCk3OyNwIzuD_jxWu-JddooM2yjX5q99&index=5&t=0s
- https://www.youtube.com/watch?v=1ZX7554l8hY
