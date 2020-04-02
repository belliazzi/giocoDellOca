# giocoDellOca
software che simula gioco dell oca 

IDE eclipse 2018-19
java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)


 
funziona andando sulla classe main 

/GiocoDellOca/src/damiano/belliazzi/java/game/girooca/Main.java
tasto destro del mouse , run as --> java application 

default gioco automatico tra tre player di AI e lancio dadiu random 



Start
If there are two participants "Pippo" and "Pluto" on space "Start"
the user writes: "move Pippo 4, 2"
the system responds: "Pippo rolls 4, 2. Pippo moves from Start to 6"
the user writes: "move Pluto 2, 2"
the system responds: "Pluto rolls 2, 2. Pluto moves from Start to 4"
the user writes: "move Pippo 2, 3"
the system responds: "Pippo rolls 2, 3. Pippo moves from 6 to 11"
3. Win
As a player, I win the game if I land on space "63"

Scenarios:

Victory

If there is one participant "Pippo" on space "60"
the user writes: "move Pippo 1, 2"
the system responds: "Pippo rolls 1, 2. Pippo moves from 60 to 63. Pippo Wins!!"
Winning with the exact dice shooting

If there is one participant "Pippo" on space "60"
the user writes: "move Pippo 3, 2"
the system responds: "Pippo rolls 3, 2. Pippo moves from 60 to 63. Pippo bounces! Pippo returns to 61"
4. The game throws the dice
As a player, I want the game throws the dice for me to save effort

Scenarios:

Dice roll
If there is one participant "Pippo" on space "4"
assuming that the dice get 1 and 2
when the user writes: "move Pippo"
the system responds: "Pippo rolls 1, 2. Pippo moves from 4 to 7"
5. Space "6" is "The Bridge"
As a player, when I get to the space "The Bridge", I jump to the space "12"

Scenarios:

Get to "The Bridge"
If there is one participant "Pippo" on space "4"
assuming that the dice get 1 and 1
when the user writes: "move Pippo"
the system responds: "Pippo rolls 1, 1. Pippo moves from 4 to The Bridge. Pippo jumps to 12"
6. If you land on "The Goose", move again
As a player, when I get to a space with a picture of "The Goose", I move forward again by the sum of the two dice rolled before

The spaces 5, 9, 14, 18, 23, 27 have a picture of "The Goose"

Scenarios:

Single Jump

If there is one participant "Pippo" on space "3"
assuming that the dice get 1 and 1
when the user writes: "move Pippo"
the system responds: "Pippo rolls 1, 1. Pippo moves from 3 to 5, The Goose. Pippo moves again and goes to 7"
Multiple Jump

If there is one participant "Pippo" on space "10"
assuming that the dice get 2 and 2
when the user writes: "move Pippo"
the system responds: "Pippo rolls 2, 2. Pippo moves from 10 to 14, The Goose. Pippo moves again and goes to 18, The Goose. Pippo moves again and goes to 22"
7. Prank (Optional Step)
As a player, when I land on a space occupied by another player, I send him to my previous position so that the game can be more entertaining.

Scenarios:

Prank
If there are two participants "Pippo" and "Pluto" respectively on spaces "15" and "17"
assuming that the dice get 1 and 1
when the user writes: "move Pippo"
the system responds: "Pippo rolls 1, 1. Pippo moves from 15 to 17. On 17 there is Pluto, who returns to 15"


