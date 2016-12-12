# 389TermProject
Project Contributors: Tiago Da Costa, Emily Fesnak, Ryan Hua, Kofi Dinizulu
# Installation
To setup this server, the JHTTP.java file contains the main class that runs the server. To start the server, run the JHTTP.java file. Authentication, RequestProcessor, cache and Words classes are all classes that must be included in the same package as the JHTTP file in order to run. The JHTTP file utilizes these classes to authenticate, cache and update the server.

In order to start the server, the user must include a file path to an html or web document as an initial argument. In this case, dummy sample html files are included with the project that you can use to test this server's capabilities. Extract the four html files to the same folder on a computer and use that file path as the argument. By default, the server will initially pull the index.html file from the folder at the end of the argument file path. The port parameter can be left blank so that it defaults to port 80. 

# Authentication
The user will be asked to authenticate himself before starting the server. If the user is signing in for the first time or does not have a username, he can select option 1 in the start menu and use the username "Administrator" and password "root". All usernames and passwords, except for Administrator, will be saved in the "Authentication.txt" file. If the user would like to create his own username and password, he can select option 2 fromthe start menu. After creating hisusername and password, the information will be saved in the Authentication file and he can use those to authenticate himself at any time in the future.

# Caching
