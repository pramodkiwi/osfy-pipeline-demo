node {
  stage('Clean Start') {
    dir('demo-sources') {
      deleteDir()
    }
  }

  stage('Prepare Workspace') {
    dir('demo-sources') {
      git url: 'https://github.com/pramodkiwi/osfy-pipeline-demo.git', branch: 'master'
    }
  }

  stage('Generate Binary') {
    dir('demo-sources') {
      sh "make pipimage"
    }
  }

  stage('Archive') {
    dir('demo-sources') {
      archive excludes: '*.txt', includes: 'pipimage'
    }
  }

}
