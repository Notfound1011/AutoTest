pipeline {
  agent any
  stages {
    stage('maven') {
      steps {
        sh '/usr/local/apache-maven-3.6.3/bin/mvn clean test -Dtest=service.testcase.ctripHotel.TestCtripHotel'
      }
    }

  }
}