# Objectif:
Mettre en place un crud Product avec l'authentification qui se fait apr du Keycloak!!!
# Requirements
#Prérequis pour démarrer le projet :
Java 1.8 ou +
Maven 
Docker 

# Clone du projet
cmd> git clone https://github.com/sombregn/keycloak-_product_spring_mvc.git

# Apres acceder au projet et lancer la cmd suivante
cmd> docker compose up -d

# Build de l'App
cmd> mvn clean install

# Test App et les test
cmd> mvn spring-boot:run ou appuyer sur le btn run

# Rdv sur les urls suivants:
localhost:8092 pour App
localhost:8181 pour Keycloak

# NB: captures voir dossier captures
