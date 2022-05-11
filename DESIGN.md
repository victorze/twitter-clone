## Requirements

Como usuario autenticado quiero...

### Tweets
- ...poder publicar y eliminar un tweet
- ...poder ver los tweets que publicarón los usuario a quienes sigo
- ...poder ver mis tweets y los retweets que hice
- ...poder ver el perfil y los tweets de cualquier usuario

### Usuarios
- ...poder seguir y dejar de seguir a un usuario
- ...poder actualizar mi perfil
- ...poder ver los usuario a quienes sigo
- ...poder ver los usuario que me siguen

### Likes y retweet
- ...poder dar like a un tweet
- ...poder retwittear un tweet
- ...poder ver los tweets a los que di like

## Endpoints (backend)

Tweets `/api/tweets`

- GET listar tweets (parámetros opcionales: userID, tweetID)
- POST crear un tweet
- DELETE eliminar un tweet

Timeline `/api/timeline`

- GET linea de tiempo de tweets

Followers `/api/followers`

- GET listar seguidores
- PUT actualizar seguidores

Users `/api/users/:id`

- GET obtener el perfil de un usuario
- PUT actualizar el perfil de un usuario

Auth
- `/api/register` POST registrar un nuevo usuario
- `/api/login` POST iniciar sesión
- `/api/logout` POST cerrar sesión


## Páginas (frontend)

- `/home` timeline de tweets publicados (usuarios a quienes sigo)

- `/tweet` formulario para publicar un tweet

- `/:username` perfil de un usuario y tweets publicados

- `/:username/following` lista de usuarios a quienes sigo

- `/:username/followers` lista de usuarios que me siguen

- `/:username/likes` lista los tweets que el usuario dio like

- `/:username/:id_tweet` ver un tweet específico

- `/settings/profile` formulario para editar los datos del usuario

- `/register` formulario para crear una cuenta

- `/login` formulario para iniciar sesión

## Esquema de datos

### users

|||
| ------------- |------------|
| id          | primary key  |
| username    | varchar (unique) |
| name        | varchar      |
| bio         | varchar      |
| password    | varchar (hash) |
| created_at  | date         |

### tweets

|||
| ------------- |------------|
| id          | primary key  |
| user_id     | foreign key, int |
| text        | varchar(280) |
| created_at  | timestamp    |

### relationships
|||
| ------------- |------------|
| id          | primary key  |
| follower_id     | foreign key, int |
| followed_id     | foreign key, int |
| created_at  | timestamp    |
