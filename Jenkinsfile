pipeline { 
  
    agent { label 'Node_Ub' } 

     parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
    stages {
        stage('Example') {
            steps {
                 echo "${params.Greeting} World!"
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            }
        }
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

'''
 
            }
        }
        stage('Test'){
            steps {
                echo'testing phase'
                sh '''
                export DISPLAY=:0

chmod +x ./Drivers/geckodriver
                mvn test
               // mvn exec:java -D"exec.mainClass"="com.sample.Basics.Addition"
                '''

                script {
def status = currentBuild.result
echo "$status"
  }
            }
        }
    }
}

