pipeline {
    agent any

    tools {
        // Use Jenkins tool names that are actually configured
        jdk 'java_17_openjdk'
        maven 'Maven_3.8.1'
    }

    environment {
        // Set JAVA_HOME for... Maven
        JAVA_HOME = tool 'java_17_openjdk'
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkouta') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -Djansi.tmpdir=${env.WORKSPACE} clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn -Djansi.tmpdir=${env.WORKSPACE} test'
            }
        }
        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    // Ensure Maven uses Java 17 for compilation
    options {
        withEnv(["MAVEN_OPTS=-Djansi.tmpdir=$WORKSPACE"])
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            cleanWs()
        }
    }
}
