# TP1 :Design Patterns

## Exercice 1 :
Créer les diagrammes de classes en mentionnant les designs patterns appropriés pour les situations
suivantes :

1- Une figure peut être soit un cercle, un rectangle ou un groupe de figures.

![img.png](Figure.png)

test

![img_1.png](img_1.png)

 ![img_2.png](img_2.png)

3- On dispose d’un composant implémentant une interface qui définir une opération « traitement() ». On voudrait rattacher à ce composant des responsabilités supplémentaires
sans modifier son code source. C'est-à-dire envelopper l’exécution de la méthode traitement par d’autres traitements avant et après son exécution.

![img_3.png](Decorateur.png)

test 

![img_3.png](img_3.png)



![img_4.png](img_4.png)

4- On désire créer une classe Joueur ayant un état représenté par une variable score de type int. On voudrait que les objets de l’environnement du jeu (Couloir, Caméra et Gardien) soient
informés à chaque fois que le score du joueur change tout en gardant un couplage faible entre la classe Joueur et les autres classes.
![img_5.png](Observer.png)

test

![img_5.png](img_5.png)

![img_6.png](img_6.png)