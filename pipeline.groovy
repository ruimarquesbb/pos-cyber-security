#!/usr/bin/env groovy
 
pipeline {
    //Agent é o NÓ que vai rodar o job
    agent any
 
    //Fases do pipeline
    stages {
        
       stage('Checkout') {
            steps {
                script {
                   echo 'Fazer Checkout do projeto'
                   sh "ls -la"
                   sh "pwd"
                }
            }
        }
     }
}
