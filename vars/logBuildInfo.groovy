#!groovy

def call() {
    echo "BUILD_ID: ${env.BUILD_ID}";
    echo "BUILD_NUMBER: ${env.BUILD_NUMBER}";
    echo "JOB_NAME: ${env.JOB_NAME}";
}