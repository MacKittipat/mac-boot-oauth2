INSERT INTO users (username, password) VALUES
  ('mac', '$2a$04$yiawd.z5IHF.xjRm/LOoHuaED9Exh0zh41Iqiu/x5j6XLZM7oZyu6'),
	('john', '$2a$04$yiawd.z5IHF.xjRm/LOoHuaED9Exh0zh41Iqiu/x5j6XLZM7oZyu6'),
	('doe', '$2a$04$yiawd.z5IHF.xjRm/LOoHuaED9Exh0zh41Iqiu/x5j6XLZM7oZyu6');

INSERT INTO oauth_client_details (
    client_id,
    client_secret,
    scope,
    authorized_grant_types,
    web_server_redirect_uri,
    authorities,
    access_token_validity,
    refresh_token_validity,
    additional_information,
    autoapprove
)
VALUES
(
	  'client_id',
	  'client_secret',
	  'read,write',
	  'password,refresh_token',
	  null,
	  null,
	  300,
	  600,
	  null,
	  true
);