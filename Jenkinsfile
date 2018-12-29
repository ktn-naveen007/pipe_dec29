pipeline { 
    agent { label 'Node_Ub' } 
    stages {
        stage('Build') { 
            steps { 
               checkout scm
            }
        }
        stage('compile'){
 steps { 
               sh '''

mvn compile

'''
            }
        }
        stage('Test'){
            steps {
                sh '''
                mvn test
                mvn exec:java -D"exec.mainClass"="com.sample.Basics.Addition"
                '''
            }
        }
    }
}

