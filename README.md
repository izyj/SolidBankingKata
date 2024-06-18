# SolidBankingKata

En se servant d'un exemple d'un mini systeme bancaire, ce projet a pour but de montrer les principes S.O.L.I.D. 

#### S  :   Single responsability  principle (chaque entité du code (classe,méthode) ne doivent avoir qu'une seule raison d'etre modifié).

#### O  :  Open and Close principle    (une entité ne doit pas etre redefinissable a l'exterieur de son module, en revanche elle doit etre extensible).

#### L  :  Liskov substitution principle (le systeme de typage accepte que l'on puisse substituer l'usage d'une classe par une autre si le contrat initial reste rempli).

#### I  :  Interface segragation Principle Eviter d'ecrire des interface trop volumineuse.

#### D  :  Dependancy injection principle Les entités doivent dépendre des abstractions, pas des implémentations. Il indique que le module de haut niveau ne doit pas dépendre du module de bas niveau, mais qu’ils doivent dépendre des abstractions.


##### Exercice :

Your Task

Your bank is tired of its mainframe COBOL accounting software and they hired both of you for a greenfield project in - what a happy coincidence

your favorite programming language!
Your task is to show them that your TDD-fu and your new-age programming language can cope with good ole’ COBOL!

Requirements
Write a class Account that offers the following methods void deposit(int) void withdraw(int) String printStatement()

An example statement would be:

Date        Amount  Balance

24.12.2015   +500      500

23.8.2016    -100      400
