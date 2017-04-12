Assessed Task

To practise writing code with an understanding of the Law of Demeter (and coupling), and to review several object-oriented concepts, consider the following exercise:

Consider the fictional children's tale of the Baudelaires, three children who need to be assigned to a new guardian, who is a family relative, after A Series of Unfortunate Events. The task of assigning the children to this guardian falls to a banker, Mr Poe, who is entrusted with the well-being of the children. Write a program to help Mr Poe make this selection, based on a number of different factors relating to the relatives, in this fictional scenario.

Below are further details of the problem:

Each relative of the Baudelaires is a person, who has a name and a level of friendliness.
Mr Poe is a banker; a type of person, with a friendliness of 5.
In his possession, Mr Poe, as a banker, has a list of relatives and their geographical distance from Mr Poe's home, where the Baudelaires are staying temporarily. Mr Poe, and other bankers with similar lists, insist on keeping this list in alphabetical order (for all current and any future relatives added to the list).
The list of relatives, and the distance of their homes from Mr Poe's, is as follows: Josephine, 100 miles; Olaf, 10 miles; Sir, 20 miles; Uncle Monty, 20 miles.
Mr Poe wishes to select the relative that lives closest to his home (incorrectly believing that this is the definition of `closest relative') as the new guardian for the Baudelaires. When he has done so, the children are moved to live with this relative, as indicated by a record Mr Poe keeps of the person with whom the Baudelaires are currently staying.
However, not all guardians are friendly, and this only becomes apparent once the Baudelaires have moved to live with a relative.
The friendliness of the Baudelaire's relatives is as follows: Josephine, friendliness 5; Olaf, friendliness -10; Sir, friendliness 0; Uncle Monty, friendliness 10.
Mr Poe judges a relative to be unfriendly if their level of friendliness is strictly less than his own. If Mr Poe identifies a guardian as unfriendly, he removes them from the list of relatives, and moves the children to their next geographically closest relative.
The process continues until the closest, friendly relative is found for the children to live with.

You should also consider the following:

Key events in the program: the children being moved to live with a guardian, a guardian being unfriendly, the children subsequently being moved to a new guardian, and finally reaching the closest friendly guardian, should be indicated using print statements.
It should be possible to derive suitable string representations of each object, which displays all of the information in the fields of that object.
Be sure not to break Demeter's Law in your solution.


