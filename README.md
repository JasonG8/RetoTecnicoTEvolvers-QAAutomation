
# **RETO TECNICO T-EVOLVERS PARA QA AUTOMATION**

## Introducción 📖

Este repositorio contiene dos (2) carpetas donde cada una pertenece a un proyecto distinto:

1. ApiTestRetoTecnicoTEvolvers (Automatización de prueba de API)

2. WebTestRetoTecnicoTEvolvers (Automatización de prueba Web)

## Pre-requisitos 📋
- Java version 1.8 update 241 o superior y JDK (variables de entorno configuradas)
- IntelliJ IDEA  o Eclipse IDE  
- Maven version 6.0 o superior (variables de entorno configuradas)
- Cucumber

## Instalación 🛠️🔩

#### **1.ApiTestRetoTecnicoTEvolvers**

Esta prueba fue realizada con Karate Framenwork para la automatizacion de pruebas API. Basado en el lenguaje de comportamiento Gherkin, el cual simplifica la creacion de los casos de prueba para los diferentes EndPoints a probar, en este caso realizamos la prueba para los EndPoints: CreateBooking, GetBooking, UpdateBooking. Los cuales estan definidos en un archivo.feature por aparte con su respectivo escenario.

Para verificar su ejecucion realizamos los siguientes pasos:
1. Clonar el proyecto
2.  Desde el IDE IntelliJ (o VS) Abrir el proyecto en la ruta donde lo clonamos:
Ejemplo: C:\Users\UserExample\Desktop\RetoTEvolversQAAutomation\ApiTestRetoTecnicoTEvolvers

3. Ejecutar cualquiera de los archivos.feature:

		- CreateBooking.feature
		- GetBooking.feature
		- UpdateBooking.feature


#### **2.WebTestRetoTecnicoTEvolvers**

Para esta prueba utilice Serenity BDD Framenwork para la automatizacion de pruebas Web, implementando lenguaje Gherkin y haciendo uso de el patron de diseño ScreenPlay que se centra en las acciones que un usuario realiza en una aplicación y en cómo interactúa con los diferentes elementos de la interfaz de usuario, en este caso la compra de productos de un E-commerce llamado DemoBlaze.

Para verificar su ejecucion basta con  realizar los siguientes pasos:

1. Clonar el proyecto
2.  Desde el IDE IntelliJ (o VS) Abrir el proyecto en la ruta donde lo clonamos:
 - Ejemplo: C:\Users\UserExample\Desktop\RetoTEvolversQAAutomation\WebTestRetoTecnicoTEvolvers

3. Ejecutar el archivo BuyProductsRunner.java en la ruta:

  - WebTestRetoTecnicoTEvolvers/src/test/java/runners/BuyProductsRunner.java
  
## Autor ✒️👨🏻‍
 **©️ Jason David Guzman Gomez** - *Creación de proyecto.* - [jeison.0828@gmail.com]
