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
		steps {
		 def scannerHome = tool 'SonarQubeScanner';
      
	  echo 'Sonarqube..'
		 
        withSonarQubeEnv('sonarqube') {
            bat "${scannerHome}/bin/sonar-runner.bat"
        }        timeout(time: 10, unit: 'MINUTES') {
            waitForQualityGate abortPipeline: true
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