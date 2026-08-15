pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn clean compile'
                    } else {
                        bat 'mvn clean compile'
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn test'
                    } else {
                        bat 'mvn test'
                    }
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn package'
                    } else {
                        bat 'mvn package'
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    if (isUnix()) {
                        // Run the JAR on Linux/macOS
                        sh 'java -jar target/HelloJenkins-1.0-SNAPSHOT.jar'
                    } else {
                        // Run the JAR on Windows
                        bat 'java -jar target\\HelloJenkins-1.0-SNAPSHOT.jar'
                    }
                }
            }
        }
    }
}

