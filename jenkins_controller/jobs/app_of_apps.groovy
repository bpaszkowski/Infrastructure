pipelineJob('app_of_apps') {
    parameters {
        stringParam('backendDockerTag', 'latest', 'Backend docker image tag')
        stringParam('frontendDockerTag', 'latest', 'Frontend docker image tag')
    }
 
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/bpaszkowski/App_of_apps")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}