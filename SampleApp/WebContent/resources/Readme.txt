****************************************************************
****************************************************************
**************Using Dynamic Logging Sample App *****************
****************************************************************
****************************************************************
This project has two POC features
1. Spring Task Schedular
		BY default POC feature1 (Spring Task schedular with Log4j ) is turned on.
	It will allow us to add new classes or packages with log level and update the 
	log levels on added ones. This feature won't allow to change already existed 
	predefined levels in the system.--works in some production kind of place 

2. Dynamic logging with Log4j version 1.2.X 
   (this feature is  by default active in log4j 2.X from jconsole for more details 
   refer to project mylog4j2.0)
   		To activate feature-2(only dynamic logging)- Just copy paste log4j-base.xml 
   	into log4j.xml and also comment the code related to spring task schedule 
   	in sample-servlet.xml

------------------------------------------------------------------------------
 Known issues: (Need to fix)
------------------------------------------------------------------------------
 Dynamic change of logging for system loaded ones is not working as expected.