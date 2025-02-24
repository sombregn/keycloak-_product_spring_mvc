# Nom & Penom : Bah Alpha Souleymane M2 GL
# 🚀 Keycloak + Spring MVC: CRUD Product avec Authentification

Ce projet vise à mettre en place un CRUD (Create, Read, Update, Delete) pour la gestion de produits en utilisant **Spring MVC** et en sécurisant l'accès via **Keycloak** pour l'authentification.

---

## 📋 Table des matières
- [Objectif](#-objectif)
- [Prérequis](#-prérequis)
- [Installation](#-installation)
- [Lancement du projet](#-lancement-du-projet)
- [URLs d'accès](#-urls-daccès)
- [Captures d'écran](#-captures-décran)

---

## 🎯 Objectif
L'objectif de ce projet est de créer une application Spring MVC permettant de gérer des produits (CRUD) tout en intégrant une authentification sécurisée via **Keycloak**.

---

## 📦 Prérequis
Avant de commencer, assurez-vous d'avoir les éléments suivants installés sur votre machine :

- **Java 1.8** ou version +
- **Maven** pour la gestion des dépendances
- **Docker** pour lancer Keycloak et l'application

---

## 🛠 Installation

### 1. Cloner le projet
Commencez par cloner le dépôt GitHub sur votre machine locale :
- **git clone https://github.com/sombregn/keycloak-_product_spring_mvc.git**

### 2. Accéder au répertoire du projet
Accédez au répertoire du projet cloné :
- **cd keycloak-_product_spring_mvc**

### 3. Démarrer les services avec Docker
Lancez les services nécessaires (Keycloak et l'application) avec Docker Compose :
- **docker compose up -d**

🚀 Lancement du projet
### 1. Build de l'application
Compilez et construisez l'application avec Maven :
-**mvn clean install**

### 2. Lancer l'application
Démarrez l'application Spring Boot :
- **mvn spring-boot:run**
- **Vous pouvez également lancer l'application directement depuis votre IDE en appuyant sur le bouton Run.**

### 🌐 URLs d'accès
Une fois l'application lancée, vous pouvez accéder aux services via les URLs suivantes :
- **Application Spring MVC : http://localhost:8092**
- **Console d'administration Keycloak : http://localhost:8181**

### 📸 Captures d'écran
Pour visualiser des captures d'écran de l'application et de Keycloak, consultez le dossier captures dans le projet.

### 📝 Remarque
Assurez-vous que Docker est bien installé et en cours d'exécution avant de lancer les commandes docker compose up -d. Si vous rencontrez des problèmes, vérifiez les logs Docker pour plus d'informations.
