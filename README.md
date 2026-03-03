
1. System Architecture:

    microservice is a better approach.
    because we can easily build and deploy microservices service seperately and can maintain by seperate team.
    also we can be scalable that very efficiency for large traffic and peek times.

   system architecture


    api gateway.
    service discovery
    cdn
    AWS Services related to micro services.
    
    
    different micro services
        1. customer service
        2. product service
        3. order service
        4. payment service
        5. Inventory service
        6. shopping cart service
        7. auditing service
        9. notification service

    for syncronuous communication we can use REST or gRPC web services
    for asyncronus communication we can use ActiveMQ Kafka (notification service, audit services)




2. Database Design:

    as we use microservice architecture separate db can use difference service that is kind of added advantage.
    so we can use structure schema for customer and order and also the payment, so we can go with RDBMS like postgresSql.
    if we need sacaling both ways we can use NoSql (ex: we can use Document Db like MongoDB)

    for simple database design

    we can think about entities

        1.Customer
        2.Product
        3.Order
        4.OrderItem
        5.ShopingCart
        6.CartItem
        7.Payment
        8.Inventory

3. Rendering Approach:

    Normally we have two approch
        1. SSR - Server side Rendering: here all the rendering is happening in Server Side. it is SEO friendly.
        2. CSR - Client side Rendering: client side handle the structuring part so performance wise CSR is good.

    I think as we need good performance we should go with CSR


4. Technology Stack:

    for FrontEnd : ReactJs is preferred as we use CSR approach. 
    for Client-Servier Communication we can Use Axios
    for back end we have capability to use any language or framework (NodeJs, SpringBoot , ...)
    for DB (PostgreSql, MongoDb)
    for caching (Redis)
    for inter-service communication we can use (REST, gRPC, Kafka)
    devOps: AWS services(), Docker, Datadog for monitoring
    security: Oath2, SSO(User Experience)

5. Cloud Infrastructure:
   AWS services(code build code commit , cloud watch, cloudformation, lambda, ECS, CDN, IAM...)
    
6. Scalability:
    AWS services(ECS, auto scalable features)
