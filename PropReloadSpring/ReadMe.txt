***********************************************************************
***********************************************************************
*****************AdminScreen for updating properties file**************
***********************************************************************
***********************************************************************

R1:
This app's main purpose was POC for updating properties file via web app.
Reloading the properties can be achieved in tomcat with below property(not tested)
	<Context reloadable="true">
       <WatchedResource>path/to/watched/resource</WatchedResource>
   </Context>
   
   ReloadPropJ7 app- POC of how to reload the properties on fly upon change in properties file.
   These both can able to make a good functionality of dynamic change and reload of properties for admin screen.
   
R2:
Implemented properties reload for message bundles- test success
TODO: Need to implement reloadable properties feature which updates beans 
(reloads the values from properties file) which are created by spring.   