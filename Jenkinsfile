pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'cd gradle-prject && ./gradlew clean'
                sh 'cd gradle-prject && ./gradlew compileJava'
            }
        }
        stage('Checkstyle') {
            steps {
                sh 'cd gradle-prject && ./gradlew checkstyleMain'
            }
        }
        stage('Test') {
            steps {
                timeout(20) {
                  sh 'cd gradle-prject && ./gradlew  test'
                }
            }
        }
    }
}
