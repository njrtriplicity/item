pipeline {
    agent any
    environment {
        itemImage = ''
    }
    tools {
        maven 'maven-3.8.1'
        jdk 'jdk8'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    echo docker info
                '''
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage ('BuildDocker') {
            steps {
                   sh 'docker build --tag=item2:latest .'
            }
        }
        stage('Push image') {
            steps {
                    echo 'Starting to build docker image'
                    script {
                        def customImage = docker.build("my-image:${env.BUILD_ID}")
                        customImage.push()
                    }
            }
        }
    }
}