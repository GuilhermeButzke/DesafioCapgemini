# <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFMY7Gbah4wZm4kXXaTsGTfZ3y4ljjJaoxxjMovMf1tFw0tkJIkdT38JXVBYcoXhztYvI&usqp=CAU" width="50"> Desafio Capgemini

## 👨‍💻 Tecnologias Utilizadas
* Java 8
* JUnit 4

## 📑 Como executar
Para executar os algoritmos é necessário possuir o Java instalado na máquina local.
Levando em consideração, você pode efetuar os seguintes passos:

1. Realizar clone do repositório através do comando `git clone https://github.com/GuilhermeButzke/DesafioCapgemini.git`
2. No terminal local dentro do diretório do arquivo desejado, executar o comando `javac NomedoArquivo.java`

## ✔️ Testes Unitários
Os testes se encontram no diretório [`src/test`](https://github.com/GuilhermeButzke/DesafioCapgemini/tree/main/src/test)

# Desafio de Programação

## [Questão 1](https://github.com/GuilhermeButzke/DesafioCapgemini/blob/main/src/exercicios/GeraEscada.java)
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

### Exemplo
**Entrada**

<pre>n = 6
</pre>

**Saída**
<pre>
     *
    ** 
   ***
  ****
 *****
******
</pre>

## [Questão 2](https://github.com/GuilhermeButzke/DesafioCapgemini/blob/main/src/exercicios/VerificaSenha.java)
Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
* Possui no mínimo 6 caracteres.
* Contém no mínimo 1 digito.
* Contém no mínimo 1 letra em minúsculo.
* Contém no mínimo 1 letra em maiúsculo.
* Contém no mínimo 1 caractere especial. Os caracteres especiais são: **!@#$%^&*()-+**

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

### Exemplo
**Entrada**

<pre>Ya3
</pre>

**Saída**
<pre>3</pre>

## [Questão 3](https://github.com/GuilhermeButzke/DesafioCapgemini/blob/main/src/exercicios/AnaliseCombinatoria.java)
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

### Exemplo
**Entrada**

<pre>ovo</pre>

**Saída**
<pre>2</pre>

**Entrada**

<pre>ifailuhkqq
</pre>

**Saída**
<pre>3</pre>
