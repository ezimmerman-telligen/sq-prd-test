pipeline {
    agent any
    tools {
        maven 'Maven_3.8.1'
    }
    stages {
        stage('Build & Test') {
            steps {
                echo 'Starting checkout...'
                checkout scm
                echo 'Checkout complete. Starting Maven build...'
                sh "mvn clean package"
                echo 'Maven build complete. Running tests and archiving artifacts...'
                junit 'target/surefire-reports/*.xml'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                echo 'Build & Test stage complete.'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                echo 'Preparing to start SonarQube analysis...'
                withSonarQubeEnv('SonarQube') {
                    echo 'SonarQube environment set. Running mvn sonar:sonar...'
                    sh 'mvn sonar:sonar'
                    echo 'SonarQube analysis complete.'
                }
            }
        }
    }
}