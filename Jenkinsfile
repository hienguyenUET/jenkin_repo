pipeline {
    agent any
    parameters {
        string(name: 'VERSION', defaultValue: '', description: 'version to deploy in product')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    tools {
        maven 'Maven'
        gradle
        jdk
    }
    environment {
        SERVER_CREDENTIAL = credentials('hiennguyen-secret-key')
    }
    stages {
        stage("build") {
            steps {
                echo 'building the application...'
                echo 'building version ${SERVER_CREDENTIAL}'
            }
        }

        stage("test") {
            when {
                expression {
                    parameters.executeTests == true
                }
            }
            steps {
                echo 'testing the application...'
            }
        }

        stage("deploy") {
            steps {
                echo 'deploying the application...'
                echo 'deploying ${parameters.VERSION}'
            }
        }
    }
}