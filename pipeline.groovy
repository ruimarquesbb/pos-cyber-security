#!/usr/bin/env groovy
 
pipeline {
    //Agent é o NÓ que vai rodar o job
    agent any
 
    //Fases do pipeline
    stages {
        
       stage('Checkout') {
            steps {
                script {
                   echo 'Fazendo Build do projeto'
                   git branch: 'master',
                        url: 'https://github.com/paulonill/exemplo-spring-mvc-thymeleaf.git'
                   sh "ls -la"
                       }
                   }
                          }
       
       stage('unit-test') {
             steps {
                 script {
                    echo 'Fazendo teste do projeto'
                        }
                    }
                           }
     
        stage('deploy to stage') {
              steps {
                  script {
                     echo 'Fazendo Deploy to stage do projeto'
                         }
                     }
                          }
        
         stage('Acceptance test') {
                steps {
                   script {
                      echo 'Fazendo Acceptance test do projeto'
                          }
                      }
                            }
     }
}
