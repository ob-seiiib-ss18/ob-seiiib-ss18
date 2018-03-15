pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'cd gradle-project && ./gradlew clean'
                sh 'cd gradle-project && ./gradlew compileJava'
            }
        }
        stage('Checkstyle') {
            steps {
                sh 'cd gradle-project && ./gradlew checkstyleMain'
            }
        }
        stage('Test') {
            steps {
                timeout(20) {
                  sh 'cd gradle-project && ./gradlew  test'
                }
            }
        }
    }
}
