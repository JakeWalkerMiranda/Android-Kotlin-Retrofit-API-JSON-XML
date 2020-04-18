package br.com.jwm.consumoapis

import org.simpleframework.xml.Element

/* Para utilizar o parser XML é necessário forçar o Kotlin a criar um construtor vazio através da anotação 'JvmOverloads',
* mapeando os parametros com as tags 'field' e 'param', já para ignorar alguns campos nulos que podem vir da requisição é
* necessario especificar através do 'required = false' */

/* Para utilizar o parser JSON não é necessario nenhuma anotação, a data class pode ser escrita normalmente */

data class CEP @JvmOverloads constructor(

    @field:Element(name = "cep")
    @param:Element(name = "cep")
    val cep: String?,

    @field:Element(name = "logradouro")
    @param:Element(name = "logradouro")
    val logradouro: String?,

    @field:Element(name = "complemento", required = false)
    @param:Element(name = "complemento", required = false)
    val complemento: String?,

    @field:Element(name = "bairro")
    @param:Element(name = "bairro")
    val bairro: String?,

    @field:Element(name = "localidade")
    @param:Element(name = "localidade")
    val localidade: String?,

    @field:Element(name = "uf")
    @param:Element(name = "uf")
    val uf: String?,

    @field:Element(name = "unidade", required = false)
    @param:Element(name = "unidade", required = false)
    val unidade: String?,

    @field:Element(name = "ibge", required = false)
    @param:Element(name = "ibge", required = false)
    val ibge: String?,

    @field:Element(name = "gia", required = false)
    @param:Element(name = "gia", required = false)
    val gia: String?
)