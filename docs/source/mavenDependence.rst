************************
Maven et ses dépendances
************************

Pourquoi maven?
***************

j'ai décidé de développer cette application avec maven afin de pouvoir récupérer quelque soit la plateforme de développement toutes les dépendances nécessaires à son bon focntionnement. Et ainsi rendre mon application déployable sur n'importe quel serveur.
Maven me permettra également de lancer les tests unitaires avec Junit.

Dépendances de maven
********************

il est a noté que toutes les dépendances ont été téléchargées sur le repository mvn.

De plus par défaut, à la création du projet Maven, nous avons les dépendances de Junit pour les Test et nous avons directement ajouter javax servlet pour les utiliser JSP 
ci dessous la liste de toutes les dependances dont nous avons besoins pour notre projet:

**Spring Web MVC** pour utiliser Spring dans la couche Vue

.. code-block:: xml

    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.8.RELEASE</version>

**Spring-jdbc** pour utiliser Spring avec notre bdd SQL

.. code-block:: xml

    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.8.RELEASE</version>

**Spring-orm** pour gérer nos classes entités a la bdd

.. code-block:: xml

    <!-- https://mvnrepository.com/artifact/org.springframework/spring-orm -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-orm</artifactId>
        <version>5.2.8.RELEASE</version>
    </dependency>

**Mysql** pour la connection avec la bdd SQL

.. code-block:: xml

    <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
    <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.21</version>
    </dependency>

**hibernate** pour la gestion du CRUD avec la JPA

.. code-block:: xml

    <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
    <dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.4.21.Final</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-c3p0 -->
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-c3p0</artifactId>
        <version>5.4.21.Final</version>
    </dependency>

    <dependency>
      <groupId>c3p0</groupId>
      <artifactId>c3p0</artifactId>
      <version>0.9.1.2</version>
    </dependency>
    
**servlet** pour la gestion des servlets 

.. code-block:: xml

    <!-- https://mvnrepository.com/artifact/javax.servlet.jsp.jstl/jstl-api -->
    <dependency>
        <groupId>javax.servlet.jsp.jstl</groupId>
        <artifactId>jstl-api</artifactId>
        <version>1.2</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.glassfish.web/javax.servlet.jsp.jstl -->
    <dependency>
        <groupId>org.glassfish.web</groupId>
        <artifactId>javax.servlet.jsp.jstl</artifactId>
        <version>1.2.1</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/javax.servlet.jsp.jstl/javax.servlet.jsp.jstl-api -->
    <dependency>
        <groupId>javax.servlet.jsp.jstl</groupId>
        <artifactId>javax.servlet.jsp.jstl-api</artifactId>
        <version>1.2.2</version>
    </dependency>

**autres dependances** pour la syntaxe ,grammaire, la modification de class en java et xml

.. code-block:: xml

    <dependency>
    <groupId>antlr</groupId>
    <artifactId>antlr</artifactId>
    <version>2.7.7</version>
    </dependency>

    <dependency>
    <groupId>net.bytebuddy</groupId>
    <artifactId>byte-buddy</artifactId>
    <version>1.10.14</version>
    </dependency>

    <dependency>
    <groupId>org.dom4j</groupId>
    <artifactId>dom4j</artifactId>
    <version>2.1.3</version>
    </dependency>

    <dependency>
    <groupId>com.sun.xml.fastinfoset</groupId>
    <artifactId>FastInfoset</artifactId>
    <version>2.0.0-M2</version>
    </dependency>
    
    <dependency>
    <groupId>com.mchange</groupId>
    <artifactId>mchange-commons-java</artifactId>
    <version>0.2.20</version>
    </dependency>
