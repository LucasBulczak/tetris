pipeline {
    agent any
    }
    stages {
        stage('Build') { 
            steps {
              echo 'building app...'
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Test') {
            steps {
              echo 'testing app...'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
