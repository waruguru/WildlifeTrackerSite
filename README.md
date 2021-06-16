# Wildlife_Tracker

### By Muriithi Joyce

## Description :notebook:

  This is a simple java application that allows Rangers to track wildlife sightings in a given area and tracks wildlife categories such as all the animals and the endangered ones


### Live Link
x-special/nautilus-clipboard
copy
file:///home/moringa/Desktop/wildlife1%20transfer/README.md


### Prerequisites

 * An up-to-date browser, preferably chrome or mozilla
 * Internet connection


### Technologies used

   * JAVA
   * Gradle
   * Spark
   * Postgres SQL
   * HTML
   * CSS & Bootstrap
   * Junit

### Installation guide :notebook:

  If you want to use this as your template, here's how to go about it:

  * Install Git on you machine
  * Maneouver to 'clone or download' button and get the link
  * --Linux Users-- open your terminal and run the 'git clone ...' command in a directory of your choice
  * --for Windows Users-- Navigate to the location you'd want the repository located, right click and select "git bash here"
  * Clone the repository
  * Upon completion, navigate to the cloned repository
  Feel free to edit the files to your prefered taste

  * Now build the Database to enable storing of created instances
  * Install Mysql
  * run the following commands in your terminal

        CREATE DATABASE wildlife_tracker;

        CREATE TABLE animals (id serial PRIMARY KEY, name varchar);

        CREATE TABLE sightings (id serial PRIMARY KEY, location varchar, rangerName varchar);

        CREATE DATABASE wildlife_tracker_test;

         CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;


### LICENSE
 This website is under the MIT license which can be found [HERE](LICENSE).
 Copyright (c) 2021 waruguru
