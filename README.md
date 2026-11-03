# Crafting Interpreters - Java (jlox)

Dieses Projekt ist eine direkte Implementierung des tree-walk Interpreters "jlox" **strikt nach der Anleitung des Buches** *"Crafting Interpreters"* von Robert Nystrom. Der Code basiert auf der Vorlage des Buches und dient mir als Lernprojekt für den Compilerbau. 

**Aktueller Stand:**
Bisher sind der lexikalische Scanner (inklusive der Buch-Challenge für C-Style Blockkommentare) und der Recursive Descent Expression Parser mit Error Recovery implementiert. Für den abstrakten Syntaxbaum (AST) habe ich die Architektur mit modernen Java-Features wie `sealed interfaces` und `records` umgesetzt.
