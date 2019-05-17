# Flask + GraphQL Example
This is an example project for using GraphQL (Graphene-SQLAlchemy) with Python-Flask.

## Requirements
* Python 3.5.2+
* sqlite3

## Installing Requirements
```
$ pip3 install -r requirements.txt
```
## Runnning Flask Server
```
$ python3 app.py
```
## Creating a new Database
```
$ sqlite3 database.db < database.txt
```
## Testing GraphQL
Go to http://localhost:5000/graphql to try GraphQL.

### Adding a New User
```
mutation {
  createUser(name: "Laura", email: "lrodrin@gmail.com", username: "lrodrin") {
    user {
      id,
      name,
      email,
      username
    }
    ok
  }
}
```
### Getting All Users List
```
{
  allUsers {
    edges {
      node {
        name,
        email,
        username
      }
    }
  }
}
```
### Finding a User with Username
```
{
  findUser(username: "lrodrin") {
    id,
    name,
    email
  }
}
```
### Updating Username With Email ID
```
mutation {
  changeUsername(email: "lrodrin@gmail.com", username:"Marina") {
    user {
      name,
      email,
      username
    }
  }
}
```
