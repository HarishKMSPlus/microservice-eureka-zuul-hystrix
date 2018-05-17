# microservice-eureka-zuul-hystrix
Microservice implemented with spring boot, eureka as service registry, zuul as api gateway and hystrix as circuit breaker

Eureka: This application is the eureka registry server
Store,Inventory: These are spring boot microservice
Zuul: This is the api gateway proxy.
Hystrix: This is used in the Inventory module as circuit breaker
Ribbon: This is internally used with Eureka 

Steps
1. Bring up all the applictaion 
2. Once all the Eurka server is up we can look at the reqistered service with below uri
   http://localhost:8761/
   
3.Uri for testing
  Store Module:
  http://localhost:8079/api/store-service/store/test
  output: 
  test
  
  Inventory Module:
  http://localhost:8079/api/inventory-service/inventory/test
  http://localhost:8079/api/inventory/inventory/test
  
  output on browser(when Store module is up): 
  test ---testing inventory system 
  


