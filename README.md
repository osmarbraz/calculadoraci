[![Github Actions Status for osmarbraz/calculadoraci](https://github.com/osmarbraz/calculadoraci/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/calculadoraci/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadoraci&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_calculadoraci)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadoraci&metric=coverage)](https://sonarcloud.io/component_measures?id=osmarbraz_calculadoraci&metric=coverage)

# Calculadora com CI.
Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção

Pipeline 
- dev - Compilação 
- hmg - Compilação, Testes, Análise Código, Cobertura Código
- prd - Empacotamento

<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contêm os testes unitários do projeto utilizando JUnit 5.<br>
- A cobertura do código é realizada através do JaCoCo.<br>
- Virtualizado com Docker.
