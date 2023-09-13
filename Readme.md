# Phonebook application in Java.

This Phonebook application stores the contact information of your friends and their phone number and helps you search throughout the data, including the phone number as well as the first and last names.

### Overview

The phonebook contains entries of contacts with a person's first and last names, one or more phone numbers, and a category assigned to each phone number.

Here is an example of two phonebook entries; each entry is separated by a 3-dashed line (---):

```sh
First name  : Harry
Last name   : Potter
MOBILE      : +374 55 123456
OFFICE      : +374 10 875803
HOME        : +374 10 689651
---
First name  : Sheldon
Last name   : Cooper
MOBILE      : +374 77 975892
OFFICE      : +374 11 573203
OFFICE      : +374 11 573204
---
First name  : Jon
Last name   : Snow
MOBILE      : +374 91 543216
```

The category of a phone number can be any of the MOBILE, OFFICE, and HOME. Note that we DO NOT restrict a person to have only one number per category as well as we DO NOT require a person to have a phone number for each of the categories. However, we limit each person to have at most 5 phone numbers in the Phonebook.

The Phonebook application works with data provided in a text file. Therefore, inserting phonebook entries is not part of the Phonebook application and is done simply by writing to a text file and placing it next to your application.

The application starts by asking for action from the user via the command line:

*** Phonebook Search Application ***

Choose your action:
1: Find by name
2: Find by number
> 1

Enter first or last name:
> Har

Record(s) found:
First names : Harry
Last names  : Potter
MOBILE      : +374 55 123456
OFFICE      : +374 10 875803
HOME        : +374 10 689651

*** Exit ***

As you noticed, the program searches either by first or last name and is able to search by partial tokens (e.g. Har qualifies for Harry and Harrison).

If there is more than one record that qualifies for the provided token ("Har" is a search token), all the matching records should be displayed.

It also possible to search for names by providing a phone number:

*** Phonebook Search Application ***

Choose your action:
1: Find by name
2: Find by number
> 2

Enter the phone number:
> +37411573203

Record found:
First name  : Sheldon
Last name   : Cooper
MOBILE      : +374 77 975892
OFFICE      : +374 11 573203
OFFICE      : +374 11 573204

*** Exit ***

Since a phone number can belong to only one person, searching by phone number return at most one result.


### DevOps Part

The repo contain a shell script that removes any compiled classes, and compiles the java source files. Extend the shell script that will execute a Java application that you have developed that will process it by writing output to new files.

It contains also a Dockerfile where the entry point command runs the mentioned script.So, when you run the docker container, that output is the same as script's output.


### Data Structures and Algorithms Part

It contains an implement a recursive function that determines whether the given array is sorted in descending order or not. The comments explain the code and  the complexity of the function.

Input: Array of numbers. Output: boolean.
Examples: IsDescending([6, 4, 3, 3, 1]) = true,  IsDescending([6, 4, 3, 4, 1]) = false

Loops are prohibited, recursion is used.

