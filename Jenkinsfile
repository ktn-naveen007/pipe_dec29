pipeline { 
    environment{
    def status
    }
    agent { label 'Node_Ub' } 
    stages {
        stage('Build') { 
            steps { 
                echo'creating work space!!!'
               checkout scm
            }
        }
        stage('compile'){
 steps { 
     echo'compile phase'
               sh '''

mvn compile
archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
'''
  environment{
status = currentBuild.result
  }
            }
        }
        stage('Test'){
            steps {
                echo'testing phase'
                sh '''
                mvn test
                mvn exec:java -D"exec.mainClass"="com.sample.Basics.Addition"
                '''
            }
        }
    }
}

