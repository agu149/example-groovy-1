node {
  try {
    stage('Checkout') {
      checkout scm
    }
    stage('Environment_Variable Set') {
      sh "export M2_HOME=/var/apache-maven-3.5.4"
      sh "export M2=$M2_HOME/bin"
      sh "export PATH=$M2:$PATH"
      sh "echo $M2_HOME"
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