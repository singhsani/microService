# JWT(Json web token)
JWT is a stateless authentication mechanism used to securely transfer information between client and server.
It is most commonly used for: 
1. Authentication
2. Authorization
3. Securing REST APIs
   
 ## Structure of JWT
    A JWT has 3 parts, separated by dots (.):
      1. Header : 
         {
         "alg": "HS256",
         "typ": "JWT"
         }
     2. Payload : 
               {
                   "sub": "user123",
                   "role": "ADMIN",
                   "iat": 1700000000,
                   "exp": 1700003600
               }
    3. Signature : 
            HMACSHA256(
                base64(header) + "." + base64(payload),
                secret_key
            )

## How JWT Authentication Works
    1️⃣ User logs in with username & password
    2️⃣ Server validates credentials
    3️⃣ Server generates JWT
    4️⃣ Client stores JWT (usually in localStorage / cookie)
    5️⃣ Client sends JWT in every request:
      make file
        Authorization: Bearer <token>
    6️⃣ Server validates token → allows access

## ✅ Why Use JWT?

    ✔ Stateless (no session stored on server)
    ✔ Scalable (good for microservices)
    ✔ Faster than session-based auth
    ✔ Works well with REST APIs

