pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Ejecuta las pruebas con Maven
                    sh 'mvn clean test'
                }
            }
        }
        stage('Test Results') {
            steps {
                // Asegúrate de que esta ruta apunte a la ubicación de tus archivos de reporte
                junit '**/target/test-classes/*.xml'  // Ruta ajustada
            }
        }
    }
}
