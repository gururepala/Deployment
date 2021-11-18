//Declarative pipeline
pipeline{
    agent any 
    stages{
        stage("Download file from S3 Bucket AWS server") {
            steps {
                    println "Downloading build code from S3"
            }
        }
        stage("copy file to tomcat") {
            steps {
                println "Deploying build code to tomcat server"
            }
        }
    }
}