# CanvasDraw
__Description__

Requirement
Write a simple program that can draw lines and rectangles on a canvas.
The program should support the following commands:
• C w h Should create a new canvas of width w and height h.
• L x1 y1 x2 y2 Should create a new line from (x1,y1) to (x2,y2). Currently only horizontal or
vertical lines are - supported. Horizontal and vertical lines will be drawn using the 'x'
character.
• R x1 y1 x2 y2 Should create a new rectangle, whose upper left corner is (x1,y1) and lower
right corner is (x2,y2). Horizontal and vertical lines will be drawn using the 'x' character.
• Q Should quit the program.
If there are any doubts, please make assumptions and proceed. The candidate should be prepared
to explain and possibly extend the implementation during the follow up interview. Please upload
the code on github and share the link.


__Sample Run__

enter command: C 20 4
--------------------
|                  |
|                  |
|                  |
|                  |
--------------------

enter command: L 1 2 6 2
--------------------
|                  |
|xxxxxx            |
|                  |
|                  |
--------------------

enter command: L 6 3 6 4
--------------------
|                  |
|xxxxxx            |
|     x            |
|     x            |
--------------------

enter command: R 16 1 20 3
--------------------
|             xxxxx|
|xxxxxx       x   x|
|     x       xxxxx|
|     x            |
--------------------

__Build__
To build the executable Jar, run the following maven command in the project root directory:
$ mvn clean package

It will create a jar Canvas.jar in <project root>/target directory.

__Run__
To run the program:
$ java -jar Canvas .jar
