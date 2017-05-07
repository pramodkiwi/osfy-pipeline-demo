node('linux') {
  stage('Clean Start') {
    deleteDir()
  }

  stage('Prepare Workspace') {
    dir('demo-sources') {
      git url: '', branch: ''
    }
  }

  stage('Generate Binary') {
    dir('demo-sources') {
      sh "make pipimage"
    }
  }

  stage('Archive') {
  }

}
