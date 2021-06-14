pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh export MAVEN_HOME=/opt/maven
                sh export PATH=$PATH:$MAVEN_HOME/bin
                sh 'mvn --version'
            }
        }
    }
}