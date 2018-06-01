# news app


**Run the application on your local machine**

You can simply run the NewsApp.jar with following command:
```java -jar <any_folder>/news-app.jar```
The application will be available at the following address:
```http://localhost:8080```


**Develop the application**

Prerequisite

* Install Sencha CMD: add permissions to installer before installing: ```chmod 777``` and install it in folder eg.:
```/home/dominik/bin/Sencha/Cmd/6.5.3.6```
https://www.sencha.com/products/extjs/cmd-download/

* Install Ruby for SenchaCMD: ```apt-get install ruby2.3```
* (*) If you want to create other Ext projects: Download Ext JS 6.5.3 (https://www.sencha.com/products/extjs/evaluate/) and unzip it into any folder (eg. ```/home/dominik/ext-6.5.3/```)
* Make sure that the Ext JS version in news-app/client/workspace.json matches the downloaded Ext JS version
* Install Maven if you don't have it

1. Clone the repository
2.  ```cd news-app/client```

5. change the pom.xml property <sencha.cmd.path> if you installed Sencha Cmd in different path
5. In another shell ```cd news-app```
6. ```./mvnw spring-boot:run```
7. Open url http://localhost:8080 in a browser

**Run just the frontend**

1. Go to ```/client``` folder
2. Run ```sencha app watch```


**Build the application for production**

1. ```mvn clean install -Pproduction```

** Folders **

Backend is available in folder:

* src

Frontend (without ExjJs library files) is in:

* client/app
* client/classic/src