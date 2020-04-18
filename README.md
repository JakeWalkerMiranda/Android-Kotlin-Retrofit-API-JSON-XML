# Android-Kotlin-Retrofit-API-JSON-XML
Consumo de dados XML e JSON da API ViaCEP utilizando Retrofit2 e bibliotecas de parser (Simple XML e GSON) no Kotlin.

## ViaCEP

O ViaCEP é um webservice gratuito para consultar Códigos de Endereçamento Postal (CEP) do Brasil. Para saber mais sobre o serviço, acesse: http://viacep.com.br.

## Sobre o projeto

Esse projeto foi desenvolvido utilizando a biblioteca Retrofit 2 + Gson Converter + Simple XML Converter (apesar de depreciada esta biblioteca funciona bem, só não recebe atualizações).

- A versão do AndroidStudio utilizada foi a 3.4.
- Versão do SDK utilizada: Android API 29
- Versão mínima requerida: Android API 16

Ao abrir o App, você poderá consultar de duas formas, são elas:

- Consulta por CEP via XML;
- Consulta por CEP via JSON;

## Setup

Você deve adicionar e sincronizar os seguintes compile no Gradle a nível do App

## Usando o Gradle:

- implementation 'com.squareup.retrofit2:retrofit:2.3.0'
- implementation 'com.squareup.retrofit2:converter-gson:2.3.0'
- implementation 'com.squareup.retrofit2:converter-simplexml:2.3.0'

Posteriomente, este projeto será atualizado para as versões 2.6.0 do retrofit e 2.5.0 do Gson Converter.

## Licença

Esse projeto é livre!
