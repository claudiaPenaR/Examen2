pipeline {
    agent any  // Define el agente que ejecutará el pipeline. 'any' significa que puede ejecutarse en cualquier nodo.

    stages {
        // Etapa 1: Preparación del proyecto e integración con el repositorio remoto
        stage('Preparación del Proyecto') {
            steps {
                script {
                    // Clonar el repositorio desde GitHub
                    git url: 'https://github.com/claudiaPenaR/examen2.git', branch: 'master'

                    // También puedes agregar otras acciones de preparación si es necesario.
                }
            }
        }

        // Etapa 2: Construcción del proyecto
        stage('Construcción del Proyecto') {
            steps {
                script {
                    // Ejecutar un comando Maven para construir el proyecto
                    bat 'mvn clean install'  // Utiliza bat para ejecutar el comando Maven en Windows
                }
            }
        }

        // Etapa 3: Realización de pruebas y guardar resultados en un archivo XML
        stage('Pruebas') {
            steps {
                script {
                    // Ejecutar las pruebas unitarias y generar resultados en un archivo XML
                    bat 'mvn test'  // Utiliza bat para ejecutar las pruebas en Windows

                    // Archivar los resultados de las pruebas en formato XML
                    junit '**/target/test-*.xml'  // Asegúrate de que el patrón coincida con el archivo de resultados de tus pruebas.
                }
            }
        }
    }

    post {
        always {
            // Este bloque se ejecutará después de todas las etapas, independientemente de si el pipeline tuvo éxito o falló
            echo 'El pipeline ha terminado.'
        }
        success {
            echo 'El pipeline se ejecutó correctamente.'
        }
        failure {
            echo 'Hubo un error durante la ejecución del pipeline.'
        }
    }
}
