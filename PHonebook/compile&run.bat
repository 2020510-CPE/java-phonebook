cd phonebook
javac CRUD_Interface.java
javac -d . CRUD_Interface.java
javac PhonebookApp.java
javac -d . PhonebookApp.java
javac JPhonebook.java
javac -d . JPhonebook.java
echo Main-Class: phonebook.JPhonebook > manifest.mf  
jar -cvfm JPhonebook.jar manifest.mf phonebook/ *.class
jar -cvfm ../JPhonebook.jar manifest.mf phonebook/ *.class    
cd ..
java -jar JPhonebook.jar
PAUSE
