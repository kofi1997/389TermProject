# 389TermProject
Project Contributors: Tiago Da Costa, Emily Fesnak, Ryan Hua, Kofi Dinizulu
# Installation
To setup this server, the Term_Server Master branch is the main class file. Authentication, RequestProcessor and Words Class are all classes that must be included in the same package as the Term_Server file in order to run. All classes must belong to and reference the same package.

A file entitled "Authentication.txt" must be created in order to run the server. The file can be blank initially, but must exist for the server to authenticate a user before running.

In order to start the server, the user must run the program with the data path to a webpage as an argument. The port parameter can be left blank so that it defaults to port 80. The user will be asked to authenticate himself before accessing the server. If the user is signing in for the first time or does not have a username, he can use the username "Administrator" and password "root". All usernames and passwords, except for Administrator will be saved in the "Authentication.txt" file.
