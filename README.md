# Input-Output Tasks
by Kwankaew Uttama

I ran the tasks on a Macbook Pro with 2.3Ghz i5, and got these results:

Task                                          | Time
----------------------------------------------|-------:
Read file 1-char at a time to String          |  1.079123 sec
Read file 1-char at a time to StringBuilder   |  0.005640 sec
Read file line at a time using BufferedReader |  0.026418 sec                                  

## Explanation of Results

String is immuable type.So when append the new character, It view create the new one everytime. Thus String is the lastest.
For StringBuilder and BufferedReader,They are muable type. But StringBuilder faster because of StringBuilder not syncronization.

