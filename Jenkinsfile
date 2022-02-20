pipeline {
    agent any
    tools { 
        maven 'Maven 3.8.4' 
        jdk 'openjdk-11' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
		    mvn -version
		    java -version
                ''' 
            }
        }

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
                sh 'mvn -B -DskipTests clean package' 
            }
        }
		stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
		    archiveArtifacts artifacts: 'target/*.jar'
                }
            }
        }
    }
}
