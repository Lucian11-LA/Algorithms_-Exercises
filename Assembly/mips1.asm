.text
main:
    li $s0, 10       # Insere o valor 10 no registrador $s0
    li $s1, 17       # Insere o valor 17 no registrador $s1
    add $s2, $s1, $s0  # Soma o valor dos registradores $s0 e $s1 e insere no registrador $s2

    la $a0, ($s2)    # Coloca o valor do registrador $s2 para ser impresso
    li $v0, 1        # Comando de impressão de inteiro na tela
    syscall          # Efetua a chamada ao sistema

    li $v0, 10       # Comando de saída (exit)
    syscall          # Efetua a chamada ao sistema
