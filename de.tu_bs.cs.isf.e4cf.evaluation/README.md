# Generating Clones and Evaluating Clone Detection Tools

## Rough Plan
- [X] Super Simple Base Example
- [X] Transform into Generic Data Structure
- <Entry Point for Project 1>
- [X] Take a look at how to modify data structure (semantic)
- [X] How to create clones? -> Paper Taxonomy
- [X] Log Modifications to Trees -> OG Location, Clone Location (File:Line), Operations (Taxonomy)
- [X] How to save Tree
- [ ] How to determine nodes to clone
- [ ] Look into Taxonomy (What can we do just on nodes? What attributes do we need for the rest of the taxonomy?)
- ...
- [X] Determine Exchange Data Format [4Weeks] (FileSet<GenericDataStructures>, ..?)
  - Metadata as Log?
- <Entry Point for Project 2>
- ...

===== 16.06.2021
Seeds als Base-File
Repository of Cloneable Code
Empty nodes are great targets for duplication.
Nodes with Attributes are great candidates for cloning but respect their containment.
Xtend ok.


===== 23.06.2021
AttributeTypes (Keys): Welche gibt es auf generischer Ebene?
Ist die Tree Structure zu generisch? Wie kriegen wir konkrete sachen auf die wir arbeiten k�nnen?
Brauchen wir constraints? Allgemein/Dom�nenabh�ngig?
Nehmen wir den Java Parser wie er ist oder m�ssen wir ihn gegebenenfalls �ndern?
Warum nehmen wir den Java Parser um Tree-Structures zu erzeugen? Das ist v�llig biased. Ohne Grammatik f�r den Tree sind diese analysen nur pseudo-generisch.
-> Function Parameter sind Nodes aber Expressions sind Argument-Strings.
Wie wird entschieden was als Nodes und was als Attribute Values dargestellt wird?

Attribute haben nur einen Value (f�r uns)
Was ist Node was ist Attribut -> erstmal undefiniert. Alles was in java leaf ist in tree attribut.
Wir stellen passende constraints an die Datenstruktur passend zum Javaparser (sp�ter Ungereimtheiten in lessons learnt)
M�glicherweise Config f�r Generator (Welche Nodes d�rfen angefasst werden? Sprachausnahmen? Grammatik. Baumtyp)