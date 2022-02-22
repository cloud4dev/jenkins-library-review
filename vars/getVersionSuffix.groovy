def call(Map config) {

    node {
         if (Map.isReleaseCandidate) {
            return config.rcNumber;
        } else {
            return config.rcNumber + 'ci' + env.BUILD_NUMBER;
        }
    }
    
}