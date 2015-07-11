This is a sample Spring MVC + REST (EXPOSE + CONSUME) + AUTH TOKEN POC Application


------------------------------------------------------------------
SPRING MVC- REST (EXPOSE) url's:
----------------------------------
http://localhost:8080/SpringRestExample/rest/emp/dummy         	(GET)
http://localhost:8080/SpringRestExample/rest/emps				(GET)
http://localhost:8080/SpringRestExample/rest/emp/create			(POST)
http://localhost:8080/SpringRestExample/rest/emp/{id}			(GET)
http://localhost:8080/SpringRestExample/rest/emp/delete/{id}	(PUT)


------------------------------------------------------------------
SPRING MVC- REST (CONSUME) :
----------------------------------
 Run the TestSpringRestExample.class
 
------------------------------------------------------------------
SPRING MVC- REST (EXPOSE)- AUTH TOKEN :
----------------------------------
http://localhost:8080/SpringRestExample/private/rest/emp/dummy  (GET)
Header param::: 
Authorization: Basic YWRtaW46YWRtaW4= 
userId/password:::: admin/admin
  for more details of using REST client for this example refer to Capture1.PNG in 
  /test/resources