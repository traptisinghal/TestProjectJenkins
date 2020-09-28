pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
		stage('SonarQube analysis') 
		{
		environment {
        scannerHome = tool 'SonarQubeScanner'
		}
		steps {
		  echo 'Sonarqube..'
		   
		
		 
    }
	}
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}