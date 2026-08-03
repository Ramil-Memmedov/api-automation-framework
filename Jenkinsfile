pipeline {
    agent any

    environment {
        API_TOKEN = credentials('api-bearer-token')
    }

    tools {
        maven 'M3'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Environment Check') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('API Tests') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}