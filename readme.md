# Camunda DMN Test

Exemple simple d'utilisation du moteur `dmn-scala` en mode `embed`. La définition des décisions est définie dans le fichier `resources/dish-decision.dmn11.xml` (exemple de base fourni par Camunda). Les variables sont les arguments d'exécution.

## Exécution

Exécution avec `sbt`

`run <season> <guestCount>`

* `season` est une des quatre saisons `Spring`, `Summer`, `Fall` ou `Winter`
* `guestCount` est un nombre entier

Le résultat est affiché dans la console

## Références

* [dmn-scala](https://github.com/camunda/dmn-scala)
* [DMN Engine embedded](https://github.com/camunda/dmn-scala/tree/master/dmn-engine#how-to-use-it)
* [Exemple Camunda](https://camunda.com/dmn/)
