# Bookmaster 4000mk II _(bookmaster4000mkii)_

[![standard-readme compliant](https://img.shields.io/badge/readme%20style-standard-brightgreen.svg?style=flat-square)](https://github.com/RichardLitt/standard-readme)
![](https://user-images.githubusercontent.com/1265382/40448070-b9726dbc-5ed4-11e8-8fcf-fe2139fac929.png)

> Improve your reading habits. Api to document your books read and your daily reading progress. Kotlin ❤ Spring ❤ json 

### Install

`$ mvn package` to compile, test and build

`$ mvn test` to execute unit tests separately.

**Dependencies**

* Apache Maven 3.5.x
* Kotlin 1.2.x
* Java 1.8.x

### Usage

`$ java -jar target/bookmaster4000mkii-[VERSION]-SNAPSHOT.jar`

You should see an output similar to this

```
...
2018-05-25 18:03:39.586   s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2018-05-25 18:03:39.591   c.b.Bookmaster4000mkiiApplicationKt      : Started Bookmaster4000mkiiApplicationKt in 3.535 seconds (JVM running for 4.09)
```

The app is now running on `localhost:8080/ ???`

### API

Find a description of the api endpoints under `$ src/main/kotlin/com/bantolomeus/controller/*`

### Maintainers

* [Bantolomeus](https://github.com/Bantolomeus)
* [Husterknupp](https://github.com/Husterknupp)

### Contribute

Please check the repo out, use it yourself and come back with feature requests/bug tickets 

Also on any open issue we would be happy to get some help. So far they're not labeled with a 'good for beginner' label.

Since this is also about learning Kotlin, please also leave remarks on the coding style used here (in form of comments on the commits or of opening issues).

### License

???