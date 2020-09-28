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
		   withSonarQubeEnv('sonarqube') {
            bat "${scannerHome}/bin/sonar-runner.bat"
        } 
		
		 
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