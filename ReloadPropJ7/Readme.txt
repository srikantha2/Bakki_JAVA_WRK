**************************************************************************
**************************************************************************
*********************Reloadable Properties App****************************
**************************************************************************
**************************************************************************

Using java7 - WatchService feature we try to implement this reloadble prop
(for more info on it refer to http://howtodoinjava.com/2012/10/10/auto-reload-of-configuration-when-any-change-happen/)
Input:

c:/Temp/sample.properties
TEST_KEY=TEST_VALUE (modify the test_value to verify the reloadable functionality)


Output::
Refreshing the configuration.
TEST_VALUE
TEST_VALUE
Refreshing the configuration.
TEST_VALUE2
TEST_VALUE2
Refreshing the configuration.
Refreshing the configuration.
TEST_VALUE3
TEST_VALUE3
Refreshing the configuration.
Refreshing the configuration.
TEST_VALUE5
TEST_VALUE5
TEST_VALUE5
TEST_VALUE5
TEST_VALUE5