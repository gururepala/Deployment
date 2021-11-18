//Declarative pipeline
pipeline {
    agent any 

    stages {
        stage("Cloning the code from GIT HUB") {
            steps {
                println "This is the stage where code gets cloned to jenkins machine"
            }
        }
        stage("Building the code") {
            steps {
                println "This is where code gets builds using commnd mvn clean package"
            }
        }
        stage("Uploading to S3 Bucket in AWS Instande") {
            steps {
                println "This is where build code will get uploaded to S3 bucket"
            }
        }
        stage("Deployment stage") {
            steps {
                println "This is where Build code gets deployed"
            }
        }

    }
}