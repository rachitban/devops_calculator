pipeline {

  environment{
    registry="bently5050/calc"
    registryCredential='dockerhub'
  }
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

   stage('Push Image'){
        steps{
	    logstash{
		script{
		     dockerImage=docker.build registry + ":latest"
		     docker.withRegistry('',registryCredential){
			 dockerImage.push()			
		    }		
		}
	   }
      }
   }

  stage('Deploy') {
        steps {
          script {
            step([$class: "RundeckNotifier",
                  includeRundeckLogs: true,
                  jobId: "c119f635-8b0c-48ea-9d2c-118764767cf1",
                  rundeckInstance: "Rundeck",
                  shouldFailTheBuild: true,
                  shouldWaitForRundeckJob: true,
                  tailLog: true])
          }
        }
    }
    
    }
}
