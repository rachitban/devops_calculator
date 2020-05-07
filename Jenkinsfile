pipeline {
  agent any
  stages {
          
    stage('Clean') {
        steps{    
            logstash{
                sh 'mvn clean'
                echo "clean"
            }
        }
    }
        
    stage('Compile') {
        steps{
            logstash{
                sh 'mvn package'
                echo "compile"
            }
        }
    }
    stage('Test') {
        steps{    
            logstash {
                sh 'mvn test'
                echo "test"
            }
        }
    }
    
    stage('Build Image') {
        steps{    
            logstash {
                script{
                   def customimage=docker.build("myimage")
                }
            }
        }
    }
    
    }
}
