#!/usr/bin/env groovy
 
pipeline {
    //Agent é o NÓ que vai rodar o job
    agent any
 
    //Fases do pipeline
    stages {
        
       stage('Checkout') {
            steps {
                script {
                    git branch: 'master',
                        url: 'https://github.com/paulonill/exemplo-spring-mvc-thymeleaf.git'
                }
            }
        }
     }
}
