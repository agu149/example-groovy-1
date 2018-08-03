node {
  tools {
    maven "Maven-3.5.4"
  } 
  try {
    stage('Checkout') {
      checkout scm
    }
    stage('Maven Clean') {
      echo "mvn clean"
    }
    stage('Maven Validate') {
      sh "mvn validate"
    }
    stage('Maven compile') {
      sh "mvn compile"
    }
    stage('Maven Install') {
      echo "mvn install"
    }
  } finally {
    stage('Cleanup Workspace') {
      deleteDir()
    }
  }
}
