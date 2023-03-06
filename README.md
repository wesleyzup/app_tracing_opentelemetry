- Execute the following steps 

  - 1 - ```./mvnw clean install```

  - 2 - ```docker compose up --build --wait```
  
  - 3 - Make a request to  http://localhost:8080/tracing
  
  - 4 - Check the jaeger UI http://localhost:16686/search
    - **Service** newtest-tracing
    - Operation: **HTTP GET** 
    
**My questions are related to the HTTP GET operation**



