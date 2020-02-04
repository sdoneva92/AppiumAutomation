# AppiumAutomation
Automation with Appium and TestNG

#Explanation

Currently in this project is used ApiDemos-debug-apk as resource from Appium, in order to start using POM(Page-Object-Model).
There are several things to follow:

#In the capabilities package:
In the BaseClass will be places methods need for the base setup of the DesiredCapabilities
The Caps class shouldn't be used, as it was only to identify the needed setup and identify some objects

#In the constants package:
There will be placed Constants needed for the project

#In the pages package:
Here will be placed classes, which are pages with the elements.

#In the logging package
Here are allowed only Listeners to improve the logging for the tests

#In the startPage package
Here are allowed tests for the Start Page of the App