.data
    prompt1: .asciiz "Insira o primeiro n�mero: "
    prompt2: .asciiz "Insira o segundo n�mero: "
    result: .asciiz "A soma �: "

.text
main:
    # Solicita o primeiro n�mero
    li $v0, 4
    la $a0, prompt1
    syscall

    # L� o primeiro n�mero
    li $v0, 5
    syscall
    move $s0, $v0

    # Solicita o segundo n�mero
    li $v0, 4
    la $a0, prompt2
    syscall

    # L� o segundo n�mero
    li $v0, 5
    syscall
    move $s1, $v0

    # Calcula a soma
    add $s2, $s0, $s1

    # Exibe o resultado
    li $v0, 4
    la $a0, result
    syscall

    li $v0, 1
    move $a0, $s2
    syscall

    # Encerra o programa
    li $v0, 10
    syscall
