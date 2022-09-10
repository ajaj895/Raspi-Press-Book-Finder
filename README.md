# Raspi-Press-Book-Finder
A tool to find/notify users on any newly released books from Raspberry Pi Press.

## About

This is a small Java program to notify you if there are any new books available from Raspberry Pi Press. This program requires a network connection to work and uses the JSoup webscraping library to check the Raspberry Pi Press website. This checks MagPi, HackSpace, Wireframe, and Custom PC for new books. 

## Author
Evan C.

## Usage 
This program can be run by running the RaspiPressBookFinder.jar in the **target** directory. You can run the following

``` java -jar path/to/project/Raspi-Press-Book-Finder/target/RaspiPressBookFinder-1.0-SNAPSHOT.jar ```

*Note:* If the program does not run on your architecture, you can recompile the program for your system by running maven package:

``` mvn package path/to/project/Raspi-Press-Book-Finder ```

### Dependencies

This program requires:

* Java 17
* JSoup 1.15.3
* Maven 3.8.1
