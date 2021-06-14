pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                export MAVEN_HOME=/opt/maven
                export PATH=$PATH:$MAVEN_HOME/bin
                sh 'mvn --version'
            }
        }
    }
}