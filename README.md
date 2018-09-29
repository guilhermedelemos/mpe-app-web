# MPE App
[![Build Status](https://travis-ci.org/guilhermedelemos/mpe-app-web.svg?branch=master)](https://travis-ci.org/guilhermedelemos/mpe-app-web)

## Development

### Run

`$ grails`

`run-app`

or

`$ ./grailsw run-app`

or

`$ ./gradlew bootRun`

## Deploy

### Standalone

`$ grails package`

`$ java -Dgrails.env=prod -jar build/libs/mpe-app-web-0.0.1.war -server -Xmx768M -XX:MaxPermSize=256m`

## Versioning

See https://semver.org/

## GitFlow

See https://nvie.com/posts/a-successful-git-branching-model/