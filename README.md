# 389TermProject
Project Contributors: Tiago Da Costa, Emily Fesnak, Ryan Hua, Kofi Dinizulu
# Installation
To setup this server, the JHTTP.java file contains the main class that runs the server. To start the server, run the JHTTP.java file. Authentication, RequestProcessor, cache and Words classes are all classes that must be included in the same package as the JHTTP file in order to run. The JHTTP file utilizes these classes to authenticate, cache and update the server.

In order to start the server, the user must include a file path to an html or web document as an initial argument. In this case, dummy sample html files are included with the project that you can use to test this server's capabilities. Extract the four html files to the same folder on a computer and use that file path as the argument. By default, the server will initially pull the index.html file from the folder at the end of the argument file path. The port parameter can be left blank so that it defaults to port 80. 

# Authentication
The user will be asked to authenticate himself before starting the server. If the user is signing in for the first time or does not have a username, he can select option 1 in the start menu and use the username "Administrator" and password "root". All usernames and passwords, except for Administrator, will be saved in the "Authentication.txt" file. If the user would like to create his own username and password, he can select option 2 from the start menu. After creating hisusername and password, the information will be saved in the Authentication file and he can use those to authenticate himself at any time in the future.

# Caching
In order to test the functionality of the cache connect to the running server by going to the localhost. once this is done accessing any file through the local browser tab will cause the requestprocessor to check the servers cache for a loaded version of the requested file. The results of these querys can be seen in the console for the main server program due to the logger in the cache class. with the current code if you do not access a page for about 30 seconds the logger should notify you of the deletion of the given file from the cache.

# Multithreading
Multithreading is implemented in this Java server through the add and remove methods for words in the dictionary. These methods operate using switches and while loops, while sorting methods utilize Collections. The functionality of this code can be tested be scanning the results of the operation in browser. The results of updates made to the word dictionary are printed to the browser. The user’s inputs are visible there. 

# HTTP Methods
The HTTP methods are implemented through the “Head” and “Post” classes. They can be used to retrieve the headers of a HTTP request, or send a new HTTP Post. Or through post to retrieve the body of the request. The “getHead” methods retrieves all the headers from a HTTP request and stores them in a map. And the “sendPost” method similarly sends a HTTP post method by connecting to a URL and sending a USER’s message. However, since the operations are all server sided the HTTP methods were not required to achieve functionality.

