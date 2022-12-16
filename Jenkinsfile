pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'Build'
        sh 'mvn clean install package'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploy'
      }
    }

  }
}