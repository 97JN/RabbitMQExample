# RabbitMQExample
RabbitMQ example, simple message between publisher and client

downaload RabbitMQ from docker using:
docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management

its default settings, so after going to localhost:15672 login using guest/guest
then create queue named = first
