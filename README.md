# Projet Spring Boot - Gestion des Postes et Compétences
Ce projet est une implémentation d'une architecture micro-service à l'aide de Spring Boot. Il vise à modéliser les différents postes existants dans le domaine de l'informatique en les associant à des compétences pertinentes.

## Travail effectué & Résultats 
### 1) Réalisation des deux services nécessaires 
J'ai commencé par développer le service "Position" permettant de récupérer et afficher tous les postes disponibles, ainsi que les détails d'un poste spécifique par son identifiant. Ensuite, j'ai mis en place le service "Skill" pour gérer les compétences, offrant la possibilité de récupérer et afficher toutes les compétences disponibles ou les détails d'une compétence spécifique par son identifiant.
#### Résultat 
![skills](https://github.com/MBDS-23-24/projet-evaluation-spring-BOUCHEFF-BADIS/assets/97994650/9450571e-0f98-4c3d-b576-c5a1f80ad0e7)

### 2) Création d’un lien entre les deux services en utilisant Open Feign
J'ai établi une connexion entre les deux services en utilisant Open Feign. Ainsi, chaque poste référence les compétences associées grâce à cette liaison, garantissant une intégration transparente entre les données de postes et de compétences.
#### Résultat 
![positions](https://github.com/MBDS-23-24/projet-evaluation-spring-BOUCHEFF-BADIS/assets/97994650/1c5ccafc-93a8-4192-be3b-83336ce182ac)

### 3) Respect des bonnes pratiques de développement (Services interface / Dtos / Mappers)
Pour assurer une meilleure maintenabilité du code, j'ai suivi les bonnes pratiques de développement. J'ai commencé par définir les DTOs (Data Transfer Objects) et les mappers pour la conversion entre les entités et les DTOs. Ensuite, j'ai mis en place les interfaces de services pour les deux services "Position" et "Skill".
#### Résultat 
c'est les memes résultats mais avec une bonne maniére de travail
### 4) Mise en place des services de Gateway et Discovery 
J'ai crée d'abord le service Gateway. Ensuite, j'ai configuré le service Discovery.
#### Résultat 
![eureka](https://github.com/MBDS-23-24/projet-evaluation-spring-BOUCHEFF-BADIS/assets/97994650/1d681bfa-cead-4658-8388-b66cf20b25ae)

### 5) Mise en place d’un Circuit Breaker 
J'ai implémenté un Circuit Breaker pour garantir la résilience du système.

### 6) Mise en place d’un service de Configuration 
J'ai configuré le service de Configuration pour centraliser et gérer les paramètres de configuration de manière dynamique. De plus, j'ai effectué des tests approfondis dans ce service pour garantir son bon fonctionnement et sa fiabilité.
#### Résultat 
![config](https://github.com/MBDS-23-24/projet-evaluation-spring-BOUCHEFF-BADIS/assets/97994650/0196ebda-415a-4055-950b-ffab9ed22ad4)
Aprés le changement de la valeur à 10
![refrechConfig](https://github.com/MBDS-23-24/projet-evaluation-spring-BOUCHEFF-BADIS/assets/97994650/492d964d-766e-4629-8434-e3e5c3db435d)


## Organisation du travail :

Chaque étape du projet a été réalisée dans une branche distincte, ce qui permet une gestion claire et organisée du développement. Voici les branches correspondant à chaque étape :

- Service Position : 1-1-position-service
- Service Skill : 1-2-skill-service
- Liaison entre les deux services avec Open Feign : 2-open-feign
- Bonnes pratiques pour le service Position : 3-1-best-practices-positions
- Bonnes pratiques pour le service Skill : 3-2-best-practices-skill
- Service Gateway : 4-1-gateway-service
- Service Discovery : 4-2-discovery-service
- Gateway Dynamique : 4-3-dynamic-gateway
- Circuit Breaker : 5-circuit-breaker
- Service de Configuration : 6-config-service
  
Cette approche permet de suivre facilement le développement de chaque fonctionnalité et de faciliter la gestion des versions du projet.

## Difficultés rencontrées :

Initialement, j'ai rencontré des problèmes de dépendances car j'avais commencé à travailler sur le projet existant directement cloné depuis le dépôt Git. Cela n'était pas une pratique recommandée. J'ai donc pris la décision de recommencer depuis le début en créant un nouveau projet, ce qui a entraîné une perte de temps significative.

De plus, mon ordinateur dispose de seulement 8 Go de RAM, ce qui a parfois entraîné des ralentissements et des bugs, ajoutant des obstacles supplémentaires à la progression du travail.

Heureusement, j'ai pu consacrer du temps supplémentaire ce week-end pour terminer le travail en cours. 

Je vous remercie pour le temps supplémentaire accordé et pour votre soutien.


