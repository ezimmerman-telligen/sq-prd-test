pipeline {
    agent any
    stages {
        stage('Build & Test') {
            steps {
                checkout scm
                sh "mvn clean package"
                junit 'target/surefire-reports/*.xml'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
