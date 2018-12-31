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
       stage('deploy'){
           steps{
sh '''
mvn package
'''
stash includes: 'target/*.jar', name: 'test'

           }
       }

       stage('unstash'){

           steps{
               dir('unstash'){
                   unstash 'test'
               }

           }
       }
    }
}

