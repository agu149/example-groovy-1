pipeline {
  agent {
    label ""
  }
  tools {
    maven "Maven-3.5.4"
  }
  stages {
    stage("Clean WS") { deleteDir() } 
    stage("Checkout") { checkout scm }
	stage('Maven Clean') { steps { sh "mvn clean" }}
	stage('Maven Validate') { steps { sh "mvn validate" }}
	stage('Maven compile') { steps { sh "mvn compile" }}
	stage('Maven Install') { steps { sh "mvn install" }}
}
